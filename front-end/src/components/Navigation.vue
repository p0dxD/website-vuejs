<template>
  <div id="container">
    <nav>
      <div class="name">Jose Rodriguez</div>
      <router-link class="route_names spacing" v-for="routes in links"
      v-bind:key="routes.id"
      :to="`${routes.page}`">{{routes.text}}</router-link>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'Navigation',
  data () {
    return {
      links: [
        {
          id: 0,
          text: 'Home',
          page: '/Home'
        },
        {
          id: 1,
          text: 'About',
          page: '/About'
        },
        {
          id: 2,
          text: 'Contact',
          page: '/Contact'
        }
      ]
    }
  }
}
</script>

<style>
  nav {
    text-align: end;
  }
  .spacing {
    Margin-right: 10px;
    position: relative;
    top: -18px;
  }
  .name {
    text-align: left;
  }
</style>
