FROM openjdk:latest
ARG JAR_FILE=out/artifacts/crudapi_jar/crudapi.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
