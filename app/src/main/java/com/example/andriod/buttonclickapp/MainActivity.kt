package com.example.andriod.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

private const  val TAG ="Main Activity"
private const val  TEXT_CONTENTS = "Text content"
class MainActivity : AppCompatActivity() {

    private var   textview: TextView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"On Create: Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userInput : EditText = findViewById<EditText>(R.id.editText)
        val  button : Button = findViewById<Button>(R.id.button)
        textview = findViewById<TextView>(R.id.textView)
        textView?.text=""
        textView.movementMethod=ScrollingMovementMethod()
        userInput.setText("")
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d(TAG,"On Click: Called")

                textview?.append(userInput.text)
                textview?.append("\n")
                userInput.setText("")
      //          userInput.text.clear()
            }
        })
    }

    override fun onStart() {
        Log.d(TAG,"onStart: Called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG,"onRestoreInstanceState: Called")
        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState?.getString(TEXT_CONTENTS,"")
    }

    override fun onRestart() {
        Log.d(TAG,"onRestart: Called")
        super.onRestart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume: Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause: Called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG,"onSaveInstanceState: Called")
        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENTS, textView?.text.toString())
     }

    override fun onStop() {
        Log.d(TAG,"onStop: Called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy: Called")
        super.onDestroy()
    }

}
