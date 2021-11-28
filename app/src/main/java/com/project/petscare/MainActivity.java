package com.project.petscare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //pembuatan method pindah ke halaman home
    public  void pindahHome(View View){
        //pembuatan objek intent
        Intent mainIntentHome = new Intent (this, ActivityHome.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentHome);
    }

    //pembuatan method pindah ke halaman register
    public  void pindahRegister(View View){
        //pembuatan objek intent
        Intent mainIntentRegister = new Intent (this, ActivityRegister.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentRegister);
    }
}