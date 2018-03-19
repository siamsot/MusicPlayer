package com.siamsot.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WhatsNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_new);

        ImageView album1 = findViewById(R.id.alb1);
        ImageView album2 = findViewById(R.id.alb2);
        ImageView album3 = findViewById(R.id.alb3);
        Button back = findViewById(R.id.back);

        album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAlb1 = new Intent(WhatsNew.this, NowPlaying.class);
                startActivity(openAlb1);}
        });

        album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAlb2 = new Intent(WhatsNew.this, NowPlaying.class);
                startActivity(openAlb2);
            }});
        album3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAlb3 = new Intent(WhatsNew.this, NowPlaying.class);
                startActivity(openAlb3);
            }});
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(WhatsNew.this, MainActivity.class);
                startActivity(back);
            }});
    }
}