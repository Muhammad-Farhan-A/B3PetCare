package com.project.petscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //membuat method onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //memanggil menu inflater untuk menampilkan menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
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

    //pembuatan method pindah ke halaman kebutuhan
    public  void pindahKebutuhan(View View){
        //pembuatan objek intent
        Intent mainIntentKebutuhan = new Intent (this, ActivityKebutuhan.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentKebutuhan);
    }

    //pembuatan method pindah ke halaman layanan
    public  void pindahLayanan(View View){
        //pembuatan objek intent
        Intent mainIntentLayanan = new Intent (this, ActivityLayanan.class);
        //menjalankan intent dengan method startActivity
        startActivity(mainIntentLayanan);
    }
}