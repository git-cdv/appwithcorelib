package com.chkan.coremvvm.presentation.adapter

import android.view.View
import androidx.annotation.DrawableRes


interface MyView {

    fun show(text: CharSequence) = Unit

    fun show(textId: Int) = Unit

    fun loadImage(url: String) = Unit

    fun showImageResource(@DrawableRes id: Int) = Unit

    fun enable(enabled: Boolean) = Unit

    fun check(checked: Boolean) = Unit

    fun handleClick(listener: View.OnClickListener) = Unit
}