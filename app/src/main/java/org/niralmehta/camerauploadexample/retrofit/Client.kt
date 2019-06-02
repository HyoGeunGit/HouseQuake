package org.niralmehta.camerauploadexample.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.niralmehta.camerauploadexample.API
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object Client {
    var retrofitService: API
    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val logger = OkHttpClient.Builder().addInterceptor(interceptor).readTimeout(20, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS).build()

        val retrofit = Retrofit.Builder()
                .baseUrl("18.216.35.116:3000")
                .client(logger)
                .build()

        retrofitService = retrofit.create(API::class.java)


    }
}