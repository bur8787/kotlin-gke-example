# gRPC Web Client Tool

## install

```
npm install -g ionic cordova
```

## start

```
ionic serve
```

## update gRPC

```
PROTOC_GEN_TS_PATH="./node_modules/.bin/protoc-gen-ts"

OUT_DIR="./src/generated"

protoc \
    --plugin="protoc-gen-ts=${PROTOC_GEN_TS_PATH}" \
    --js_out="import_style=commonjs,binary:${OUT_DIR}" \
    --ts_out="service=true:${OUT_DIR}" \
    --proto_path="../protofiles" \
    worker.proto
```
