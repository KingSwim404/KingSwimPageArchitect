@Suppress("unused")
object AppLibsConfig {



    //==Android
    const val material = "com.google.android.material:material:1.3.0"
    //==Android


    //==AndroidX
    const val core = "androidx.core:core-ktx:1.3.2"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val constraint = "androidx.constraintlayout:constraintlayout:2.0.4"
    //==AndroidX



    //==Http

    const val rxHttp = "com.github.liujingxing.rxhttp:rxhttp:2.6.6"
    const val rxLifeCoroutine = "com.github.liujingxing.rxlife:rxlife-coroutine:2.1.0"
    //生成RxHttp类  kapt AppLibsConfig.rxHttpCompiler
    const val rxHttpCompiler = "com.github.liujingxing.rxhttp:rxhttp-compiler:2.6.6"


    const val okhttp3 = "com.squareup.okhttp3:okhttp:4.9.0"

    const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
    const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    const val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"
    //==Http


    //==RxJava
    const val rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.20"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    //==RxJava


    //==Json
    const val gson = "com.google.code.gson:gson:2.8.6"
    //==Json


    //==LoadImg
    const val coil = "io.coil-kt:coil:1.3.2"
    const val coilGif = "io.coil-kt:coil-gif:1.3.2"
    const val coilSvg = "io.coil-kt:coil-svg:1.3."
    const val coilVideo = "io.coil-kt:coil-video:1.3.2"
    //==LoadImg


    //==ThirdPartyUI
    const val customPopWindow = "com.github.pinguo-zhouwei:CustomPopwindow:2.1.1"
    const val multiType = "com.drakeet.multitype:multitype:4.3.0"
    //==ThirdPartyUI




    //==ThirdPartyLogic

    //模拟网络数据
    const val mock = "com.github.KingSwim404:KingSwimMock:1.0.1"

    //超强工具类：
    //https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/README-CN.md
    const val blankjUtil = "com.blankj:utilcodex:1.30.6"

    //==ThirdPartyLogic


    //==Test
    const val junit = "junit:junit:4.13.2"
    const val testExt = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    //==Test

}