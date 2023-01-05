package com.bjw.list

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bjw.list.databinding.ActivityMainBinding
import com.bjw.list.models.StudentModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val stViewModel: StudentModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val studentList = stViewModel.studentList

        // viewModel 에서 생성된 데이터 확인하기
        studentList.forEach() {
            Log.d("Main", "${it.name} ${it.address} ${it.tel}")
        }
    }
}