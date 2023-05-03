package com.example.nurafshonpm.Activities.activities.activity.HomePage.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.nurafshonpm.Activities.activities.activity.EducatorsActivity
import com.example.nurafshonpm.Activities.activities.activity.profile.TimeManagementActivity
import com.example.nurafshonpm.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class ProfileFragment : Fragment() {
//hehe

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        initViews(view)
        return view;

    }

    private fun initViews(view: View) {
        openPage(view)

    }

    private fun openPage(view: View) {
        val timeManage = view.findViewById<LinearLayout>(R.id.timeManagement)
        timeManage.setOnClickListener {
            val intent = Intent(requireContext(), TimeManagementActivity::class.java)
            startActivity(intent)
        }
        val educatorOpen = view.findViewById<LinearLayout>(R.id.educators)
        educatorOpen.setOnClickListener {
            val intent = Intent(requireContext(), EducatorsActivity::class.java)
            startActivity(intent)
        }

        val textNewPlan = view.findViewById<LinearLayout>(R.id.director)
        textNewPlan.setOnClickListener {
            bottomSheetDialog(view)
        }


        val textNewPlan2 = view.findViewById<LinearLayout>(R.id.adminstration)
        textNewPlan2.setOnClickListener {
            adminstration(view)
        }


    }

    private fun bottomSheetDialog(view: View) {

        val dialog = BottomSheetDialog(requireContext())
        dialog.setContentView(R.layout.bottomsheet_fragment)
        dialog.show()
    }

    private fun adminstration(view: View) {

        val dialog2 = BottomSheetDialog(requireContext())
        dialog2.setContentView(R.layout.bottomsheet_fragment)
        dialog2.show()
    }
}





