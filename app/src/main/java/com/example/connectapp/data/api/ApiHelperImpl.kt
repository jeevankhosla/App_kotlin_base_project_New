package com.example.connectapp.data.api

import com.example.connectapp.data.model.User
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()
    override suspend fun apiForRawBody(request: HashMap<String, Any>,url:String): Response<JsonObject> {
        return apiService.apiForRawBody(request,url)
    }override suspend fun apiForFormData(data: HashMap<String, Any>,url: String): Response<JsonObject> {
        return apiService.apiForFormData(data,url)
    }override suspend fun apiGetOutWithQuery(url:String): Response<JsonObject> {
        return apiService.apiGetOutWithQuery(url)
    }override suspend fun apiGetWithQuery( data: HashMap<String, String>,url: String): Response<JsonObject> {
        return apiService.apiGetWithQuery(url,data)
    }
    override suspend fun apiForPostMultipart(url: String,map: HashMap<String, RequestBody>,
                                          part: MutableList<MultipartBody.Part>): Response<JsonObject> {
        return apiService.apiForPostMultipart(url,getTokenFromSPref(), map, part)
    }
    private fun getTokenFromSPref(): String {

        return "Bearer ${
            "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiNDhhZjRmMDM5ZjY2MDAzODI2ZTBlODg4NWY3NmIyOTliMTFkNGM1NTIwNjIzZTQxMWZlYzg5ZjRkYTg3ZWE5MWViY2I5ZTQzODhiODE0OTciLCJpYXQiOjE3MDMwNzg1NTAuNTUzNzU1OTk4NjExNDUwMTk1MzEyNSwibmJmIjoxNzAzMDc4NTUwLjU1Mzc2MDA1MTcyNzI5NDkyMTg3NSwiZXhwIjoxNzM0NzAwOTUwLjU0NzU0MDkwMzA5MTQzMDY2NDA2MjUsInN1YiI6IjU0Iiwic2NvcGVzIjpbXX0.Dvp3yTTC3YQt4MqmNrGZxfNeuz56fkUjmRMlEw_ZF150FFWe6iZOWvSg5N-7m1GpCcuEPE3Iyd3W3RL8GjJFbSkD7zz-kDn43B1AivwTa3yJXINrxwX2N-_1G1scOwtg8AmJN0p_1TR4lU7cuNTNtFomOzgcSQ-tl5IM5_12uuW_CMUY563HiOXlIbkQ3Ev3eMtPa9Ry6PSKqWw9fKMs64fuAc9FyoBWz52IvIMBnHdWyZ_zraFgA8MrI3mZz62Ov1_hgNGtCzX3oqwJ6V0lTvheNngxfL6UyKu1ngygk8llvODWgTxbxBlEbfo10b8y79UHgK3CK2bsBwLW-fihEI5gOtgE3VoVAkJDoEgOUmN74WNaN_SlFy0OQsmVvAuXEvQ2s8XXeDqRG7vFmW58VIcr4DfI9KSYEJ2veuaWnuwn047GeD3tz-DP8nHrekGvqtfXQAWklzENawrZTA_vlvVgvpn3qeL7xTKHkFRlmA_lEtjbG5afZgsy7q8LNhtivtRkCKLjZFHVWqZDXNOnGk0QSftYf21Goi0H5ecsTAv1EdoCJL1vJ9D-zvtDyPbA3De0XXOf7H_oMnfqwGk6yHSc2v1JuTvmYdOdufsXKE_Tp9_avjCS9V4U_qtBYeofRdx0abeKMHvhwNMv9R1wKTZ7ph7LpjQ6N_Psp0dHzTk"
        }"
    }
}