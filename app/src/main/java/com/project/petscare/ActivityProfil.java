package com.project.petscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ActivityProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    //pembuatan method pindah ke halaman edit profil
    public  void pindahEditProfil(View View){
        //pembuatan objek intent
        Intent mainIntentEditProfil = new Intent (this, ActivityEditProfil.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentEditProfil);
    }

    //pembuatan method pindah ke halaman ganti password
    public  void pindahGantiPassword(View View){
        //pembuatan objek intent
        Intent mainIntentGantiPassword = new Intent (this, ActivityGantiPassword.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentGantiPassword);
    }

    //penambahan method onOptionsItemSelected agar menu dapat di klik
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_home:
                Intent homeIntent = new Intent(this, ActivityHome.class);
                startActivity(homeIntent);
                return true;
            case R.id.menu_profil:
                Intent profileIntent = new Intent(this, ActivityProfil.class);
                startActivity(profileIntent);
                return true;
            case R.id.menu_logout:
                Intent loginIntent = new Intent(this, MainActivity.class);
                startActivity(loginIntent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}