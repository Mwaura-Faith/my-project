package com.fey.myfirealert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {
    private lateinit var  auth: FirebaseAuth
    var editTextEmailAddress:EditText ?=null
    var editTextPassword:EditText ?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        auth= FirebaseAuth.getInstance()
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        editTextPassword = findViewById(R.id.editTextPassword)
    }

    fun goToLogin(view: android.view.View) {
        val intents=Intent(this,SignUpActivity::class.java)
        startActivity(intents)
    }

    fun register(view: android.view.View) {
        val email=editTextEmailAddress!!.text.toString()
        val password=editTextPassword!!.text.toString()

        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener { task ->
            if(task.isSuccessful){
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception ->
            Toast.makeText(applicationContext,exception.localizedMessage,Toast.LENGTH_LONG).show()
        }

    }


}

