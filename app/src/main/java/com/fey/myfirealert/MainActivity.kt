package com.fey.myfirealert


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    var MtvLogin:CardView?=null
    var MtvRegister:CardView?=null
    var MtvEmergerncyCall:CardView?=null
    var MtvFireAlert:CardView?=null
    var MtvAbout:CardView?=null
    var MtvExit:CardView?=null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        MtvLogin=findViewById(R.id.mCardLogin)
        MtvRegister=findViewById(R.id.mCardRegister)
        MtvEmergerncyCall=findViewById(R.id.mCardEmergeny)
        MtvFireAlert=findViewById(R.id.mCardFireAlert)
        MtvAbout=findViewById(R.id.mCardAbout)
        MtvExit=findViewById(R.id.mCardExit)


        MtvLogin !!.setOnClickListener{
            var intents=Intent(this,SignUpActivity::class.java)
            startActivity(intents)

        }
        MtvRegister !!.setOnClickListener{
            var intents=Intent(this,SignInActivity::class.java)
            startActivity(intents)

        }
        MtvEmergerncyCall!!.setOnClickListener{
            var intents=Intent(this,EmergencyCallActivity::class.java)
            startActivity(intents)

        }

        MtvFireAlert !!.setOnClickListener{
            var intents=Intent(this,FireAlertActivity::class.java)
            startActivity(intents)

        }
        MtvAbout !!.setOnClickListener{
            var intents=Intent(this,AboutActivity::class.java)
            startActivity(intents)

        }
        MtvExit!!.setOnClickListener{
            var intents=Intent(this,ExitActivity::class.java)
            startActivity(intents)

        }


    }

}