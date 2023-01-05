package com.bjw.game.ui

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.bjw.game.MainActivity
import com.bjw.game.R
import com.bjw.game.databinding.FragmentResultBinding
import com.bjw.game.models.WordViewModel
import com.google.android.material.snackbar.Snackbar

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private  val wordViewModel : WordViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentResultBinding.inflate(layoutInflater,container, false)
        return binding.root
    } // end CreateView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.wordViewModel  = wordViewModel

        binding.btnReturn.setOnClickListener {
            val mainActivity = activity as MainActivity
            wordViewModel.nextWord()
            mainActivity.changeFragment(FRAGMENT_MAIN)

        }

        val inputText = wordViewModel.inputWord.value.toString()
        val unscrambleText = wordViewModel.unscrambleWord.value.toString()

        val oldCount = wordViewModel.gameCount.value!!.toInt()
        wordViewModel.gameCount.value = oldCount + 1

//        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(getActivity())
//        myAlertBuilder.setTitle("title")
//        myAlertBuilder.setMessage("축하합니다")


        // if를 사용하여 단어 비교
        if(inputText.equals(unscrambleText,true)){
            // 점수 증가하기
            val oldScore = wordViewModel.gameScore.value!!.toInt()
            wordViewModel.gameScore.value = oldScore + 1

            if(wordViewModel.gameScore.value!!.toInt() == 10){
                Snackbar.make(view,"축하합니다",Snackbar.LENGTH_LONG).show()
            }
        }

    }
}