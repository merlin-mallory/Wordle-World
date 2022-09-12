package com.example.wordleworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText = findViewById<EditText>(R.id.text_input)
        val button = findViewById<Button>(R.id.guess_button)
        val answer = findViewById<TextView>(R.id.answer)
        val input1 = findViewById<TextView>(R.id.input1)
        val input2 = findViewById<TextView>(R.id.input2)
        val input3 = findViewById<TextView>(R.id.input3)
        val output1 = findViewById<TextView>(R.id.output1)
        val output2 = findViewById<TextView>(R.id.output2)
        val output3 = findViewById<TextView>(R.id.output3)

        var counter: Int = 0

    }

    /**
     * Parameters / Fields:
     *   wordToGuess : String - the target word the user is trying to guess
     *   guess : String - what the user entered as their guess
     *
     * Returns a String of 'O', '+', and 'X', where:
     *   'O' represents the right letter in the right place
     *   '+' represents the right letter in the wrong place
     *   'X' represents a letter not in the target word
     */

//    private fun checkGuess(guess: String) : String {
//        var result = ""
//        for (i in 0..3) {
//            if (guess[i] == wordToGuess[i]) {
//                result += "O"
//            }
//            else if (guess[i] in wordToGuess) {
//                result += "+"
//            }
//            else {
//                result += "X"
//            }
//        }
//        return result
//    }
}