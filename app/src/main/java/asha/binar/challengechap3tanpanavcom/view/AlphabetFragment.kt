package asha.binar.challengechap3tanpanavcom.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import asha.binar.challengechap3tanpanavcom.MainActivity
import asha.binar.challengechap3tanpanavcom.R
import asha.binar.challengechap3tanpanavcom.adapter.AlphabetAdapter
import asha.binar.challengechap3tanpanavcom.databinding.FragmentAlphabetBinding


class AlphabetFragment : Fragment() {
    private var _binding : FragmentAlphabetBinding? = null
    private val binding get() = _binding!!
    private val dataSet = MainActivity().MyData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlphabetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AlphabetAdapter()
        adapter.submitData(dataSet)

        binding.rvAlphabet.layoutManager = LinearLayoutManager(activity)
        binding.rvAlphabet.adapter = adapter
    }


}