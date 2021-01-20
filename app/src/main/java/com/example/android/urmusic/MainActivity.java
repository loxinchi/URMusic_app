package com.example.android.urmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of musics
        ArrayList<MusicData> musics = new ArrayList<MusicData>();
        musics.add(new MusicData("Run Up", "Major Lazer", R.drawable.major_lazer_art));
        musics.add(new MusicData("Brasil Carnaval Mix", "Major Lazer", R.drawable.major_lazer_carnaval));
        musics.add(new MusicData("Fever", "Major Lazer", R.drawable.major_lazer_fever));
        musics.add(new MusicData("Powerful", "Major Lazer", R.drawable.major_lazer_powerful));
        musics.add(new MusicData("Lean On", "Major Lazer", R.drawable.major_lazer_lean_on));

        // Create an {@link MusicDataAdapter}, whose data source is a list of {@link MusicData}. The
        // adapter knows how to create list items for each item in the list.
        MusicDataAdapter musicDataAdapter = new MusicDataAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.full_song_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(musicDataAdapter);
    }
}