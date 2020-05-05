FROM maven:3.6-jdk-8-alpine as build
ADD ./ student/
WORKDIR /student
RUN mvn install 

FROM openjdk:8-jdk-alpine
COPY --from=build /student/target/docker201.jar docker201.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","docker201.jar"]
