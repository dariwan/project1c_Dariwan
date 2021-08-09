package com.example.project1c_dariwan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list1 ;
    String [] nama = {"Facebook", "Instagram", "Twitter", "Portofolio", "Wordpress"};
    String [] deskripsi = {"Dariwan", "Null", "@dariwan20", "https://dariwan.github.io/", "https://inffis846675385.wordpress.com"};
    int [] image = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1 = (ListView)findViewById(R.id.list);
        ProgramAdapter adapter = new ProgramAdapter(this, nama, image, deskripsi);
        list1.setAdapter(adapter);
    }
}