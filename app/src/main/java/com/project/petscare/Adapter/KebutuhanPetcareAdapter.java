package com.project.petscare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.petscare.R;
import com.project.petscare.model.KebutuhanPetcare;

import java.util.ArrayList;

//extends recyclerview adapter dan disediakan holder
public class KebutuhanPetcareAdapter
        extends RecyclerView.Adapter<KebutuhanPetcareAdapter.KebutuhanViewHolder> {

    //class kebutuhan view holder harus merupakan turunan dari recycler view view holder
    //view holder merepresentaikan layout item kebutuhan
    //mengimplementasikan interface onClickListener sehingga dapat di klik
    public class KebutuhanViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        //properti class kebutuhan view holder
        TextView textKebutuhan, textHargaKebutuhan;
        ImageView imageStatus;

        //pada constructor berikut akan diambil objek yang akan di binding
        public KebutuhanViewHolder(@NonNull View itemView) {
            super(itemView);
            textKebutuhan = itemView.findViewById(R.id.textViewNamaProduk);
            textHargaKebutuhan = itemView.findViewById(R.id.textViewHargaProduk);
            imageStatus = itemView.findViewById(R.id.imageStatus);
            //menset item yang menhandle klik
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null){
                listener.onClick(v, listKebutuhan.get(getAdapterPosition()));
            }
        }
    }

    //membuat inner interface pada adapter sehingga dapat di klik
    public interface OnKebutuhanViewHolderClick{
        void onClick(View view, KebutuhanPetcare KebutuhanPetcare);
    }

    //mebuat setter untuk menset objek listener
    public void setListener(OnKebutuhanViewHolderClick listener){
        this.listener = listener;
    }

    //membuat variabel untuk menampung objek yang berguna dalam menjalankan klik
    OnKebutuhanViewHolderClick listener = null;

    //properti menampung list data menggunakan array list untuk menampung data kebutuhan yang akan ditampilkan
    ArrayList<KebutuhanPetcare> listKebutuhan= new ArrayList<>();

    //method setter
    public void setListKebutuhan(ArrayList<KebutuhanPetcare> listKebutuhan){
        this.listKebutuhan = listKebutuhan;
    }

    //method yang digunakan untuk pembuatan tampilan pada data yang akan ditampilkan
    @NonNull
    @Override
    public KebutuhanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflater merupakan objek yang digunakan untuk menampilkan file xml
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //kemudian dibuat view serta diberikan file layout untuk menampilkan item
        View view = inflater.inflate(R.layout.item_kebutuhan, parent, false);
        //membuat objek view holder
        KebutuhanViewHolder viewHolder = new KebutuhanViewHolder(view);
        return viewHolder;
    }

    //memasukkan data kedalam view holder
    @Override
    public void onBindViewHolder(@NonNull KebutuhanViewHolder viewHolder, int position) {
        //membuat objek dan mengambil data dari list
        KebutuhanPetcare kebutuhanPetcare = listKebutuhan.get(position);
        //melakukan binding data dengan view holder
        viewHolder.textKebutuhan.setText(kebutuhanPetcare.namaProduk);
        viewHolder.textHargaKebutuhan.setText(kebutuhanPetcare.hargaProduk.toString());
        if(kebutuhanPetcare.statusGambar == 1){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_royalcanin_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 2){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_alpo_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 3){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_felibite_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 4){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_pedigree_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 5){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_whiskas_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 6){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_biolineshampoo_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 7){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_petshower_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 8){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_sikatmandi_foreground);
        }
        else if(kebutuhanPetcare.statusGambar == 9){
            viewHolder.imageStatus.setImageResource(R.mipmap.ic_sisirhewan_foreground);
        }

    }

    //method yang menginformasikan jumlah data yang dimiliki dengan menggunakan method size
    @Override
    public int getItemCount() {
        return listKebutuhan.size();
    }

}
