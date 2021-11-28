package com.project.petscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ActivityLayananPetGrooming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan_pet_grooming);
    }

    //pembuatan method pindah ke halaman pesan layanan pet grooming
    public  void pindahPesanGrooming(View View){
        //pembuatan objek intent
        Intent mainIntentPesanGrooming = new Intent (this, ActivityPesanLayananGrooming.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentPesanGrooming);
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