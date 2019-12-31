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
    border: dashed;
    padding: 200px 0 0 0;
    top: -100px;
    position: relative;
  }
</style>
