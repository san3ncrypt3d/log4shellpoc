
# Simple Spring Boot application vulnerable to CVE-2021-44228 (Log4Shell)



## Instructions

Run:

```bash
docker run --rm -p 8080:8080 --name log4shell-app ghcr.io/guerzon/log4shellpoc:latest
```

Or build and run:

```
docker pull san3ncrypt3d/log4shellapp
```

```bash
docker build . -t log4shellpoc
docker run --rm -p 8080:8080 --name log4shell-poc-app log4shellpoc
```
