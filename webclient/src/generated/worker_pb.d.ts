// package: 
// file: worker.proto

import * as jspb from "google-protobuf";

export class Empty extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Empty.AsObject;
  static toObject(includeInstance: boolean, msg: Empty): Empty.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Empty, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Empty;
  static deserializeBinaryFromReader(message: Empty, reader: jspb.BinaryReader): Empty;
}

export namespace Empty {
  export type AsObject = {
  }
}

export class WorkerModel extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getId(): number;
  setId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkerModel.AsObject;
  static toObject(includeInstance: boolean, msg: WorkerModel): WorkerModel.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkerModel, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkerModel;
  static deserializeBinaryFromReader(message: WorkerModel, reader: jspb.BinaryReader): WorkerModel;
}

export namespace WorkerModel {
  export type AsObject = {
    name: string,
    id: number,
  }
}

export class WorkersModel extends jspb.Message {
  clearWorkerList(): void;
  getWorkerList(): Array<WorkerModel>;
  setWorkerList(value: Array<WorkerModel>): void;
  addWorker(value?: WorkerModel, index?: number): WorkerModel;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WorkersModel.AsObject;
  static toObject(includeInstance: boolean, msg: WorkersModel): WorkersModel.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: WorkersModel, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WorkersModel;
  static deserializeBinaryFromReader(message: WorkersModel, reader: jspb.BinaryReader): WorkersModel;
}

export namespace WorkersModel {
  export type AsObject = {
    workerList: Array<WorkerModel.AsObject>,
  }
}

export class GetWorkerRequest extends jspb.Message {
  getId(): number;
  setId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetWorkerRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetWorkerRequest): GetWorkerRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetWorkerRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetWorkerRequest;
  static deserializeBinaryFromReader(message: GetWorkerRequest, reader: jspb.BinaryReader): GetWorkerRequest;
}

export namespace GetWorkerRequest {
  export type AsObject = {
    id: number,
  }
}

