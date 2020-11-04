package com.example.viewpagerfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_fruits.*

class Fruits : Fragment() {
    val fruitsName= arrayOf(
        "Mango","Apple","Lychee","Watermelon","Pineapple",
        "Grapes","Kiwi","Pomegranate","Gauva","Orange",
        "Blackberry","Blackcurrent","Plum"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_fruits, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lvFruit.adapter = context?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                fruitsName
            )
        }

    }
}
