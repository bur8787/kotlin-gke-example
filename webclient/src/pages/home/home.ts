import {Component} from '@angular/core';
import {NavController} from 'ionic-angular';
import {Empty, GetWorkerRequest, WorkerModel} from "../../generated/worker_pb";
import {grpc} from "grpc-web-client";
import {Worker} from "../../generated/worker_pb_service";

@Component({
    selector: 'page-home',
    templateUrl: 'home.html'
})
export class HomePage {

    private host = "http://localhost:8080"
    private results: Array<string>
    private id: number
    private name: string
    private targetHostKey = "targetHost"

    constructor(public navCtrl: NavController) {
    }

    ionViewDidLoad(){
        this.host = localStorage.getItem(this.targetHostKey)
    }

    getWorkers() {
        const empty = new Empty()
        grpc.unary(Worker.GetWorkers, {
            request: empty,
            host: this.host,
            onEnd: res => {
                const {status, statusMessage, headers, message, trailers} = res
                if (status === grpc.Code.OK && message) {
                    this.addResult(message.toObject())
                }
            }
        })
    }

    getWorker() {
        const request = new GetWorkerRequest()
        request.setId(this.id)
        grpc.unary(Worker.GetWorker, {
            request: request,
            host: this.host,
            onEnd: res => {
                const {status, statusMessage, headers, message, trailers} = res
                if (status === grpc.Code.OK && message) {
                    this.addResult(message.toObject())
                }
            }
        })
    }

    postWorker() {
        const request = new WorkerModel();
        request.setName(this.name)
        grpc.unary(Worker.PostWorker, {
            request: request,
            host: this.host,
            onEnd: res => {
                const {status, statusMessage, headers, message, trailers} = res
                if (status === grpc.Code.OK && message) {
                    this.addResult(message.toObject())
                }
            }
        })
    }

    addResult(obj: Object) {
        if (this.results == null) {
            this.results = new Array<string>()
        }
        let date = new Date()
        let result = date.toLocaleString() + ": " + JSON.stringify(obj)
        this.results.push(result)
        this.saveTargetHost()
    }

    saveTargetHost(){
        localStorage.setItem(this.targetHostKey, this.host)
    }

    clear() {
        this.results = null
    }

}
