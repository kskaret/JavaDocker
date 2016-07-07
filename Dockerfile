FROM java:8

ADD build/distributions/javadocker-1.0-SNAPSHOT.tar javadocker

CMD exec /javadocker/javadocker-1.0-SNAPSHOT/bin/javadocker
