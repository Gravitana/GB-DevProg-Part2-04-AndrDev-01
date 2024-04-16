package ru.gravitana.myfirstapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.gravitana.myfirstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.skillboxTextView.text = getText(R.string.testText)
//        binding.skillboxTextView.text = binding.skillboxTextView.context.getText(R.string.testText)
//        binding.skillboxTextView.isAllCaps = false

        binding.skillboxTextView.text = counter.toString()
        binding.plusOneButton.setOnClickListener {
            if (counter == 5) {
                counter = 0
                binding.button1.visibility = View.VISIBLE
            } else {
                counter++
            }

            binding.skillboxTextView.text = counter.toString()
        }

        binding.button1.setOnClickListener {
//            binding.skillboxTextView.text = "Button is clicked!"
            binding.plusOneButton.isEnabled = false
        }
    }
}