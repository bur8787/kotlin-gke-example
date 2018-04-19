## Goal

Building an application using the following technology stack

Spring Boot / Kotlin / k8s (Google Kubernetes Engine) / CircleCI / RDB (Cloud SQL) / Cloud Endpoints / Firebase / gRPC

## IDE

```
IntelliJ IDEA 2017.3.5 (Ultimate Edition)
Build #IU-173.4674.33, built on March 6, 2018
Licensed to Takahiro Suzuki
Subscription is active until April 15, 2018
JRE: 1.8.0_152-release-1024-b15 x86_64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Mac OS X 10.13.3
```

## Spring Boot / Kotlin

Use example project  
https://github.com/JetBrains/kotlin-examples/tree/master/tutorials/spring-boot-restful

Document  
https://kotlinlang.org/docs/tutorials/spring-boot-restful.html

## k8s (Google Kubernetes Engine)

Run a Kotlin Spring Boot application on Google Kubernetes Engine  
https://cloud.google.com/community/tutorials/kotlin-springboot-container-engine

## CircleCI

Creating and Managing Service Account Keys
https://cloud.google.com/iam/docs/creating-managing-service-account-keys?hl=ja

Add the following roles to service account
TODO: minimize roles

- Cloud Container Builder
- Kubernetes Engine Admin
- Storage Admin
- Viewer

Deploying to Google Kubernetes Engine  
https://circleci.com/docs/2.0/google-container-engine/

Add the following environment variables in CircleCI

- GCLOUD_SERVICE_KEY
- GOOGLE_CLUSTER_NAME
- GOOGLE_COMPUTE_ZONE
- GOOGLE_PROJECT_ID

## Auth0

Spring Security Java API Authorization  
https://auth0.com/docs/quickstart/backend/java-spring-security/01-authorization

## Exposed

Sample project  
https://github.com/sdeleuze/geospatial-messenger

Blog  
https://spring.io/blog/2016/03/20/a-geospatial-messenger-with-kotlin-spring-boot-and-postgresql

## jOOQ

You can exclude the generated code from version control. But this project is including that.

generate source code

```
./gradlew generateWorkerJooqSchemaSource
```


etiennestuder/gradle-jooq-plugin
https://github.com/etiennestuder/gradle-jooq-plugin

Generate Kotlin data classes #6345
https://github.com/jOOQ/jOOQ/issues/6345

## gRPC

LogNet/grpc-spring-boot-starter
https://github.com/LogNet/grpc-spring-boot-starter

## Cloud SQL

Connect Kubernetes Engine
https://cloud.google.com/sql/docs/mysql/connect-kubernetes-engine

## Appendix

- https://github.com/keitaro1020/k8s-example
- https://kotlinlang.org/docs/tutorials/spring-boot-restful.html
- https://cloudplatform-jp.googleblog.com/2018/02/announcing-Spring-Cloud-GCP-integrating-your-favorite-Java-framework-with-Google-Cloud.html
