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

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import androidx.core.view.marginLeft
import androidx.fragment.app.Fragment
import pl.droidsonroids.gif.GifImageView
import android.widget.RelativeLayout
import android.widget.TextView


class onboarding_survey___finished_fragment : Fragment() {
    var btnBack : RelativeLayout? = null
    var btnCon: View? = null
    var btnSkip: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view = inflater.inflate(R.layout.onboarding_survey___finished, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var gif = view.findViewById<GifImageView>(R.id.confetti)
        val timer2 = object: CountDownTimer(10000, 400) {
            override fun onTick(p0: Long) {
                gif.alpha -= .10F
            }
            override fun onFinish() {
                gif.marginLeft.plus(10000)
                cancel()
            }
        }
        timer2.start()

        btnCon = view.findViewById(R.id.frame_67_ek4)
        btnCon!!.setOnClickListener {
            // SET CORRECT FRAGMENT HERE
//            parentFragmentManager.beginTransaction().replace(R.id.layout, ).commitAllowingStateLoss()
        }


//        var gif = view.findViewById<ImageView>(R.id.confetti)
//        Glide.with(this).load(R.drawable.confetti).into(gif)

    }
}