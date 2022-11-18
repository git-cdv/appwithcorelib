package com.chkan.appwithcorelibexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.chkan.appwithcorelibexample.ui.FavoriteFragment
import com.chkan.appwithcorelibexample.ui.ListFragment
import com.chkan.appwithcorelibexample.ui.SimpleTabSelectedListener
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addOnTabSelectedListener(object : SimpleTabSelectedListener() {
            override fun onTabSelected(tab: TabLayout.Tab) = chooseTab(tab.position)
        })
        chooseTab(0)
    }

    private fun chooseTab(pos: Int) {
            supportFragmentManager.commit {
                replace(R.id.container, if(pos==0) ListFragment() else FavoriteFragment())
            }
        }
}