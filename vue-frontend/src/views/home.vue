<template>
  <div>
    <div class="home-card">
      <h1 class="title-home">Science of The Day</h1>
      <h5 class="mini-title-home">
        오늘의 과학은 흥미로운 주제들을 모아 당신에게 전달합니다.<br>
        최근 가장 떠오르는 연구들을 살펴보세요.
      </h5>
      <div style="margin-top:2rem">
        <b-button href = "/about" variant = "dark">더 알아보기</b-button>
      </div>
    </div>
    <div class="home-contents">
      <h1>
        오늘의 키워드
      </h1>
      <div>
        <b-container fluid>
          <b-row>
            <b-col>
              <p>abcdef</p>
            </b-col>
            <b-col>
              <p>abcdef</p>
            </b-col>
            <b-col>
              <p>abcdef</p>
            </b-col>
          </b-row>
        </b-container>
      </div>
    </div>
  </div>
</template>
<script>

export default {
    name : "Home",
};
</script>
<style>
.white-font {
  color : white;
}
.home-card {
  padding : 3rem;
  background-color: #007bff;
}
.title-home {
  font-size: 4rem;
  color : white;
}
.mini-title-home {
  font-size: 25px;
  margin-top : 2rem;
  color : white;
  font-family: 'Times New Roman', Times, sans-serif;
}
.text-anime {
  animation:1200ms show;
}
.home-contents {
  padding : 2rem;
}
</style>
