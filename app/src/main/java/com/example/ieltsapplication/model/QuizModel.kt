package com.example.ieltsapplication.model

 class QuizModel (
    val title : String,
    val question : String,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    var expandable : Boolean = false
) {

 }