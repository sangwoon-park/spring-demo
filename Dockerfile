FROM openjdk:11
RUN mkdir -p /tmp/appdir
COPY build/libs/*.jar /tmp/appdir/app.jar
ENTRYPOINT ["java","-jar","/tmp/appdir/app.jar"]