package com.bjw.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.bjw.app.databinding.ActivityAddBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.txtInputWord.setOnEditorActionListener {view, keyCode, event ->
            val word = binding.txtInputWord.text.toString()
//            word == null

            if(word.isEmpty()){
                Snackbar.make(view,"단어를 입력하세요",Snackbar.LENGTH_LONG).show()
            }

            /**
             * input box 의 키보드가 보이는 상태에서
             * Snack bar 를 보이면 키보드에 가려져서 Snack bar 가 보이지 않기때문에
             * 마지막의 값을 false 로 해 주면 키보드가 자동으로 사라진다
             */
            false
        }
    }
}