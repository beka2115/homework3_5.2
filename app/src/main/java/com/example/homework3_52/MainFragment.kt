package com.example.homework3_52

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework3_52.databinding.ActivityMainBinding
import com.example.homework3_52.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var pick: Boolean = false
    private var num: Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btn1.setOnClickListener {
            if (num == 9) {
                binding.btn1.text = "-1"
            }
            if (num == 10) {
                pick = true
                binding.btn1.text = "-1"
            }
            if (pick == false) {
                num++
                binding.text0.text = num.toString()
            }
            if (pick == true) {
                num--
                binding.text0.text = num.toString()
            }
            if (pick == true) {
                if (num == 0) {
                    pick = false
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.container, SecondFragment()).addToBackStack(null).commit()
                }

            }
        }

    }


}
