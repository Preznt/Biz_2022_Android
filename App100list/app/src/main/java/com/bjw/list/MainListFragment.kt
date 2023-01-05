package com.bjw.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bjw.list.adapter.StudentRecyclerAdapter
import com.bjw.list.databinding.FragmentMainListBinding
import com.bjw.list.models.StudentModel

class MainListFragment : Fragment() {

    private lateinit var binding: FragmentMainListBinding
    private val stViewModel: StudentModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.sutdentList
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = StudentRecyclerAdapter(stViewModel.studentList)
        recyclerView.adapter = adapter
    }

}