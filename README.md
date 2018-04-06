## Goal

以下の技術スタックを使ったアプリケーションの構築

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

以下のサンプルプロジェクトを使う
https://github.com/JetBrains/kotlin-examples/tree/master/tutorials/spring-boot-restful

ドキュメント  
https://kotlinlang.org/docs/tutorials/spring-boot-restful.html

## k8s (Google Kubernetes Engine)

Run a Kotlin Spring Boot application on Google Kubernetes Engine  
https://cloud.google.com/community/tutorials/kotlin-springboot-container-engine

## CircleCI

サービス アカウント キーの作成と管理  
https://cloud.google.com/iam/docs/creating-managing-service-account-keys?hl=ja

サービスアカウントに以下の役割を付与。  
TODO: 付与する役割をもっと狭くする。

- Cloud Container Builder
- Kubernetes Engine 管理者
- ストレージ管理者
- 閲覧者

Deploying to Google Kubernetes Engine  
https://circleci.com/docs/2.0/google-container-engine/

CircleCI上で以下の環境変数を設定する

- GCLOUD_SERVICE_KEY
- GOOGLE_CLUSTER_NAME
- GOOGLE_COMPUTE_ZONE
- GOOGLE_PROJECT_ID

## Appendix

- https://github.com/keitaro1020/k8s-example
- https://kotlinlang.org/docs/tutorials/spring-boot-restful.html
- https://cloudplatform-jp.googleblog.com/2018/02/announcing-Spring-Cloud-GCP-integrating-your-favorite-Java-framework-with-Google-Cloud.html
