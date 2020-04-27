FROM node:lts-alpine

# install simple http server for serving static content
RUN npm install -g http-server

# make the 'app' folder the current working directory
WORKDIR /app

RUN addgroup -S local && adduser -S local -G local
USER local:local
ARG STATIC_FILES=dist/
COPY ${STATIC_FILES} dist/

EXPOSE 8080
CMD [ "http-server", "dist" ]
