package com.chkan.coremvvm.presentation.adapter

import android.view.ViewGroup
import java.lang.IllegalStateException


interface ViewHolderFactoryChain<T : ItemUi> {

    fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<T>

    class Exception<T : ItemUi> : ViewHolderFactoryChain<T> {
        override fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<T> {
            throw IllegalStateException("unknown viewType $viewType")
        }
    }
}