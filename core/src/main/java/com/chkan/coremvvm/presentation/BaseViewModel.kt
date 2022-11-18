package com.chkan.coremvvm.presentation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chkan.coremvvm.core.Dispatchers

abstract class BaseViewModel<T>(
    protected open val connect: Connect.Mutable<T>,
    private val dispatchers: Dispatchers
) : ViewModel(), Connect.Observe<T> {

    override fun observe(owner: LifecycleOwner, observer: Observer<T>) =
        connect.observe(owner, observer)

    protected fun <T> handle(
        block: suspend () -> T
    ) = dispatchers.launchBackground(viewModelScope) {
        block.invoke()
    }
}