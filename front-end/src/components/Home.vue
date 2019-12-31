<template>
  <div>
    <span class="dot"></span>
    <h4 class="name-title">Software Engineer</h4>
    <ContentContainer/>
  </div>
</template>

<script>
import ContentContainer from './ContentContainer'
export default {
  name: 'Home',
  components: {
    'ContentContainer': ContentContainer
  },
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
  .dot {
    height: 200px;
    width: 200px;
    background-image: url("https://www.pngkey.com/png/detail/10-109089_google-logo-png-transparent-google-logo-round-png.png");
    border-radius: 50%;
    display: inline-block;
    background-size: 200px 200px;
  }
  .name-title {
    letter-spacing: 3px;
    text-transform: capitalize;
    padding: 10px;
    font-size: 15px;
  }
</style>
