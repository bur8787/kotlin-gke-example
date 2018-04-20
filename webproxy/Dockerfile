from golang:alpine as builder
RUN apk --no-cache add git
RUN go get -v -u github.com/golang/dep/cmd/dep
RUN go get -v github.com/improbable-eng/grpc-web/go/grpcwebproxy ; exit 0
RUN cd src/github.com/improbable-eng/grpc-web && dep ensure
RUN go get -v -u github.com/improbable-eng/grpc-web/go/grpcwebproxy

from alpine
EXPOSE 8080
RUN apk --no-cache add ca-certificates
WORKDIR /
COPY --from=builder /go/bin/grpcwebproxy .
CMD ["/grpcwebproxy", "--backend_addr=localhost:8080", "--run_tls_server=false"]
