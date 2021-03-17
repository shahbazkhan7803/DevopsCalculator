FROM openjdk:8
COPY ./target/DevopsCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "DevopsCalculator-1.0-SNAPSHOT.jar", "Main"]