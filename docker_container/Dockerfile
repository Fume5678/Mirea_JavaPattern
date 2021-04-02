# FROM anapsix/alpine-java
#CMD ["java","-jar","GradleLearn-1.0-SNAPSHOT.jar"]



FROM openjdk:17
LABEL Author Fume

RUN echo "Gradle jar"
COPY GradleLearn-1.0-SNAPSHOT.jar /GradleLearn-1.0-SNAPSHOT.jar
COPY MANIFEST.MF /MANIFEST.MF
CMD [ "java","-jar","GradleLearn-1.0-SNAPSHOT.jar" ]
