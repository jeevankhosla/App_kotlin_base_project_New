package com.example.connectapp.data.api

import com.example.connectapp.data.model.User
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>

    suspend fun apiForRawBody(request:HashMap<String, Any>,url: String): Response<JsonObject>
    suspend fun apiForFormData(data: HashMap<String, Any>,url: String): Response<JsonObject>
    suspend fun apiGetOutWithQuery(url:String): Response<JsonObject>
//    suspend fun getDropDown(): Response<JsonObject>
    suspend fun apiGetWithQuery(data: HashMap<String, String>,url: String): Response<JsonObject>
//    suspend fun getCity(id: String): Response<JsonObject>
    suspend fun apiForPostMultipart(url: String,map: HashMap<String, RequestBody>,
                                 part: MutableList<MultipartBody.Part>): Response<JsonObject>

}