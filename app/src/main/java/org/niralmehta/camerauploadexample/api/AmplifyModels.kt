package org.niralmehta.camerauploadexample.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.niralmehta.camerauploadexample.API
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object AmplifyModels {
    var retrofitService: API
    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val logger = OkHttpClient.Builder().addInterceptor(interceptor).readTimeout(20, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS).build()

        val retrofit = Retrofit.Builder()
                .baseUrl("ModelAMply.1209.2130i24e0.:03999")
                .build()

        retrofitService = retrofit.create(API::class.java)


    }
}