package com.example.doakatolik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Novena extends AppCompatActivity {
    Button btnkududs,btnwasiat, btnlourdes, btntadeus,btnantonius,btnback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_novena);
        btnkududs = (Button) findViewById(R.id.btnkududs);
        btnwasiat = (Button) findViewById(R.id.btnwasiat);
        btnlourdes = (Button) findViewById(R.id.btnlourdes);
        btntadeus = (Button) findViewById(R.id.btntadeus);
        btnantonius = (Button) findViewById(R.id.btnantonius);
        btnback2= (Button) findViewById(R.id.btnback2);
        btnkududs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, hatikudus.class);
                startActivity(intent);

            }
        });
        btntadeus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, tadeus.class);
                startActivity(intent);

            }
        });
        btnantonius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, antonius.class);
                startActivity(intent);

            }
        });
        btnlourdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, lourdes.class);
                startActivity(intent);

            }
        });
        btnwasiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, medaliwasiat.class);
                startActivity(intent);

            }
        });

        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novena.this, act_menu.class);
                startActivity(intent);

            }
        });
    }
}
