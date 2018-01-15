package edu.rvc.student.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val btn_click = findViewById<Button>(R.id.btnSubmit)
        val txt1 = findViewById<EditText>(R.id.txtNum1)
        val txt2 = findViewById<EditText>(R.id.txtNum2)

        val btngo = findViewById<Button>(R.id.Go)


        btn_click.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val n1: Int = txtNum1.text.toString().toInt()
            val n2: Int = txtNum2.text.toString().toInt()
            ViewSum.setText(calculate(n1, n2).toString())
            txtNum1.setText("")
            txtNum2.setText("")
            txtNum1.requestFocus()
        }

        btngo.setOnClickListener(View.OnClickListener {
           val intent = Intent(this, Main2Activity::class.java)
            //val intent = Main2Activity(this, user)
            startActivity(intent)

        })





    }

    fun calculate(a: Int, b: Int): Int {
        return a + b
    }

}
