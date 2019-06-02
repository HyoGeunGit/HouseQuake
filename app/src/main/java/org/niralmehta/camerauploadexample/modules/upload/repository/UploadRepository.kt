package org.niralmehta.camerauploadexample.modules.upload.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.jetbrains.anko.coroutines.experimental.bg
import org.niralmehta.camerauploadexample.api.ImgurService
import org.niralmehta.camerauploadexample.datakt.DataStatus
import org.niralmehta.camerauploadexample.modules.upload.datakt.ImagePayload
import org.niralmehta.camerauploadexample.utils.api.Resource
import retrofit2.Retrofit
import java.io.IOException
import javax.inject.Inject

class UploadRepository @Inject constructor(private val retrofit: Retrofit) {

    val imgurService by lazy {
        retrofit.create<ImgurService>(ImgurService::class.java)
    }

    fun uploadImage(clientId: String, image: ImagePayload): LiveData<Resource<DataStatus>> {
        val data = MutableLiveData<Resource<DataStatus>>()
        var resource: Resource<DataStatus>

        bg {
            try {
                val apiResponse = imgurService.postImageUpload(clientId, image).execute()

                resource = if (apiResponse.isSuccessful) {
                    Resource.success(apiResponse.body())
                } else {
                    Resource.error(apiResponse.message(), null)
                }

                data.postValue(resource)
            } catch (e: IOException) {
                resource = Resource.error("네트워크 노애미", null)
                data.postValue(resource)
            } catch (e: RuntimeException) {
                resource = Resource.error("문제인 노애미", null)
                data.postValue(resource)
            }
        }
        return data
    }

}