<template>
    <div class="columns is-desktop" id="content-container">
        <div class="column">1</div>
        <div class="column">2</div>
        <div class="column">3</div>
        <div class="column">4</div>
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
    background-color: azure;
    margin: 0px 5% 0px 5%;
    border-radius: 20px;
    z-index: -1;
    box-shadow: 1px 1px 10px grey;
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
