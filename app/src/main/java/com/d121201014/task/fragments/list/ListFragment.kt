package com.d121201014.task.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.d121201014.task.databinding.FragmentListBinding
import com.d121201014.task.databinding.FragmentListBinding.inflate


class ListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = inflate(inflater, container, false)

        binding.floatingActionButton

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}