<template>
<div>
  <b-navbar toggleable="lg" type="dark" variant="primary">
    <b-navbar-brand href="#">STD</b-navbar-brand>

    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse id="nav-collapse" is-nav>
      <b-navbar-nav>
        <b-nav-item href="/about">about</b-nav-item>
      </b-navbar-nav>

      <!-- Right aligned nav items -->
    </b-collapse>
  </b-navbar>
</div>
</template>
<script>
export default {
    name : "Header",
};
</script>
