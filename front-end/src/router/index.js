import Vue from 'vue'
import Router from 'vue-router'

import Home from '@/components/Home'
import Projects from '@/components/Projects'
import Contact from '@/components/Contact'

Vue.use(Router)

export default new Router({
  linkExactActiveClass: 'is-active',
  routes: [
    { path: '/', redirect: '/home' },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/projects',
      name: 'Projects',
      component: Projects
    },
    {
      path: '/contact',
      name: 'Contact',
      component: Contact
    }
  ]
})
