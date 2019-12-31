<template>
  <div id="app">
    <Navigation/>
    <router-view/>
  </div>
</template>

<script>
import Vue from 'vue'
import Buefy from 'buefy'
import 'buefy/dist/buefy.css'
import Navigation from './components/Navigation'
Vue.use(Buefy)
export default {
  name: 'app',
  components: {
    'Navigation': Navigation
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
/* @media (prefers-color-scheme: dark) {
  body {
    background-color: black;
    color: white;
  }
}
@media (prefers-color-scheme: light) {
  body {
    background-color: white;
    color: black;
  }
} */
</style>
