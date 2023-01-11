package com.bjw.bookfor.ui

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bjw.bookfor.R
import com.bjw.bookfor.databinding.FragmentMainBinding
import com.google.android.material.card.MaterialCardView

class MainFragment : Fragment() {

    private lateinit var binding:FragmentMainBinding
    private var isFabOpen = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(layoutInflater,container, false)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        fun showPopup(v: View){
//            val popup = PopupMenu(activity,v)
//            popup.menuInflater.inflate(R.menu.main_menu_right,popup.menu)
//            popup.show()
//        }
//
//        binding.btnSearch.setOnClickListener {
//            showPopup(binding.btnSearch)
//        }



        fun toggleFab() {
            Toast.makeText(activity,"와우",Toast.LENGTH_LONG).show()

            if (isFabOpen) {
                ObjectAnimator.ofFloat(binding.fabAdd, "translationY", 0f).apply { start() }
                ObjectAnimator.ofFloat(binding.fabDelete, "translationY", 0f).apply { start() }
                binding.btnFloatMain.setImageResource(R.drawable.ic_baseline_add_24)
            } else {
                ObjectAnimator.ofFloat(binding.fabAdd, "translationY", -200f).apply { start() }
                ObjectAnimator.ofFloat(binding.fabDelete, "translationY", -400f).apply { start() }
                binding.btnFloatMain.setImageResource(R.drawable.ic_baseline_delete_24)
            }

            isFabOpen = !isFabOpen
        }

        binding.btnFloatMain.setOnClickListener{
            toggleFab()
        }


//        private fun showPopupMenu(view: View?){
//            val popupBase = (view as MaterialCardView).findViewById<TextView>()
//        }
    }




}