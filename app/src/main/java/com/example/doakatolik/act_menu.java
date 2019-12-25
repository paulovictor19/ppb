package com.example.doakatolik;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class  act_menu extends AppCompatActivity  {
    Button btnDoautama, btnDoalain, btnRosario, btnNovena, btnbackabout,btnprofile;
    ViewFlipper viewFlipper;
    Animation fade_in,fade_out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_menu);
        btnDoautama = (Button) findViewById(R.id.btndoautma);
        btnDoalain = (Button) findViewById(R.id.btndoalain);
        btnRosario = (Button) findViewById(R.id.btnrosario);
        btnNovena = (Button) findViewById(R.id.btnnovena);

        btnDoautama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, Doautama.class);
                startActivity(intent);
            }
        });

        btnDoalain = (Button) findViewById(R.id.btndoalain);
        btnDoalain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, Doalain.class);
                startActivity(intent);
            }
        });
        btnRosario = (Button) findViewById(R.id.btnrosario);
        btnRosario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, Rosario.class);
                startActivity(intent);
            }
        });

        btnNovena = (Button) findViewById(R.id.btnnovena);
        btnNovena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, Novena.class);
                startActivity(intent);
            }
        });
        btnDoalain = (Button) findViewById(R.id.btndoalain);
        btnDoalain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, Doalain.class);
                startActivity(intent);
            }
        });
        btnbackabout = (Button) findViewById(R.id.btnbackabout);
        btnbackabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, About.class);
                startActivity(intent);
            }
        });
        btnprofile = (Button) findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act_menu.this, profile.class);
               startActivity(intent);

            }
        });

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        viewFlipper.setAnimation(fade_in);
        viewFlipper.setAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(500);
        viewFlipper.startFlipping();


    }
}

