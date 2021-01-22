package com.example.android.urmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of musics
        ArrayList<MusicData> musics = new ArrayList<MusicData>();
        musics.add(new MusicData("Run Up", "Lazer", R.drawable.lazer_run_up));
        musics.add(new MusicData("Brasil Carnaval Mix", "Lazer", R.drawable.lazer_carnaval));
        musics.add(new MusicData("Fever", "Lazer", R.drawable.lazer_fever));
        musics.add(new MusicData("Powerful", "Lazer", R.drawable.lazer_powerful));
        musics.add(new MusicData("Lean On", "Lazer", R.drawable.lazer_lean_on));

        // Create an {@link MusicDataAdapter}, whose data source is a list of {@link MusicData}. The
        // adapter knows how to create list items for each item in the list.
        MusicDataAdapter musicDataAdapter = new MusicDataAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.full_song_listview);

        // Make the {@link ListView} use the {@link MusicDataAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MusicData} in the list.
        listView.setAdapter(musicDataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MusicData currentMusicData = musics.get(position);

                Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);

                intent.putExtra("coverPhoto", currentMusicData.getImageResourceId());
                intent.putExtra("artist", currentMusicData.getArtistName());
                intent.putExtra("songName", currentMusicData.getSongName());
                startActivity(intent);
            }
        });
    }
}