<template>
    <div class="columns is-desktop" id="content-container">
        <div class="column">
          <p>My name is Jose and I graduated from Stony Brook University with a B.S. in Computer science and a minor in Spanish language and literature. Currently I work at Mastercard as a software engineer in the O&T division.
          My Work includes developing tools for automation and testing that make the end to end flow seamless and easy on the developer. Prior to that I worked developing and contributing to android applications.
          I enjoy learning about operating systems and low level programming and hope to obtain my masters in the near future on systems.
          Current project being worked on is an android application that will facilitate the way we pick what to eat throughout the day.
          Hobbies include working on personal projects involving Android, Java based applications as well as web projects.
          In my free time I enjoy running and exploring different towns/areas in hopes of finding new great food. </p>
        </div>
        <div class="column">Work in progress...</div>
    </div>
</template>

<script>
export default {
  name: 'ContentContainer'
}
</script>

<style>
  #content-container {
    /* border: dashed; */
    padding: 200px 0 0 0;
    top: -175px;
    position: relative;
    background-color: white;
    margin: 0px 5% 0px 5%;
    border-radius: 20px;
    z-index: -1;
    box-shadow: inset -2px 6px 20px 0px;
  }
@media screen and (max-width: 900px) and (min-width: 600px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -165px;
  }
}
@media screen and (max-width: 600px) and (min-width: 550px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -155px;
  }
}
@media screen and (max-width: 550px) and (min-width: 540px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -135px;
  }
}
@media screen and (max-width: 540px) and (min-width: 470px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -135px;
  }
}
@media screen and (max-width: 469px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -124px;
  }
}
@media screen and (max-width: 306px) {
  #content-container {
    padding: 200px 0 0 0;
    top: -135px;
  }
}
</style>
