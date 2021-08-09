package com.example.project1c_dariwan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ProgramAdapter extends ArrayAdapter<String> {
    Context konteks ;
    int [] image;
    String [] nama;
    String [] deskripsi;
    public ProgramAdapter(Context context, String[]nama, int[]image, String[]deskripsi) {
        super(context, R.layout.tampilan, R.id.judul, nama);
        this.konteks = context;
        this.image = image;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View item1 = convertView;
        ProgramViewHolder holder = null;
        if(item1 == null) {
            LayoutInflater Layout = (LayoutInflater) konteks.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item1 = Layout.inflate(R.layout.tampilan,parent,false);
            holder = new ProgramViewHolder(item1);
            item1.setTag(holder);
        }
        else {
            holder = (ProgramViewHolder) item1.getTag();
        }
        holder.image.setImageResource(image[position]);
        holder.nama.setText(nama[position]);
        holder.deskripsi.setText(deskripsi[position]);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You Click "+nama[position], Toast.LENGTH_SHORT).show();;
            }
        });


        return item1;
    }
}
