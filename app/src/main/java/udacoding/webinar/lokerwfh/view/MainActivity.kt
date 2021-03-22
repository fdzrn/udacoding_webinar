package udacoding.webinar.lokerwfh.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import udacoding.webinar.lokerwfh.R
import udacoding.webinar.lokerwfh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

		setSupportActionBar(binding.toolbar)
		supportActionBar?.title = getString(R.string.app_name)
    }
}