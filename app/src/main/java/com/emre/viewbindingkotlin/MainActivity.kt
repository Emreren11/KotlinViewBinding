 package com.emre.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.emre.viewbindingkotlin.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inflate -> xml ile kodu birbirine bağlar
        val view = binding.root //xml görünümü "view" değişkenine verir
        setContentView(view)

        // View Binding -> findViewById yerine kullanılır. Bu sayede her ID için tanımlama yapılmaz
        //Direkt "binding." yazıldıktan sonra layout'daki içeriklerin id'lerine ulaşılır

        binding.button.text = "Button 1"
        binding.button2.text = "Button 2"
        binding.textView.text = "Hello Emre"
        binding.editText.setText("Yunus Emre Eren")
    }
}