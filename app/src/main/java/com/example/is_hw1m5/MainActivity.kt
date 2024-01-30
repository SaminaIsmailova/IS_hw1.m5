package com.example.is_hw1m5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import com.example.is_hw1m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {
    private lateinit var binding: ActivityMainBinding
    var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrimentBtn.setOnClickListener {
                presenter.incremenrt()
                presenter.showToast()
                presenter.changeTextColor()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
                presenter.showToast()
                presenter.changeTextColor()
            }
        }

    }

    override fun showNewCount(number: Int) {
        binding.resultTv.text = number.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Counter = 10", Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }

    override fun chaneTextColorBack() {
        binding.resultTv.setTextColor(Color.BLACK)
    }
}

