FROM mysql:latest

RUN apt-get -o Acquire::Check-Valid-Until=false -o Acquire::Check-Date=false update && apt-get install -y curl unzip

ENV MYSQL_ROOT_PASSWORD=root-password

RUN mkdir -p /db

COPY . /db/

# will get executed on container startup
ADD scripts/setup.sql /docker-entrypoint-initdb.d/

EXPOSE 3306