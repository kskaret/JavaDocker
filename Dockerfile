FROM java:8

ADD javadocker-1.0-SNAPSHOT.tar javadocker

CMD exec /javadocker/javadocker-1.0-SNAPSHOT/bin/javadocker
