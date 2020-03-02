<template>
  <div>
    <h1>Projects</h1>
    <!-- {{ info }} -->

    <ul v-for="(test,da) in info" :key="da">
    <a v-bind:href=test.htmlUrl>{{ test.name }}</a>
    {{test.dateCreated}}
    {{test.dateLastUpdated}}
    {{test.languages}}
  </ul>

  </div>
</template>

<script>
export default {
  name: 'Projects' //  this is the name of the component
}
</script>
<style>
</style>

<script>
import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
Vue.use(VueAxios, axios)
export default {
  name: 'Projects',
  data () {
    return {
      info: null
    }
  },
  mounted () {
    axios.get('http://localhost:49160/api/hello', {
      headers: {
        Authorization: 'Basic dGVzdDpwYXNzd29yZA==' //  the token is a variable which holds the token
      }
    }).then(response => (this.info = response.data))
    // axios.get('http://joserod.space:49160/api/hello').then(response => (this.info = response))
  }
}
</script>
