package com.example.wordleworld

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText = findViewById<EditText>(R.id.text_input)
        val button = findViewById<Button>(R.id.guess_button)
        var answer = findViewById<TextView>(R.id.answer)
        val input1 = findViewById<TextView>(R.id.input1)
        val input2 = findViewById<TextView>(R.id.input2)
        val input3 = findViewById<TextView>(R.id.input3)
        val output1 = findViewById<TextView>(R.id.output1)
        val output2 = findViewById<TextView>(R.id.output2)
        val output3 = findViewById<TextView>(R.id.output3)
        var wordToGuess = FourLetterWordList.FourLetterWordList.getRandomFourLetterWord()
        answer.text = wordToGuess
        answer.visibility = View.GONE


        var counter: Int = 0

        button.setOnClickListener {
            counter = counter + 1
            if (counter == 1) {
                var guess1 = editText.text.toString()
                input1.text = guess1
                output1.text = guess1
                editText.text.clear()
                var checkFunction1 = checkGuess(guess1, wordToGuess)
                output1.text = checkFunction1
            }
            if (counter == 2) {
                var guess2 = editText.text.toString()
                input2.text = guess2
                editText.text.clear()
                var checkFunction2 = checkGuess(guess2, wordToGuess)
                output2.text = checkFunction2
            }
            if (counter == 3) {
                var guess3 = editText.text.toString()
                input3.text = guess3
                editText.text.clear()
                var checkFunction3 = checkGuess(guess3, wordToGuess)
                output3.text = checkFunction3
                answer.visibility = View.VISIBLE
                button.text = "RESET"
                editText.visibility = View.INVISIBLE
            }
            if (counter == 4) {
                wordToGuess = FourLetterWordList.FourLetterWordList.getRandomFourLetterWord()
                answer = wordToGuess
                input1.text = ""
                input2.text = ""
                input3.text = ""
                output1.text = ""
                output2.text = ""
                output3.text = ""
                counter = 0
            }
        }

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

    private fun checkGuess(guess: String, wordToGuess: String) : String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            } else if (guess[i] in wordToGuess) {
                result += "+"
            } else {
                result += "X"
            }
        }
        return result
    }
}