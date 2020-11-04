package com.example.viewpagerfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_sports.*

class Sports : Fragment() {
    val sportsName = arrayOf(
        "Cricket" , "Football","Hockey","Rugby","Polo","Golf","Boxing","Chess",
        "Tennis","Badminton","Swimming","TableTennis","Cycling"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
        = inflater.inflate(R.layout.fragment_sports, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lvPlayer.adapter = context?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                sportsName
            )
        }
    }


}
