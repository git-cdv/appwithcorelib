package com.chkan.coremvvm.presentation.adapter


interface ItemUi {

    fun type(): Int

    fun show(vararg views: MyView)

    fun id(): String

    fun content(): String
}