<template>
  <div>
    <div class="home_image"></div>
    <div id="personal-card">
      <span class="dot"></span>
      <h4 class="name-title">Software Engineer</h4>
      <a href="https://github.com/p0dxD"><font-awesome-icon :icon="['fab', 'github']" :size=icons_size /></a>
      <a href="https://www.instagram.com/p0doi/"><font-awesome-icon :icon="['fab', 'instagram']" :size=icons_size /></a>
      <a href="https://www.linkedin.com/in/jose-rodriguez-p0dxd/"><font-awesome-icon :icon="['fab', 'linkedin']" :size=icons_size /></a>
    </div>
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
  data () {
    return {
      icons_size: '2x'
    }
  },
  created () {
    window.addEventListener('resize', this.sizeHandler)
  },
  destroyed () {
    window.removeEventListener('resize', this.sizeHandler)
  },
  mounted () {
    this.sizeHandler('test')
  },
  methods: {
    clickMe () {
      this.$buefy.notification.open('I do not do anything just testing!!')
    },
    sizeHandler (e) {
      var w = window.innerWidth
      if (w < 540) {
        this.icons_size = '1x'
      } else {
        this.icons_size = '2x'
      }
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
    background-image: url("https://media.licdn.com/dms/image/C4E03AQGLKKA9_d_GaQ/profile-displayphoto-shrink_200_200/0?e=1583366400&v=beta&t=TS_C_E9vBdwWdNnDcHTJQqdNf8vkB4-zJlSPoqy3J-M");
    border-radius: 50%;
    display: inline-block;
    background-size: 200px 200px;
    box-shadow: 1px 1px 10px grey;
  }
  .name-title {
    letter-spacing: 3px;
    text-transform: capitalize;
    padding: 10px;
    font-size: 17px;
  }
  #personal-card {
    /* border: solid; */
    margin: 0% 25% 0% 25%;
    z-index: 100;
  }
.home_image {
    border: dashed;
    z-index: -10;
    position: absolute;
    width: 100%;
    height: 300px;
    top: 79px;
    background-image: url(https://demos.creative-tim.com/vue-material-kit-pro/img/city-profile.3b3fb65f.jpg);
}

@media screen and (max-width: 900px) and (min-width: 600px) {
  .dot {
    height: 180px;
    width: 180px;
    background-size: 180px 180px;
  }
  .name-title {
    font-size: 16px;
  }
}
@media screen and (max-width: 600px) and (min-width: 550px) {
  .dot {
    height: 160px;
    width: 160px;
    background-size: 160px 160px;
  }
  .name-title {
    font-size: 15px;
  }
}
@media screen and (max-width: 550px) and (min-width: 540px) {
  .dot {
    height: 140px;
    width: 140px;
    background-size: 140px 140px;
  }
  .name-title {
    font-size: 14px;
  }
}
@media screen and (max-width: 540px) and (min-width: 470px) {
  .dot {
    height: 120px;
    width: 120px;
    background-size: 120px 120px;
  }
  .name-title {
    font-size: 13px;
  }
}
@media screen and (max-width: 469px) {
  .dot {
    height: 110px;
    width: 110px;
    background-size: 110px 110px;
  }
  .name-title {
    font-size: 12px;
  }
}
@media screen and (max-width: 340px) {
  .name-title {
    font-size: 10px;
  }
}
</style>
