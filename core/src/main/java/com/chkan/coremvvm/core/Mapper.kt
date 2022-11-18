package com.chkan.coremvvm.core

interface Mapper<S, R> {

    fun map(data: S): R

    interface Unit<T> : Mapper<T, kotlin.Unit>
}