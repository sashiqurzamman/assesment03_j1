package com.example.a3_j1_ashik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class PersonAdapter(context: Context, private val personList: List<PersonDataClass>) :
    ArrayAdapter<PersonDataClass>(context, 0, personList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_person, parent, false)
        }

        val person = personList[position]

        val imageViewPerson = itemView!!.findViewById<CircleImageView>(R.id.profile_image)
        val nameView = itemView.findViewById<TextView>(R.id.nameTV)
        val addressView = itemView.findViewById<TextView>(R.id.addressTV)

        imageViewPerson.setImageResource(person.imgResId)
        nameView.text = person.name
        addressView.text = person.address

        return itemView
    }
}
