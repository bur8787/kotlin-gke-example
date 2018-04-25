// package: 
// file: worker.proto

import * as worker_pb from "./worker_pb";
import {grpc} from "grpc-web-client";

type WorkerGetWorkers = {
  readonly methodName: string;
  readonly service: typeof Worker;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof worker_pb.Empty;
  readonly responseType: typeof worker_pb.WorkersModel;
};

type WorkerGetWorker = {
  readonly methodName: string;
  readonly service: typeof Worker;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof worker_pb.GetWorkerRequest;
  readonly responseType: typeof worker_pb.WorkerModel;
};

type WorkerPostWorker = {
  readonly methodName: string;
  readonly service: typeof Worker;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof worker_pb.PostWorkerRequest;
  readonly responseType: typeof worker_pb.WorkerModel;
};

export class Worker {
  static readonly serviceName: string;
  static readonly GetWorkers: WorkerGetWorkers;
  static readonly GetWorker: WorkerGetWorker;
  static readonly PostWorker: WorkerPostWorker;
}

export type ServiceError = { message: string, code: number; metadata: grpc.Metadata }
export type Status = { details: string, code: number; metadata: grpc.Metadata }
export type ServiceClientOptions = { transport: grpc.TransportConstructor }

interface ResponseStream<T> {
  cancel(): void;
  on(type: 'data', handler: (message: T) => void): ResponseStream<T>;
  on(type: 'end', handler: () => void): ResponseStream<T>;
  on(type: 'status', handler: (status: Status) => void): ResponseStream<T>;
}

export class WorkerClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: ServiceClientOptions);
  getWorkers(
    requestMessage: worker_pb.Empty,
    metadata: grpc.Metadata,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkersModel|null) => void
  ): void;
  getWorkers(
    requestMessage: worker_pb.Empty,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkersModel|null) => void
  ): void;
  getWorker(
    requestMessage: worker_pb.GetWorkerRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkerModel|null) => void
  ): void;
  getWorker(
    requestMessage: worker_pb.GetWorkerRequest,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkerModel|null) => void
  ): void;
  postWorker(
    requestMessage: worker_pb.PostWorkerRequest,
    metadata: grpc.Metadata,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkerModel|null) => void
  ): void;
  postWorker(
    requestMessage: worker_pb.PostWorkerRequest,
    callback: (error: ServiceError, responseMessage: worker_pb.WorkerModel|null) => void
  ): void;
}

