# Overview

This is a simple poc using [Jaeger] and [Micronaut]

# Setup

## [Jaeger]

1. Run the command `docker run -d --name=jaeger --net=host jaegertracing/all-in-one:latest`
2. Open the url `http://localhost:16686`

## [Consul]

1. Run the command `docker run -d --name=consul --net=host consul:latest`
2. Open the url `http://localhost:8500`

# Testing

1. Start `catalogue-service`
2. Start `inventory-service`
3. Start `recommendation-service`
4. Open the url `http://localhost:8081/recommendations`

[Jaeger]: https://www.jaegertracing.io
[Consul]: https://www.consul.io
[Micronaut]: https://micronaut.io
