<template>
<div id="container-project">
  <div>
    <h1 class="titles">Projects</h1>
<div class="md-layout">
    <div class="md-layout-item md-xlarge-size-10 md-large-size-20 md-medium-size-33 md-small-size-50 md-xsmall-size-100" v-for="(test,da) in info" :key="da">
    <md-card md-with-hover>
      <md-ripple>
        <md-card-header>
          <div class="md-title"><a v-bind:href=test.htmlUrl>{{ test.name }}</a></div>
          <h3 class="subtitles">Last updated</h3>
          <div class="md-subhead">{{test.dateLastUpdated}}</div>
        </md-card-header>

        <md-card-content>
          <h3 class="subtitles">Technologies</h3>
            {{test.languages}}
        </md-card-content>
        <h3 class="subtitles">Date Created</h3>
        <div class="md-subhead">{{test.dateCreated}}</div>
      </md-ripple>
    </md-card>
  </div>
</div>
  </div>
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
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'

Vue.use(VueMaterial)

Vue.use(VueAxios, axios)
export default {
  name: 'Projects',
  data () {
    return {
      info: null
    }
  },
  mounted () {
    axios.get('https://joserod.space:49160/api/hello', {
      headers: {
        Authorization: 'Basic dGVzdDpwYXNzd29yZA==' //  the token is a variable which holds the token
      }
    }).then(response => (this.info = response.data))
    // axios.get('http://joserod.space:49160/api/hello').then(response => (this.info = response))
  }
}
</script>

<style>
 .md-card.md-with-hover {
    height: 98%;
    right: -3px;
 }
#container-project {
  top: -118px;
  position: relative;
}

 a {
    color: blueviolet;
}

.titles {
  color: #7c795d;
  font-family: 'Trocchi', serif;
  font-size: 45px;
  font-weight: normal;
  line-height: 48px;
  margin: 0;
}
.subtitles{
  color: #7c795d;
  font-family: 'Source Sans Pro', sans-serif;
  font-size: 15px;
  font-weight: 400;
  line-height: 32px;
}

.md-card .md-subhead {
    padding-bottom: 15px;
}
</style>
