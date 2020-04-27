VERSION="1.0.1"
docker build -f Dockerfile -t p0dxd/website-backend:$VERSION .
docker push p0dxd/website-backend:$VERSION
docker run -p 49160:8080 -d p0dxd/website-backend:$VERSION


docker run -p 49160:49160 -e GITHUB_TOKEN=$GITHUB_TOKEN -e KEYSTORE_ALIAS=$KEYSTORE_ALIAS -e KEYSTORE_PASSWORD=$KEYSTORE_PASSWORD -d p0dxd/website-backend:1.0.1

/etc/nginx/sites-enabled/default
/etc/nginx/sites-available/default
/etc/default
/etc/calendar/default
/etc/dpkg/origins/default

sudo ls /etc/ssl/private/

 ls /etc/ssl/certs/
ls /etc/ssl/certs/

openssl pkcs12 -export -out certificate.p12 -inkey joserod.space.key -in certificate.crt -certfile CACert.crt

openssl pkcs12 -export -in  joserod.space.csr  -inkey joserod.space.key -out joserod.space.pfx

 joserod.space.csr  joserod.space.key

 scp p0dxd@162.216.18.246:/home/p0dxd/baeldung.p12 .
