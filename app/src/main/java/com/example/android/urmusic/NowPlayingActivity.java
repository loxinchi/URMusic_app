package com.example.android.urmusic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class NowPlayingActivity extends AppCompatActivity {

    ImageView coverPhoto;
    TextView artist, songName;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        coverPhoto = findViewById(R.id.now_play_image);
        artist = findViewById(R.id.now_play_artist_textView);
        songName = findViewById(R.id.now_play_song_title);

        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("coverPhoto");
            String aTitle = intent.getStringExtra("artist");
            String aDescription = intent.getStringExtra("songName");

            coverPhoto.setImageResource(pic);
            artist.setText(aTitle);
            songName.setText(aDescription);

            assert actionBar != null;
            actionBar.setTitle(aTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("coverPhoto");
            String aTitle = intent.getStringExtra("artist");
            String aDescription = intent.getStringExtra("songName");

            coverPhoto.setImageResource(pic);
            artist.setText(aTitle);
            songName.setText(aDescription);

            assert actionBar != null;
            actionBar.setTitle(aTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("coverPhoto");
            String aTitle = intent.getStringExtra("artist");
            String aDescription = intent.getStringExtra("songName");

            coverPhoto.setImageResource(pic);
            artist.setText(aTitle);
            songName.setText(aDescription);

            assert actionBar != null;
            actionBar.setTitle(aTitle);
        }

        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("coverPhoto");
            String aTitle = intent.getStringExtra("artist");
            String aDescription = intent.getStringExtra("songName");

            coverPhoto.setImageResource(pic);
            artist.setText(aTitle);
            songName.setText(aDescription);

            assert actionBar != null;
            actionBar.setTitle(aTitle);
        }

        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("coverPhoto");
            String aTitle = intent.getStringExtra("artist");
            String aDescription = intent.getStringExtra("songName");

            coverPhoto.setImageResource(pic);
            artist.setText(aTitle);
            songName.setText(aDescription);

            assert actionBar != null;
            actionBar.setTitle(aTitle);
        }

        // Intent to direct to artist introduction page
        @SuppressLint("CutPasteId") TextView artistTextView = (TextView) findViewById(R.id.now_play_artist_textView);

        artistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(NowPlayingActivity.this, ArtistIntroActivity.class);

                startActivity(numbersIntent);
            }
        });

        // Intent to direct to music store page
        TextView musicStoreTextView = (TextView) findViewById(R.id.purchase_textView);

        musicStoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(NowPlayingActivity.this, MusicStoreActivity.class);

                startActivity(numbersIntent);
            }
        });

        // Switch between Play & Pause icons
        ImageView btnStartPause = findViewById(R.id.bt_start_pause);
        final Boolean[] buttonFlag = {true};
        findViewById(R.id.bt_start_pause).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonFlag[0]){
                    btnStartPause.setImageResource(R.drawable.pause_icon);
                    buttonFlag[0] =false;
            } else{
                    btnStartPause.setImageResource(R.drawable.play_icon);
                    buttonFlag[0] =true;
                }
            }
        });
    }
}

