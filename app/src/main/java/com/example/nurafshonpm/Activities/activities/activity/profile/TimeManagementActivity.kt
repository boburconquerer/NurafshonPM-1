package com.example.nurafshonpm.Activities.activities.activity.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.nurafshonpm.Activities.activities.activity.profile.TMfragments.dailyFragment
import com.example.nurafshonpm.Activities.activities.activity.profile.TMfragments.tasksfragment
import com.example.nurafshonpm.Activities.activities.adapters.TimeManageAdapter
import com.example.nurafshonpm.R
import com.google.android.material.tabs.TabLayout

class TimeManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_management)


        initView()

    }

    private fun initView() {
        val tabLayout = findViewById<TabLayout>(R.id.timeTbLayout_id)
        val viewPager = findViewById<ViewPager>(R.id.timeViewPager_id)
        val adapter = TimeManageAdapter(supportFragmentManager)
        adapter.addFragment(dailyFragment(), "Daily plan")
        adapter.addFragment(tasksfragment(), "Schedule")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }


}