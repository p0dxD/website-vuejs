VERSION="1.0.1"
docker build -f Dockerfile -t p0dxd/website-backend:$VERSION .
docker push p0dxd/website-backend:$VERSION
docker run -p 49160:8080 -d p0dxd/website-backend:$VERSION