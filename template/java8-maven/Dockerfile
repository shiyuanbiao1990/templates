FROM openjdk:8u121-jdk-alpine as builder

RUN apk --no-cache add curl \
    && addgroup -S app && adduser -S -g app app \
    && mkdir -p /opt/ && cd /opt/ \
    && echo "Downloading maven.." \
    && curl -SfL http://apache-mirror.rbc.ru/pub/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.zip -o apache-maven-3.6.0-bin.zip \
    && unzip apache-maven-3.6.0-bin.zip -d /opt/ \
    && rm apache-maven-3.6.0-bin.zip \
    && apk del curl

# Export some environment variables
ENV MAVEN_HOME=/opt/apache-maven-3.6.0/
ENV PATH=$PATH:$MAVEN_HOME/bin

RUN mkdir -p /home/app/libs

WORKDIR /home/app

COPY . /home/app/

Run mvn package

FROM openjdk:8u121-jdk-alpine as ship
RUN apk --no-cache add curl \
    && echo "Pulling watchdog binary from Github." \
    && curl -sSL https://github.com/openfaas-incubator/of-watchdog/releases/download/0.4.2/of-watchdog > /usr/bin/fwatchdog \
    && chmod +x /usr/bin/fwatchdog \
    && apk del curl

RUN addgroup -S app && adduser -S -g app app
WORKDIR /home/app
COPY --from=builder /home/app/entrypoint/target/entrypoint-bin.zip ./entrypoint.zip
RUN unzip ./entrypoint.zip

RUN chown -R app /home/app
USER app

ENV upstream_url="http://127.0.0.1:8080"
ENV mode="http"
ENV CLASSPATH="/home/app/entrypoint/*"

ENV fprocess="java -jar /home/app/entrypoint/entrypoint.jar"
EXPOSE 8025

HEALTHCHECK --interval=2s CMD [ -e /tmp/.lock ] || exit 1

CMD ["fwatchdog"]
