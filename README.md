# kube-startup-cpu-boost


1- build app image
```bash
docker build . -t tresende/calculator-api
```

2- run app image
```bash
docker run -p 8080:8080 --rm tresende/calculator-api
```

3- create deployment
```bash
k create ns calculator
k apply -f calculator-api-deployment.yaml
```

4- create service

```bash
k apply -f calculator-api-service.yaml
```

5- open dashboard
```bash
kubectl -n default port-forward svc/kubernetes-dashboard-1732394517-kong-proxy 8443:443
```

6- create token 
```bash
kubectl -n default create token admin-user 
```