package com.muratcakir.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables % Constants

        var x = 4
        var y = 5

        println(x * y)

        var age = 35
        var result = age / 7 * 5
        println(result)

        //Constant
        val name = "murat"

        //Defining & Initialize
        var a : Int = 5
        a = 15

        println(a)

        //Defining

        var myInteger : Int

        //Initialize

        myInteger = 10

        //Double % Float

        val pi : Double
        pi = 3.14

        val myFloat : Float
        myFloat = 3.14f

        println(pi)
        println(myFloat)

        //String

        val name1 = "murat"
        val surname = "Çakır"
        val fullname = name1 + " " + surname

        println(fullname)

        println(fullname.capitalize())

        // Boolean

        var isAlive : Boolean = true
        isAlive = false
        if (isAlive == 3>5){
            println(isAlive)
        }

        // Conversion

        var Input = "10"
        println(Input.toInt() * 2)

        // Collections

        // Arrays

        val myArray = arrayOf("Murat","Şadiye","Yeşim","Ali")

        println(myArray[0])
        myArray[0] = "Çakır"
        println(myArray[0])

        myArray.set(1,"Şadiye Çakır")
        println(myArray[1])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Murat",5)

        println(mixedArray[0])
        println(mixedArray[1])

        // ArrayList

        val myParent = arrayListOf<String>("Murat","Şadiye")
        myParent.add("Yeşim")
        myParent.add(0,"Ali")
        println(myParent[0])
        println(myParent[3])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(2)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add(23.25)
        myMixedArrayList.add("Murat")
        myMixedArrayList.add(21)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])
        println(myMixedArrayList[3])

        // Set

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        mySet.forEach { println(it) }

        val myHashSet = HashSet<String>()
        myHashSet.add("murat")
        myHashSet.add("murat")
        println(myHashSet.size)

        // Map - Hashmap

        val myHashMap = hashMapOf<String,Int>()
        myHashMap.set("Apple",100)
        myHashMap.set("Banana",150)
        println(myHashMap["Apple"])

        val myHashMap1 = HashMap<String,String>()

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2)
        println(myNewMap["A"])
        println(myNewMap["B"])

        // Switch - When

        var day = 3
        var dayString = ""

        when(day){
            1-> dayString = "Monday"
            2-> dayString = "Tuesday"
            3-> dayString = "Wednesday"
        }
        println(dayString)

        // Loops

        // For Loop

        val myNumberArray = arrayOf(12,15,18,21,24,27,30,33)
        var Number = myNumberArray[0] / 3 *5
        println(Number)

        for (num in myNumberArray){
            val z = num / 3 * 5
            println(z)
        }

        for (i in myNumberArray.indices){
            val q = myNumberArray[i] / 3 * 5
            println(q)
        }

        for(b in 0..9){
            println(b)
        }

        val myString = arrayListOf<String>()
        myString.add("Murat")
        myString.add("Çakır")
        myString.add("Yeşim")

        for(str in myString){
            println(str)
        }

        // While Loop

        var j = 0

        while (j < 10){
            println(j)
            j++
        }

    }
}
