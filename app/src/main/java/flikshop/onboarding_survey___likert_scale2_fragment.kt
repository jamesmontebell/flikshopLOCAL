/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		onboarding_survey___likert_scale
     *	@date 		Tuesday 25th of October 2022 01:29:55 AM
     *	@title 		Visual Design Playground
     *	@author
     *	@keywords
     *	@generator 	Export Kit v1.3.figma
     *
     */
package exportkit.figma

import android.os.Bundle
import android.widget.RelativeLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
//import flikshop.onboarding_survey___likert_scale1_fragment


class onboarding_survey___likert_scale2_fragment : Fragment(), View.OnClickListener {

    var btnBack : RelativeLayout? = null
    var btnCon: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view = inflater.inflate(R.layout.onboarding_survey___likert_scale2, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack = view.findViewById(R.id.group_5464)
        btnBack!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.frame_67_ek1)
        btnCon!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.getId() == R.id.group_5464) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___likert_scale1_fragment()
            )
                .commitAllowingStateLoss()
        }
        else if (v!!.getId() == R.id.frame_67_ek1) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,onboarding_survey___likert_scale3_fragment())
                .commitAllowingStateLoss()
        }
    }
}