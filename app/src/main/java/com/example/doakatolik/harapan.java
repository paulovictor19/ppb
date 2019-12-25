package com.example.doakatolik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class harapan extends AppCompatActivity {
Button btnback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_harapan);
        btnback2 = (Button) findViewById(R.id.btnback2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(harapan.this, Doalain.class);
                startActivity(intent);
            }
        });

    }
}
