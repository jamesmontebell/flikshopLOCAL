package exportkit.figma

import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.marginLeft
import androidx.fragment.app.Fragment


class onboarding_survey___likert_scale1_fragment : Fragment(), View.OnClickListener {
    var btnBack : RelativeLayout? = null
    var btnCon: View? = null
    var btnSkip: TextView? = null
    var Count = 0
    var Counter = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view = inflater.inflate(R.layout.onboarding_survey___likert_scale1, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        timer.start()
        btnBack = view.findViewById(R.id.group_5464)
        btnBack!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2922)
        btnCon!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2923)
        btnCon!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2924)
        btnCon!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2925)
        btnCon!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2926)
        btnCon!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2927)
        btnCon!!.setOnClickListener(this)
        btnSkip = view.findViewById(R.id.skip_for_no)
        btnSkip!!.setOnClickListener(this)
        btnCon = view.findViewById(R.id.rectangle_2919)
        btnCon!!.setOnClickListener(this)
    }

    fun Finish()
    {
        if(Count > 0)
        {
            view?.rootView?.findViewById<View>(R.id.rectangle_2919)?.alpha = 1.0F
        }
        else
        {
            view?.rootView?.findViewById<View>(R.id.rectangle_2919)?.alpha = .19F
        }
    }
    val timer = object: CountDownTimer(10000, 1000) {
        override fun onTick(p0: Long) {
        }
        override fun onFinish() {
            showPopupWindow()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onClick(v: View?) {

        if (v!!.getId() == R.id.group_5464) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___flikshop_tutorial_fragment()
            )
                .commitAllowingStateLoss()
            timer.cancel()
        }
        else if (v!!.getId() == R.id.rectangle_2919 && Count > 0)
        {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___finished_fragment()
            )
                .commitAllowingStateLoss()
            timer.cancel()
        }
        else if (v!!.getId() == R.id.group_5464) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___finished_fragment()
            )
                .commitAllowingStateLoss()
            timer.cancel()
        }
        else if (v!!.getId() == R.id.skip_for_no) {
            parentFragmentManager.beginTransaction().replace(R.id.layout,
                onboarding_survey___finished_fragment()
            )
                .commitAllowingStateLoss()
            timer.cancel()
        }
        else if (v!!.getId() == R.id.rectangle_2922 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector)?.setImageResource(R.drawable.vector_ek46)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_apps_for_a_phone__these_skills_can_help_your_job_search___)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.mobile_app_development)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2922 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector)?.setImageResource(R.drawable.vector_ek14)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_apps_for_a_phone__these_skills_can_help_your_job_search___)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.mobile_app_development)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2923 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek1)?.setColorFilter(Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_apps_for_a_phone__these_skills_can_help_your_job_search____ek1)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.web_design)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2923 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek1)?.setColorFilter(0)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_apps_for_a_phone__these_skills_can_help_your_job_search____ek1)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.web_design)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2924 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek2)?.setColorFilter(Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_a_sustaining_business_from_trainers_who_started___)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.entrepreneurship)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2924 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek2)?.setColorFilter(0)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_build_a_sustaining_business_from_trainers_who_started___)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.entrepreneurship)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2925 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek4)?.setColorFilter(Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_record__edit_and_compose_videos_and_audio___)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.content_editing)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2925 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek4)?.setColorFilter(0)
            view?.rootView?.findViewById<TextView>(R.id.learn_how_to_record__edit_and_compose_videos_and_audio___)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.content_editing)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2926 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek6)?.setColorFilter(Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.lorem_ipsum_dolor_sit_amet__consectetur_adipiscing_elit__placerat_)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.finances)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2926 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek6)?.setColorFilter(0)
            view?.rootView?.findViewById<TextView>(R.id.lorem_ipsum_dolor_sit_amet__consectetur_adipiscing_elit__placerat_)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.finances)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2927 && v.contentDescription.equals("OFF"))
        {
            v.setBackgroundResource(R.color.primary_purple)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek7)?.setColorFilter(Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.lorem_ipsum_dolor_sit_amet__consectetur_adipiscing_elit__placerat__ek1)?.setTextColor(
                Color.WHITE)
            view?.rootView?.findViewById<TextView>(R.id.construction)?.setTextColor(Color.WHITE)
            v.contentDescription = "ON"
            Count++
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
        else if (v!!.getId() == R.id.rectangle_2927 && v.contentDescription.equals("ON"))
        {
            v.setBackgroundResource(R.color.white)
            view?.rootView?.findViewById<ImageView>(R.id.vector_ek7)?.setColorFilter(0)
            view?.rootView?.findViewById<TextView>(R.id.lorem_ipsum_dolor_sit_amet__consectetur_adipiscing_elit__placerat__ek1)?.setTextColor(
                Color.parseColor("#B9B9B9"))
            view?.rootView?.findViewById<TextView>(R.id.construction)?.setTextColor(Color.BLACK)
            v.contentDescription = "OFF"
            Count--
            view?.rootView?.findViewById<TextView>(R.id._1_out_of_5_chosen)?.setText("$Count out of 6 chosen")
            Finish()
        }
    }

    private fun showPopupWindow() {
        val inflater = layoutInflater
        val popupView: View = inflater.inflate(R.layout.onboarding_survey___likert_scale3, null)
        val close = popupView.findViewById<View>(R.id.rectangle_2976)
        val width = LinearLayout.LayoutParams.MATCH_PARENT
        val height = LinearLayout.LayoutParams.MATCH_PARENT
        val popupWinwdow = PopupWindow(popupView,width, height, false)
        popupWinwdow.showAtLocation(view, Gravity.CENTER, 0, 0)
        close.setOnClickListener{
            popupWinwdow.dismiss()
        }
    }
}