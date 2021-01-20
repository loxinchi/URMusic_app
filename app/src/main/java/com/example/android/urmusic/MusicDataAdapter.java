package com.example.android.urmusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*
 * {@link MusicDataAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link MusicData} objects.
 * */
public class MusicDataAdapter extends ArrayAdapter<MusicData> {
    private static final String LOG_TAG = MusicDataAdapter.class.getSimpleName();

    /**
     * This is a Custom constructor.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param musicData A List of MusicData objects to display in a list
     */
    public MusicDataAdapter(Activity context, ArrayList<MusicData> musicData) {
        super(context, 0, musicData);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false);
        }

        MusicData currentMusicData = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_title);
        nameTextView.setText(currentMusicData.getSongName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        numberTextView.setText(currentMusicData.getArtistName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_cover);
        iconView.setImageResource(currentMusicData.getImageResourceId());

        return listItemView;
    }
}
