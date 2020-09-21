package com.notin.textsmart

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.notin.text.SmartTextView
import com.notin.text.util.TitleSmart
import com.notin.text.util.TypefaceSmart
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author NgoVanTien
 * @version 1.01
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_smart.text = "Hello Cac Ban Da Den Voi NoTIn"
        txt_smart.setTypeface(TypefaceSmart.BOLD_ITALIC_UNDERLINE)
        txt_smart.setTextColor(Color.RED,0,10)
        txt_smart.textAppend(" Minh la tien")
      //  txt_smart.setTextColor(Color.YELLOW,0,txt_smart.text.toString().length);


    }
}