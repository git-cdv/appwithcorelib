package com.chkan.appwithcorelibexample.ui

import android.os.Bundle
import android.view.View
import com.chkan.appwithcorelibexample.databinding.FragmentListBinding
import com.chkan.coremvvm.presentation.BaseFragment

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}