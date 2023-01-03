package com.bjw.app_008

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bjw.app_008.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    private var  _binding:FragmentResultBinding? = null
    private val binding get() = _binding!!

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

        _binding = FragmentResultBinding.inflate(inflater,container, false)

        val root = binding.root

        val txtView = binding.inputWord
        val args: MainFragmentArgs by navArgs()
        txtView.text = args.word

        val btnBack = binding.btnBack

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_mainFragment)
        }

        return root


//        return inflater.inflate(R.layout.fragment_result, container, false)
    }

}