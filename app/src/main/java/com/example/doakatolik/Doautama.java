package com.example.doakatolik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doautama extends AppCompatActivity {
    Button btnsalib,btnmaria, btnKemulian, btncredo,btnpagi,btnMalam,btnback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_doautama);
        btnsalib = (Button) findViewById(R.id.btnsalib);
        btnmaria = (Button) findViewById(R.id.btnmaria);
        btnKemulian = (Button) findViewById(R.id.btnKemulian);
        btncredo = (Button) findViewById(R.id.btncredo);
        btnpagi = (Button) findViewById(R.id.btnpagi);
        btnMalam = (Button) findViewById(R.id.btnMalam);
        btnback2 = (Button) findViewById(R.id.btnback2);
        btnsalib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this, salib.class);
                startActivity(intent);

            }
        });
        btnKemulian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this,kemulian.class);
                startActivity(intent);

            }
        });
        btnmaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this,salammaria.class);
                startActivity(intent);

            }
        });
        btncredo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this,credo.class);
                startActivity(intent);

            }
        });
        btnpagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this,pagi.class);
                startActivity(intent);

            }
        });
        btnMalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this,malam.class);
                startActivity(intent);

            }
        });
        btnback2 = (Button) findViewById(R.id.btnback2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doautama.this, act_menu.class);
                Doautama.this.startActivity(intent);
                Doautama.this.finish();

            }
        });
    }
}
