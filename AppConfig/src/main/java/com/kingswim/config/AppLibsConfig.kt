package com.kingswim.config

object AppLibsConfig {

    object Android {

        const val material = "com.google.android.material:material:1.3.0"

    }

    object AndroidX {

        const val core = "androidx.core:core-ktx:1.3.2"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val material = "com.google.android.material:material:1.3.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.4"
    }

    object Http {

        const val okhttp3 = "com.squareup.okhttp3:okhttp:4.9.0"

        const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
        const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"

    }

    object RxJava {

        const val rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.20"
        const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    }

    object Json {

        const val gson = "com.google.code.gson:gson:2.8.6"

    }

    object LoadImg {

    }

    object ThirdPartyUI {

    }

    object ThirdPartyLogic {

        //模拟网络数据
        const val mock = "com.github.KingSwim404:KingSwimMock:1.0.1"

        //超强工具类：
        //https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/README-CN.md
        const val blankjUtil = "com.blankj:utilcodex:1.30.6"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val testExt = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    }


}