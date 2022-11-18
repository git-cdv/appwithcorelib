package com.chkan.coremvvm.presentation


interface GlobalErrorConnect {

    interface Observe : Connect.Observe<String>

    interface Update : Connect.Update<String>

    interface Mutable : Connect.Mutable<String>, Observe, Update

    class Base : Connect.SinglePostUpdate<String>(), Mutable
}