package com.example.doakatolik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rosario extends AppCompatActivity {
    Button senin,selasa, kamis, minggu,btnback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_rosario);
        selasa = (Button) findViewById(R.id.btnselasa);
        senin = (Button) findViewById(R.id.btnsenin);
        kamis = (Button) findViewById(R.id.btnkamis);
        minggu = (Button) findViewById(R.id.btnminggu);
        btnback2 = (Button) findViewById(R.id.btnback2);
        senin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rosario.this, senin.class);
                startActivity(intent);

            }
        });
        selasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rosario.this,Selasa.class);
                startActivity(intent);

            }
        });
        kamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rosario.this, kamis.class);
                startActivity(intent);

            }
        });
        minggu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rosario.this, minggu.class);
                startActivity(intent);

            }
        });
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rosario.this, act_menu.class);
                startActivity(intent);

            }
        });
    }
}
