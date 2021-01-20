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
        ListView listView = (ListView) findViewById(R.id.full_song_listview);

        // Make the {@link ListView} use the {@link MusicDataAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link MusicData} in the list.
        listView.setAdapter(musicDataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("coverPhoto", musics.get(0).getImageResourceId());
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("artist", musics.get(0).getArtistName());
                    intent.putExtra("songName", musics.get(0).getSongName());
                    // also put your position
                    intent.putExtra("position", "" + 0);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("coverPhoto", musics.get(1).getImageResourceId());
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("artist", musics.get(1).getArtistName());
                    intent.putExtra("songName", musics.get(1).getSongName());
                    // also put your position
                    intent.putExtra("position", "" + 1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("coverPhoto", musics.get(2).getImageResourceId());
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("artist", musics.get(2).getArtistName());
                    intent.putExtra("songName", musics.get(2).getSongName());
                    // also put your position
                    intent.putExtra("position", "" + 2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("coverPhoto", musics.get(3).getImageResourceId());
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("artist", musics.get(3).getArtistName());
                    intent.putExtra("songName", musics.get(3).getSongName());
                    // also put your position
                    intent.putExtra("position", "" + 3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("coverPhoto", musics.get(4).getImageResourceId());
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("artist", musics.get(4).getArtistName());
                    intent.putExtra("songName", musics.get(4).getSongName());
                    // also put your position
                    intent.putExtra("position", "" + 4);
                    startActivity(intent);
                }
            }
        });
    }
}