package com.chkan.coremvvm.presentation

import androidx.annotation.StringRes
import com.chkan.coremvvm.R
import com.chkan.coremvvm.core.ManageResources
import com.chkan.coremvvm.data.HandleError
import com.chkan.coremvvm.domain.NoInternetConnectionException
import com.chkan.coremvvm.domain.ServiceUnavailableException


abstract class HandleUiErrorAbstract(
    private val manageResources: ManageResources,
    private val globalErrorConnect: GlobalErrorConnect.Update,
    private val handleError: HandleError =
        HandleGenericUiError(manageResources, globalErrorConnect)
) : HandleError {

    @StringRes
    protected open val noConnectionExceptionMessage: Int = R.string.no_connection_message

    @StringRes
    protected open val serviceUnavailableExceptionMessage: Int = R.string.no_service_message

    override fun handle(error: Exception): Exception {
        val messageId = when (error) {
            is NoInternetConnectionException -> noConnectionExceptionMessage
            is ServiceUnavailableException -> serviceUnavailableExceptionMessage
            else -> 0
        }
        return if (messageId == 0)
            handleError.handle(error)
        else {
            globalErrorConnect.map(manageResources.string(messageId))
            error
        }
    }
}

class HandleGenericUiError(
    private val manageResources: ManageResources,
    private val globalErrorConnect: GlobalErrorConnect.Update
) : HandleError {

    override fun handle(error: Exception): Exception {
        globalErrorConnect.map(manageResources.string(R.string.unexpected_error_message))
        return error
    }
}

class HandleUiError(
    manageResources: ManageResources,
    globalErrorConnect: GlobalErrorConnect.Update
) : HandleUiErrorAbstract(manageResources, globalErrorConnect)