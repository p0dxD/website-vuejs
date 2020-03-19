# Personal website
## Contents
* Backend: server written in java using spring boot. Currently it can get data from my github account and displays it under --Projects-- within the website.
* Frontend: written in javascript using vue.js, css, and html. 
* Todo: Save data to database, add more data from the APIs exposed in backend.

The website is kept up using a Linode machine which runs both the servers in docker containers, separate from each other. 

The flow is as follow:
---

1) Changes are made and pushed.
2) [Jenkins pipeline](https://github.com/p0dxD/automation/tree/develop) picks up the code and checks for which project changed. 
3) It builds, test, restores credentials, pushes to docker, pulls on Linode and runs latest. 

The pipeline itself is made to work with any project, currently implemented with [subway](https://github.com/p0dxD/subway/tree/develop) and this project.

If anyone is interested in knowing more on the end to end flow I can be reached at jose0797@gmail.com