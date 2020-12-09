FROM adoptopenjdk/maven-openjdk11
ENV KARATE_HOME /cucumber-report-demo

WORKDIR ${KARATE_HOME}
RUN mkdir ${KARATE_HOME}results

COPY . ${KARATE_HOME}
COPY ./run.sh ./run.sh
RUN chmod +x ./run.sh
