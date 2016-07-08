FROM java:8

ADD javadocker-*.jar javadocker.jar

EXPOSE 8080

CMD exec java -jar javadocker.jar
