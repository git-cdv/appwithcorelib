package com.chkan.coremvvm.data


interface HandleError {

    fun handle(error: Exception): Exception
}