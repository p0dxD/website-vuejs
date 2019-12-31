<template>
  <div>
    <h1>Home</h1>
    <p>This page is under construction as my previous one was destroyed!</p>
    <b-button @click="clickMe">Click Me</b-button>
  </div>
</template>

<script>
export default {
  name: 'Home',
  methods: {
    clickMe () {
      this.$buefy.notification.open('I do not do anything just testing!!')
    }
  }
}
</script>

<style>
  small {
    display: block;
  }
</style>
