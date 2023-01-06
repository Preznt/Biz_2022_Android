package com.bjw.bookfor.ui

import android.os.Bundle
import android.view.*
import android.widget.PopupMenu
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bjw.bookfor.R
import com.bjw.bookfor.databinding.FragmentMainBinding
import com.google.android.material.card.MaterialCardView

class MainFragment : Fragment() {

    private lateinit var binding:FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(layoutInflater,container, false)

//        fun showPopup(v: View){
//            val popup = PopupMenu(this,v)
//            popup.menuInflater.inflate(R.menu.main_menu_right,popup.menu)
//            popup.show()
//        }
//
//        binding.btnMenu.setOnClickListener {
//            showPopup(binding.btnMenu)
//        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        private fun showPopupMenu(view: View?){
//            val popupBase = (view as MaterialCardView).findViewById<TextView>()
//        }
    }




}