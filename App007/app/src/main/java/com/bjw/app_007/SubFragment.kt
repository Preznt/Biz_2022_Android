package com.bjw.app_007

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bjw.app_007.databinding.FragmentSubBinding


class SubFragment : Fragment() {
    // 일단은 null 값으로 설정을 하라
    /**
     * 실제 binding 된 view 가 저장될 _binding 변수와
     * binding get() : _binding 데이터를 읽기 위한 getter 함수 선언
     * fragment 에서 메모리 누수를 방지하기 위한 설정
     *
     */
    private var _binding:FragmentSubBinding? = null
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
        // Inflate the layout for this fragment

        _binding = FragmentSubBinding.inflate(inflater, container, false)

        /**
         * _binding 객체를 직접 접근하여 데이터를 참조하지 않고
         * binding getter() 함수를 통하여 간접 접근
         * 위에서 binding get() 함수를 선언할때
         *      _binding!! 을 참조하도록 만들었기 때문에 
         *      이제 번거롭게 !!를 사용하지 않아도 된다
         * binding 에 접근을 하면 그때마다 _binding 으로 부터
         * 데이터를 가져와서 참조할수 있도록 만들어 준다.
         * 이러한 동작을 getter() method 라고 한다.
         */
        val root = binding.root


        val txtView = binding.txtView

        txtView.setOnClickListener{
            findNavController().navigate(R.id.action_subFragment_to_mainFragment)
        }

        // by navArgs() : navArgs() 함수를 lazy 로 호출하여(화면이 다 그려진 다음에)
        // args 값을 찾기
        val args: MainFragmentArgs by navArgs()
        // args.변수 값을 getter 하여 txtView 의 text 속성에 setting
        txtView.text = "${args.nation} :: ${args.age}"

        return root
//        return inflater.inflate(R.layout.fragment_sub, container, false)
    }

}