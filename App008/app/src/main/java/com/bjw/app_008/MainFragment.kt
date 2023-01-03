package com.bjw.app_008

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bjw.app_008.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var binding:FragmentMainBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)

        val root:View = binding!!.root


        binding!!.btnAdd.setOnClickListener {
            val wordValue = binding!!.txtInput.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToResultFragment()
            action.word = wordValue
            findNavController().navigate(action)
        }

        return  root
//        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}