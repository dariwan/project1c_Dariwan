package com.example.project1c_dariwan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    ImageView image;
    TextView nama;
    TextView deskripsi;
    ProgramViewHolder(View v){
        image = v.findViewById(R.id.imageView);
        nama = v.findViewById(R.id.judul);
        deskripsi = v.findViewById(R.id.deskripsi);
    }
}
