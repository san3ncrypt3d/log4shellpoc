
# Simple Spring Boot application vulnerable to CVE-2021-44228 (Log4Shell)



Or build and run:

```
docker pull san3ncrypt3d/log4shellapp
```

```bash
docker build . -t log4shellpocapp
docker run --rm -p 8080:8080 --name log4shell-app log4shellpocapp
```
