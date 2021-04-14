package com.example.kotlinstudy.안드로이드_UI

// 안드로이드에서 화면을 그리는 방법
// - XML 을 이용한다
// - XML 은 뭘까
// - DSL Language -> Domain Specific Language
// - 안드로이드 UI 를 그리기 위해 특화된 언어이다


// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
// - 픽셀, dip, dp 단위
// - 픽셀 -> 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
// - dpi -> dot per inch
// 에를 들어 10픽셀의 선을 긋는 경우 ldpi 는 12개의 선으로 꽉채울 수 있다.
// 각기 다른 핸드폰의 인치가 다르므로 보이는게 달라진다
//      - ldpi -> 120 (1인치에 120픽셀)
//      - mdpi -> 160
//      - hdpi -> 240
//      - xhdpi -> 320
//      - xxhdpi -> 480
//      - xxxhdpi -> 640
// 그래서 단위를 통일 시켜야함 그래서 사용하는 단위 -> dp >> Density Independent Pixel
//          -  픽셀 독립적인 단위
// 어느 핸드폰에서나 똑같은 화면을 보여주고 싶다면 pixel 이 아니라 dp 단위를 사용해야 한다