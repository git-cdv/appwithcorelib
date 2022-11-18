package com.chkan.coremvvm.core

interface Matches<T> {

    fun matches(data: T): Boolean
}