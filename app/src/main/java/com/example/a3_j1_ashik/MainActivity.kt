package com.example.a3_j1_ashik

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.a3_j1_ashik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val personList = listOf(
            PersonDataClass(R.drawable.avatar, "Abir", "123 Main St, Springfield"),
            PersonDataClass(R.drawable.avatar2, "Nusrat Dana", "456 Elm St, Springfield"),
            PersonDataClass(R.drawable.girl, "Mansura Saon", "789 Oak St, Springfield"),
            PersonDataClass(R.drawable.manager, "Aminul Munna", "789 Oak St, Springfield"),
            PersonDataClass(R.drawable.woman, "Munia Mehrah", "789 Oak St, Springfield")
        )


        val adapter = PersonAdapter(this, personList)
        binding.listView.adapter = adapter
    }
}
