FROM node:lts-alpine

# install simple http server for serving static content
RUN npm install -g http-server

# make the 'app' folder the current working directory
WORKDIR /app

# # copy both 'package.json' and 'package-lock.json' (if available)
# COPY front-end/package*.json ./

# # install project dependencies
# RUN npm install

# # copy project files and folders to the current working directory (i.e. 'app' folder)
# COPY ./front-end/ .

# # build app for production with minification
# RUN npm run build

RUN addgroup -S local && adduser -S local -G local
USER local:local
ARG STATIC_FILES=dist/
COPY ${STATIC_FILES} dist/

EXPOSE 8080
CMD [ "http-server", "dist" ]
