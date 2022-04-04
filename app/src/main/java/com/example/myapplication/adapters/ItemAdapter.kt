package com.example.myapplication.adapters

import androidx.recyclerview.widget.RecyclerView

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.models.PaymentModel


class ItemAdapter(
    val context: Context,
    val items: ArrayList<PaymentModel>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameTextView: TextView
        val accountTextView: TextView
        val companyTextView: TextView

        init {


            nameTextView = view.findViewById(R.id.nameTextView)
            accountTextView = view.findViewById(R.id.accountNumberTextView)
            companyTextView = view.findViewById(R.id.companyTextView)
        }

        fun bind(item: PaymentModel) {

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = items[position].paymentName
        holder.accountTextView.text = items[position].accountNumber
        holder.companyTextView.text = items[position].companyName

        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_home_list_item, parent, false)
        return ViewHolder(view)
    }}
