FROM gradle:8.11.1-jdk17 AS builder
WORKDIR /app

COPY build.gradle.kts settings.gradle.kts ./
COPY src ./src

RUN gradle bootJar --no-daemon

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
