<template>
  <router-view />
</template>
<style>
* {
  padding: 0;
  margin: 0;
}

*::-webkit-scrollbar {
  width: 9px;
}

*::-webkit-scrollbar-track {
  background-color: #f2f2f2;
}

*::-webkit-scrollbar-thumb {
  background: rgb(0 0 0 / 20%);
  border-radius: 4px;
}

#root {
  position: relative;
  min-height: 100vh;
  padding-bottom: 290px;
}

.container {
  min-width: 1100px;
  max-width: 1640px;
  padding: 0 120px;
  margin: 0 auto;
}

@media screen and (width <= 1200px) {
  .container {
    padding: 0 60px;
  }
}
</style>