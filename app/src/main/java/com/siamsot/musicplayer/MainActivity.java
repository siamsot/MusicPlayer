package com.siamsot.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Below we set all the textviews of the app
        TextView library = findViewById(R.id.library2);
        TextView playingNow = findViewById(R.id.playing);
        TextView whatsNew = findViewById(R.id.whatsnew);
        TextView recently = findViewById(R.id.recently);

        //Below we set all the OnClickListeners
        library.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainActivity.this, Library.class);
                startActivity(libraryIntent);
            }
        });
        playingNow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent playingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playingIntent);
            }
        });
        whatsNew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent whatsNewIntent = new Intent(MainActivity.this, WhatsNew.class);
                startActivity(whatsNewIntent);
            }
        });
        recently.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent recentIntent = new Intent(MainActivity.this, Recently_played.class);
                startActivity(recentIntent);
            }
        });
    }}

