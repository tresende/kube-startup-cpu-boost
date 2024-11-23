# kube-startup-cpu-boost


1- build app image
```bash
docker build . -t tresende/calculator-api
```

2- run app image
```bash
docker run -p 8080:8080 --rm tresende/calculator-api
```

