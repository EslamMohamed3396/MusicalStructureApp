package com.example.eslam.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eslam on 2/22/2018.
 */

public class Adabter extends ArrayAdapter<SongDetails> {
    public Adabter(Activity context, ArrayList<SongDetails> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SongDetails song = getItem(position);
        View list = convertView;
        if (list == null) {
            list = LayoutInflater.from(getContext()).inflate(R.layout.song_details, parent, false);
        }
        TextView name = list.findViewById(R.id.songname);
        name.setText(song.getName());
        TextView artist = list.findViewById(R.id.songartist);
        artist.setText(song.getArtist());
        TextView duration = list.findViewById(R.id.songduration);
        duration.setText(song.getDuration());
        return list;
    }
}