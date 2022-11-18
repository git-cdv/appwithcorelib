package com.chkan.coremvvm.domain

import com.chkan.coremvvm.data.HandleError
import java.net.UnknownHostException


class HandleDomainError : HandleError {

    override fun handle(error: Exception) =
        if (error is UnknownHostException)
            NoInternetConnectionException()
        else
            ServiceUnavailableException()
}