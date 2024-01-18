package com.example.practies_app_firebase.util

sealed class Uistate<out T>{
    //Loading ,Success ,Failure

    object Loading:Uistate<Nothing>()

    data class Success<out T>(val data:T):Uistate<T>()

    data class Failure(val error:String):Uistate<Nothing>()
}
