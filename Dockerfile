FROM java:8

ADD javadocker-1.0-SNAPSHOT.jar javadocker.jar

EXPOSE 8080

CMD exec java -jar javadocker.jar
