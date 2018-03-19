package com.siamsot.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

    Button buy_button = findViewById(R.id.buy);
    Button back = findViewById(R.id.back);

    buy_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent buyIntent = new Intent(NowPlaying.this, BuyNow.class);
            startActivity(buyIntent);
        }
    });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(back);
            }});
    }

}
