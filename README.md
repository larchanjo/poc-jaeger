# Overview

# Setup

## [Jaeger]

1. Run the command `docker run -d --name=jaeger --net=host jaegertracing/all-in-one:latest`
2. Open the url `http://localhost:16686`

## [Consul]

1. Run the command `docker run -d --name=consul --net=host consul:latest`
2. Open the url `http://localhost:8500`


[Jager]: https://www.jaegertracing.io/https://www.jaegertracing.io/
[Consul]: https://www.consul.io/