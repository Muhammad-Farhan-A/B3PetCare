package com.project.petscare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //pembuatan method pindah ke halaman login
    public  void pindahLogin(View View){
        //pembuatan objek intent
        Intent mainIntentLogin = new Intent (this, MainActivity.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentLogin);
    }
}