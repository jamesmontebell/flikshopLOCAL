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

import android.widget.TextView
import android.os.Bundle
import exportkit.figma.R
import android.widget.RelativeLayout
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment


class onboarding_survey___likert_scale3_fragment : Fragment(), View.OnClickListener{

    var btnCon: RelativeLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view = inflater.inflate(R.layout.onboarding_survey___likert_scale3, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCon = view.findViewById(R.id.group_5328)
        btnCon!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.getId() == R.id.group_5328) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,onboarding_survey___finished_fragment())
                .commitAllowingStateLoss()
        }
    }
}