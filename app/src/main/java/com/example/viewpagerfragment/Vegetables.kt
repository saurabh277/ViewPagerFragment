package com.example.viewpagerfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_vegetables.*


class Vegetables : Fragment() {

    val vegetableName= arrayOf(
        "carrot" , "broccoli " , "asparagus" , "cauliflower " , "corn " ,
        "cucumber " ,"eggplant" , "green pepper " ,"lettuce " , "mushrooms" , "onion" ,
        "potato" , "pumpkin" , "red pepper"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_vegetables, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lvVegetable.adapter = context?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                vegetableName
            )
        }

    }
}
