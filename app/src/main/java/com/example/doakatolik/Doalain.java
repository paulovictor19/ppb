package com.example.doakatolik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doalain extends AppCompatActivity {
    Button btnDoaharapan,btnDoacintakasih, btnDoaperjalanan, btnDoasakit, btnback2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_doalain);
        btnDoaharapan = (Button) findViewById(R.id.btnDoaharapan);
        btnDoaperjalanan = (Button) findViewById(R.id.btnDoaperjalanan);
        btnDoasakit = (Button) findViewById(R.id.btnDoasakit);
        btnDoacintakasih = (Button) findViewById(R.id.btnDoacintakasih);
        btnDoaharapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doalain.this, harapan.class);
                startActivity(intent);

            }
        });
        btnDoaperjalanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doalain.this,perjalanan.class);
                startActivity(intent);
            }
        });
        btnDoacintakasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doalain.this,cintakasih.class);
                startActivity(intent);
            }
        });
        btnDoasakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doalain.this,sakit.class);
                startActivity(intent);
            }
        });
        btnback2 = (Button) findViewById(R.id.btnback2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doalain.this, act_menu.class);
                Doalain.this.startActivity(intent);
                Doalain.this.finish();

            }
        });
    }
}