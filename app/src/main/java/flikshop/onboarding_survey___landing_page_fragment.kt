/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc
	 *	@file 		onboarding_survey___landing_page
	 *	@date 		Saturday 15th of October 2022 12:41:35 AM
	 *	@title 		Visual Design Playground
	 *	@author
	 *	@keywords
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package exportkit.figma

import android.os.Bundle
import exportkit.figma.R
import android.widget.RelativeLayout
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment


class onboarding_survey___landing_page_fragment : Fragment(), View.OnClickListener {

    var btnCon: RelativeLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        return inflater.inflate(R.layout.onboarding_survey___landing_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCon = view.findViewById(R.id.group_5295)
        btnCon!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.getId() == R.id.group_5295) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,onboarding_survey___flikshop_tutorial_fragment())
                .commitAllowingStateLoss()
        }
    }
}