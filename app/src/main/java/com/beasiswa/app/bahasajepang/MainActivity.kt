package com.beasiswa.app.bahasajepang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beasiswa.app.bahasajepang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLestPlay.setOnClickListener {
            val letsPlay = Intent(this@MainActivity, LetsPlayActivity::class.java)
            startActivity(letsPlay)
        }

        binding.btnTentang.setOnClickListener {
            val intentTentang = Intent(this@MainActivity, TentangAplikasi::class.java)
            startActivity(intentTentang)
        }

        binding.btnKeluar.setOnClickListener {

        }
    }
}