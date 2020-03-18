<template>
  <div id="container">
    <nav>
      <div class="name">
        <h1>Jose Rodriguez</h1>
      </div>
      <b-tabs type="is-boxed" :position="nav_position" class="block">
        <b-tab-item>
          <template slot="header">
            <router-link id="route_names" v-bind:key="0" :to="`/Home`">
              <b-icon icon="home"></b-icon>
              <span class="route_text">Home</span>
            </router-link>
          </template>
        </b-tab-item>
        <b-tab-item>
          <template slot="header">
            <router-link id="route_names" v-bind:key="1" :to="`/Projects`">
              <b-icon icon="view-dashboard"></b-icon>
              <span class="route_text">Projects</span>
            </router-link>
          </template>
        </b-tab-item>
        <b-tab-item>
          <template slot="header">
            <router-link id="route_names" v-bind:key="2" :to="`/Contact`">
              <b-icon icon="account"></b-icon>
              <span class="route_text">Contact</span>
            </router-link>
          </template>
        </b-tab-item>
      </b-tabs>
    </nav>
  </div>
</template>

<script>
export default {
  name: "Navigation",
  data() {
    return {
      nav_position: "is-centered",
      links: [
        {
          id: 0,
          text: "Home",
          page: "/Home"
        },
        {
          id: 1,
          text: "Projects",
          page: "/Projects"
        },
        {
          id: 2,
          text: "Contact",
          page: "/Contact"
        }
      ]
    };
  },
  created() {
    window.addEventListener("resize", this.sizeHandler);
  },
  destroyed() {
    window.removeEventListener("resize", this.sizeHandler);
  },
  mounted() {
    this.sizeHandler("test");
  },
  methods: {
    sizeHandler(e) {
      var w = window.innerWidth;
      if (w < 469) {
        this.nav_position = "is-centered";
      } else {
        this.nav_position = "is-right";
      }
    }
  }
};
</script>

<style>
nav {
  text-align: end;
  position: relative;
  top: -15px;
}
.spacing {
  margin-right: 10px;
  position: relative;
  top: -18px;
}
.name {
  text-align: left;
  text-indent: 50px;
  letter-spacing: 3px;
  text-transform: capitalize;
  text-align: justify;
  font-size: 30px;
  position: relative;
  top: 35px;
  height: 50px;
}
#route_names {
  border-top: none;
  border-left: none;
  border-right: none;
}
#container {
  padding-bottom: 4em;
}

@media screen and (max-width: 900px) and (min-width: 600px) {
  .name {
    font-size: 20px;
    top: 40px;
  }
  .route_text {
    visibility: hidden;
    display: none;
  }
}
@media screen and (max-width: 600px) and (min-width: 550px) {
  .name {
    font-size: 15px;
    top: 45px;
  }
  .route_text {
    visibility: hidden;
    display: none;
  }
}
@media screen and (max-width: 550px) and (min-width: 540px) {
  .name {
    text-indent: 20px;
    font-size: 15px;
    top: 45px;
  }
  .route_text {
    visibility: hidden;
    display: none;
  }
}
@media screen and (max-width: 540px) and (min-width: 470px) {
  .name {
    text-indent: 20px;
    font-size: 15px;
    top: 45px;
  }
  .route_text {
    visibility: hidden;
    display: none;
  }
}
@media screen and (max-width: 469px) {
  .name {
    visibility: hidden;
  }
  .route_text {
    visibility: hidden;
    display: none;
  }
}
</style>
