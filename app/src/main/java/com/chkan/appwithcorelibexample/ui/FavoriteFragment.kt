package com.chkan.appwithcorelibexample.ui

import android.os.Bundle
import android.view.View
import com.chkan.appwithcorelibexample.databinding.FragmentFavoriteBinding
import com.chkan.coremvvm.presentation.BaseFragment

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>(FragmentFavoriteBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}