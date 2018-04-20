import {Component} from '@angular/core';
import {NavController} from 'ionic-angular';
import {Empty} from "../../generated/worker_pb";
import {grpc} from "grpc-web-client";
import {Worker} from "../../generated/worker_pb_service";

@Component({
    selector: 'page-home',
    templateUrl: 'home.html'
})
export class HomePage {

    constructor(public navCtrl: NavController) {

    }

    getWorkers() {
        console.log("log: getWorkers: start")
        const empty = new Empty();
        grpc.unary(Worker.GetWorkers, {
            request: empty,
            host: "http://localhost:8080",
            onEnd: res => {
                const {status, statusMessage, headers, message, trailers} = res;
                if (status === grpc.Code.OK && message) {
                    console.log("all ok. got book: ", message.toObject());
                }
            }
        })
        console.log("log: getWorkers: end")
    }
}
