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
    top: -135px;
    position: relative;
    background-color: azure;
    margin: 10px;
    border-radius: 20px;
    z-index: -1;
    box-shadow: 1px 1px 10px grey;
  }
</style>
