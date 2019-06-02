package org.niralmehta.camerauploadexample


import org.niralmehta.camerauploadexample.api.LocationRepo
import retrofit2.Call
import retrofit2.http.*

interface API {

    @GET("/place")
    fun getPlace() :  Call<ArrayList<LocationRepo>>

    @POST("/signin")
    @FormUrlEncoded
    fun logIn(@Field("id") id : String, @Field("pw") pw : String) :  Call<Void>

    @POST("/signup")
    @FormUrlEncoded
    fun logUp(@Field("name") name : String, @Field("id") id : String, @Field("pw") pw : String) :  Call<Void>

}