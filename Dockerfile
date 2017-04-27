FROM openjdk:alpine
COPY ./jsforms-0.0.1-SNAPSHOT.jar /usr/src/myapp/jsforms-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/myapp
RUN java -jar jsforms-0.0.1-SNAPSHOT.jar
CMD ["java", "Main"]
