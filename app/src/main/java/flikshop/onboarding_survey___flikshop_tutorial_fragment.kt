/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		onboarding_survey___landing_page
	 *	@date 		Wednesday 19th of October 2022 07:46:19 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package exportkit.figma


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import android.util.Log
import androidx.fragment.app.FragmentManager
//import flikshop.onboarding_survey___likert_scale1_fragment

class onboarding_survey___flikshop_tutorial_fragment : Fragment(), View.OnClickListener {
    var btnBack: RelativeLayout? = null
    var btnCon: RelativeLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        return inflater.inflate(R.layout.onboarding_survey___flikshop_tutorial, container, false)
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
            parentFragmentManager.beginTransaction().add(R.id.layout, onboarding_survey___landing_page_fragment())
                .commitAllowingStateLoss()
        }
        else if (v!!.getId() == R.id.frame_67_ek1) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___likert_scale1_fragment()
            )
                .commitAllowingStateLoss()
        }
    }

}