package com.muratcakir.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        // Void - Unit
        //mySum(5,3)

        // Return
        val result = myMultiply(4,5)
       // textView.text = "Multiply Result: ${result}"

        // Class

        // Object & Instance

        val homer = Simpson("Homer","Nuclear",60)

        /*homer.age = 50
        homer.job = "Nuclear"
        homer.name = "Homer Simpson"*/

        println(homer.age)

        // Nullability
        // Nullable(?) - Non-Null
        // !! and ?

        var myString : String? = null
        var myInt : Int? = null

        // Null Safety

        if(myInt != null){
            println(myInt * 10)
        }else{
            println("myInt null")
        }

        // Safe Call

        println(myInt?.compareTo(2))

        // Elvis

        val myAnswer = myInt?.compareTo(2) ?: -100
        println(myAnswer)

    }

    fun test(){
        println("test function")
    }

    // Input & Return
    /*fun mySum(a:Int ,b: Int){
        textView.text = "Result: ${a+b}"
    }
*/
    fun myMultiply(x:Int,y:Int) : Int{
        return x*y
    }

    fun makeSimpson(view: View){
        val name = nameText.text.toString()
        val job = jobText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if(age == null){
            age = 0
        }

        val simpson = Simpson(name,job,age)

        textView.text = "Name: ${name}, Job: ${job}, Age: ${age}"
    }

}
