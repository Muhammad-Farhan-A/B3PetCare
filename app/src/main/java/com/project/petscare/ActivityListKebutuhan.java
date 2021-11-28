package com.project.petscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.project.petscare.Adapter.KebutuhanPetcareAdapter;
import com.project.petscare.model.KebutuhanPetcare;

import java.util.ArrayList;

//implements interface untuk klik
public class ActivityListKebutuhan extends AppCompatActivity implements KebutuhanPetcareAdapter.OnKebutuhanViewHolderClick{

    //deklarasi objek dari recycler view
    RecyclerView rvListKebutuhan;
    //deklarasi objek dari adapter
    KebutuhanPetcareAdapter kebutuhanPetcareAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kebutuhan);

        //membuat objek adapter
        kebutuhanPetcareAdapter = new KebutuhanPetcareAdapter();
        //memanggil method setter
        kebutuhanPetcareAdapter.setListKebutuhan(getDataKebutuhan());
        //menset listener
        kebutuhanPetcareAdapter.setListener(this);

        //mengambil objek dari recycler view
        rvListKebutuhan = findViewById(R.id.rvListKebutuhan);
        //set adapter
        rvListKebutuhan.setAdapter(kebutuhanPetcareAdapter);
        //konfigurasi layout
        LinearLayoutManager linearManager = new LinearLayoutManager(this);
        rvListKebutuhan.setLayoutManager(linearManager);
    }

    //menambahkan data kebutuhan petcare
    public ArrayList<KebutuhanPetcare> getDataKebutuhan(){
        //membuat objek
        ArrayList<KebutuhanPetcare> list = new ArrayList<>();
        list.add(new KebutuhanPetcare("Royal Canin - Makanan Kucing", 60000, 1));
        list.add(new KebutuhanPetcare("Alpo - Makanan Anjing", 75000, 2));
        list.add(new KebutuhanPetcare("Felibite - Makanan Kucing", 40000, 3));
        list.add(new KebutuhanPetcare("Pedigree - Makanan Anjing", 60000, 4));
        list.add(new KebutuhanPetcare("Whiskas - Makanan Kucing", 55000, 5));
        return list;
    }

    //membuat method onClick
    @Override
    public void onClick(View v, KebutuhanPetcare KebutuhanPetcare) {
        Intent mainIntentPesanKebutuhan = new Intent(this, ActivityPesanKebutuhan.class);
        startActivity(mainIntentPesanKebutuhan);
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