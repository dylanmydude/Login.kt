package com.example.poe20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring mutable variables
        val head = findViewById<TextView>(R.id.tvHeader) //this is the 'Calculator' header
        val num1 = findViewById<EditText>(R.id.etNum)
        val num2 = findViewById<EditText>(R.id.etNum2)
        val add = findViewById<Button>(R.id.btAdd)
        val sub = findViewById<Button>(R.id.btSub)
        val multi = findViewById<Button>(R.id.btMul)
        val div = findViewById<Button>(R.id.btDiv)
        val output = findViewById<TextView>(R.id.tvOut)
        val thanks = findViewById<Button>(R.id.btThankYou)

        //this section sets the input, operator ,and output

        //addition section
        add.setOnClickListener {
            val input1 = num1.text.toString().toInt()   //converts first input to integer and stores in input1
            val input2 = num2.text.toString().toInt()   //converts second input to integer and stores in input2
            val add = input1 + input2                   //applies operation and stores value in variable
            output.text = ("$input1 + $input2 = $add")  //outputs the equation and answer in the output text view
        }
        //subtraction section
        sub.setOnClickListener {
            val input1 = num1.text.toString().toInt()
            val input2 = num2.text.toString().toInt()
            val sub = input1 - input2
            output.text = ("$input1 - $input2 = $sub")
        }
        //multiplication section
        multi.setOnClickListener {
            val input1 = num1.text.toString().toInt()
            val input2 = num2.text.toString().toInt()
            val multi = input1 * input2
            output.text = ("$input1 * $input2 = $multi")
        }
        //division section
        div.setOnClickListener {
            val input1 = num1.text.toString().toInt()
            val input2 = num2.text.toString().toInt()
            val div = input1 / input2
            output.text = ("$input1 / $input2 = $div")
        }
            //A toast
        thanks.setOnClickListener {

            Toast.makeText(this, "Thank you!", Toast.LENGTH_SHORT).show()
        }




    }
}
