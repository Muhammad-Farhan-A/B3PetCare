package com.project.petscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ActivityLayanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);
    }

    //pembuatan method pindah ke halaman layanan pet grooming
    public void pindahPetGrooming(View View){
        //pembuatan objek intent
        Intent mainIntentPetGrooming = new Intent (this, ActivityLayananPetGrooming.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentPetGrooming);
    }

    //pembuatan method pindah ke halaman layanan pet hotel
    public void pindahPetHotel(View View){
        //pembuatan objek intent
        Intent mainIntentPetHotel = new Intent (this, ActivityLayananPetHotel.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentPetHotel);
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