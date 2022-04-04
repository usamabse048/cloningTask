package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.ItemAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.models.PaymentModel

class homeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemAdapter = ItemAdapter(requireContext(), getItems())
        binding.myRecyclerView.adapter = itemAdapter


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun getItems(): ArrayList<PaymentModel> {

        var arr = ArrayList<PaymentModel>()

        for (i in 0..10) {
            var paymentModel = PaymentModel(
                paymentName = "Usamas Fee",
                accountNumber = "09000228812334",
                companyName = "Punjab Group Of Colleges"
            )
            arr.add(paymentModel)
        }
        return arr

    }

}