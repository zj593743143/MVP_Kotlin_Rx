package com.example.jojo.mvp_kotlin

import android.app.Application
import com.zhy.http.okhttp.OkHttpUtils
import com.zhy.http.okhttp.log.LoggerInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by JoJo on 2018/3/28.
 * wechat:18510829974
 * description:
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        var okhttpClient = OkHttpClient().newBuilder()
                .addInterceptor(LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .build()
        OkHttpUtils.initClient(okhttpClient)
    }
}