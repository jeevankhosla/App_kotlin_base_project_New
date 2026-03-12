package com.example.connectapp.data.api

import com.example.connectapp.data.model.User
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*


interface ApiService {

//    @Header("Authorization") token: String,


    @Headers(Constants.HEADER_API)
    @POST
    suspend fun apiForRawBody(@Body data: HashMap<String, Any>, @Url url: String): Response<JsonObject>

    @Headers(Constants.HEADER_API)
    @FormUrlEncoded
    @POST
    suspend fun apiForFormData(
        @FieldMap data: HashMap<String, Any>,
        @Url url: String
    ): Response<JsonObject>

    @Headers(Constants.HEADER_API)
    @GET
    suspend fun apiGetOutWithQuery(@Url url: String): Response<JsonObject>

    @Headers(Constants.HEADER_API)
    @GET
    suspend fun apiGetWithQuery(@Url url: String, @QueryMap data : HashMap<String, String>): Response<JsonObject>



    @Headers(Constants.HEADER_API)
    @Multipart
    @JvmSuppressWildcards
    @POST
    suspend fun apiForPostMultipart(
        @Url url: String,
        @Header("Authorization") token: String,
        @PartMap data: Map<String, RequestBody>,
        @Part parts:MutableList<MultipartBody.Part>
    ): Response<JsonObject>

    @GET("users")
    suspend fun getUsers(): Response<List<User>>




}