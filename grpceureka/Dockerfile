FROM adoptopenjdk/openjdk11 as builder

WORKDIR /app
ADD . .
RUN ./gradlew bootJar --no-daemon

FROM adoptopenjdk/openjdk11

COPY --from=builder /app/build/libs/grpceureka-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "grpceureka-0.0.1-SNAPSHOT.jar"]