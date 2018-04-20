// package: 
// file: worker.proto

var worker_pb = require("./worker_pb");
var grpc = require("grpc-web-client").grpc;

var Worker = (function () {
  function Worker() {}
  Worker.serviceName = "Worker";
  return Worker;
}());

Worker.GetWorkers = {
  methodName: "GetWorkers",
  service: Worker,
  requestStream: false,
  responseStream: false,
  requestType: worker_pb.Empty,
  responseType: worker_pb.WorkersModel
};

Worker.GetWorker = {
  methodName: "GetWorker",
  service: Worker,
  requestStream: false,
  responseStream: false,
  requestType: worker_pb.GetWorkerRequest,
  responseType: worker_pb.WorkerModel
};

Worker.PostWorker = {
  methodName: "PostWorker",
  service: Worker,
  requestStream: false,
  responseStream: false,
  requestType: worker_pb.WorkerModel,
  responseType: worker_pb.WorkerModel
};

exports.Worker = Worker;

function WorkerClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

WorkerClient.prototype.getWorkers = function getWorkers(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  grpc.unary(Worker.GetWorkers, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          callback(Object.assign(new Error(response.statusMessage), { code: response.status, metadata: response.trailers }), null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
};

WorkerClient.prototype.getWorker = function getWorker(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  grpc.unary(Worker.GetWorker, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          callback(Object.assign(new Error(response.statusMessage), { code: response.status, metadata: response.trailers }), null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
};

WorkerClient.prototype.postWorker = function postWorker(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  grpc.unary(Worker.PostWorker, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          callback(Object.assign(new Error(response.statusMessage), { code: response.status, metadata: response.trailers }), null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
};

exports.WorkerClient = WorkerClient;

