package com.example.kawalin

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportActionBar?.hide()


        btn_tak.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.tak_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_tak),getString(R.string.history_tak)) }

        })
        btn_nan.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.nan_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_nan),getString(R.string.history_nan)) }

        })
        btn_buriram.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.buriram_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_buriram),getString(R.string.history_buriram)) }

        })
        btn_chonburi.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.chonburi_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_chonburi),getString(R.string.history_chonburi)) }

        })



    }
    fun setProvice (drawable : Drawable, header:String, content:String ){

        img_province.setImageDrawable(drawable)  //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติ

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()


    }
}
