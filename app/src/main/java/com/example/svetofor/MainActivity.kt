package com.example.svetofor

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.svetofor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val redButton = binding.buttonRed
        val yellowButton = binding.buttonYellow
        val greenButton = binding.buttonGreen
        val layout = binding.main
        val text = binding.textView

        redButton.setOnClickListener { onClick(R.string.Red, R.color.redColor, text, layout) }
        yellowButton.setOnClickListener { onClick(R.string.Yellow, R.color.yellowColor, text, layout) }
        greenButton.setOnClickListener { onClick(R.string.Green, R.color.greenColor, text, layout) }
    }

    private fun onClick(textResId: Int, colorResId: Int, textView: TextView, layout: View) {
        textView.setText(textResId)
        layout.setBackgroundColor(resources.getColor(colorResId, null))
    }
}