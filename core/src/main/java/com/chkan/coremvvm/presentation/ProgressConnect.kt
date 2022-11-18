package com.chkan.coremvvm.presentation

interface ProgressConnect {

    interface Update : Connect.Update<Visibility>

    interface Observe : Connect.Observe<Visibility>

    interface Mutable : Update, Observe

    class Base : Connect.UiUpdate<Visibility>(), Mutable
}