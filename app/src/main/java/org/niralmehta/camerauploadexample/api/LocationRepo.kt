package org.niralmehta.camerauploadexample.api


import com.google.gson.annotations.SerializedName


class LocationRepo {
    @SerializedName("lat")
    var lat = ""

    @SerializedName("lng")
    var lng = ""

    @SerializedName("placeName")
    var placeName = ""
}
