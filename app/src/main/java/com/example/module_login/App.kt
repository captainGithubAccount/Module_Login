package com.example.module_login

import android.app.Application
import cn.leancloud.LeanCloud

import com.airbnb.lottie.Lottie
import cn.leancloud.LCObject




class App: Application() {
    override fun onCreate() {
        super.onCreate()
        // 提供 this、App ID、App Key、Server Host 作为参数
        // 注意这里千万不要调用 cn.leancloud.core.LeanCloud 的 initialize 方法，否则会出现 NetworkOnMainThread 等错误。
        LeanCloud.initialize(this,
            "NkrjjKS7CizSKhWCdMIyGInN-gzGzoHsz",
            "xoW4JY0yi9VGcHAKnWgIWPdQ",
            "https://nkrjjks7.lc-cn-n1-shared.com");

        //测试是否可以使用LeanCloud服务
       /* val testObject = LCObject("TestObject")
        testObject.put("words", "Hello world!")
        testObject.saveInBackground().blockingSubscribe()*/
    }
}