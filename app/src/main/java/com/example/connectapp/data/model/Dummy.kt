package com.example.connectapp.data.model

data class Experience(
    val companyName: String, val startDate: String, val endDate: String
)

data class Education(
    val id: String, val educationName: String

)

data class JobTitle(
    val id: String, val title: String

)
data class FilterStatus(
    val id: String, val title: String

)

data class ReviewData(
    val name : String, val image : String, val location : String , val rating : String , val description : String
)
data class NotificationData(
    val image : String, val notification : String, val date : String
)
data class FavoriteModel(
    var image : String , var name : String, var workName : String, var location : String, var isSelected: Boolean = false
    )
data class SettingModel(
    val image : String, var name : String
)

