package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.paintapp.PaintView.Companion.colorlist
import com.example.paintapp.PaintView.Companion.defultcolor
import com.example.paintapp.PaintView.Companion.pathlist
import com.example.paintapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    companion object {
        var path = Path()
        var brush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.redbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            brush.color= Color.RED
            currentcolor(brush.color)
        }

        binding.greenbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            brush.color= Color.GREEN
            currentcolor(brush.color)
        }

        binding.pinkbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            brush.color= Color.MAGENTA
            currentcolor(brush.color)
        }

        binding.blackbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            brush.color= Color.BLACK
            currentcolor(brush.color)
        }

        binding.eraserbtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            pathlist.clear()
            colorlist.clear()
            path.reset()
        }




    }

    private fun currentcolor(Color:Int){
        defultcolor=Color
        path=Path()


    }
}