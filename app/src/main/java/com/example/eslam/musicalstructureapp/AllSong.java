package com.example.eslam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class AllSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_song);
        ArrayList<SongDetails> song = new ArrayList<SongDetails>();
        song.add(new SongDetails(getResources().getString(R.string.TheGreatest),getResources().getString(R.string.Sia) , "3:31"));
        song.add(new SongDetails(getResources().getString(R.string.Faded), getResources().getString(R.string.AlanWalker), "3:32"));
        song.add(new SongDetails(getResources().getString(R.string.Alive), getResources().getString(R.string.Sia), "4:23"));
        song.add(new SongDetails(getResources().getString(R.string.Bird), getResources().getString(R.string.Sia), "4:12"));
        Adabter adabter = new Adabter(this, song);
        ListView list = findViewById(R.id.list_song);
        list.setAdapter(adabter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlaying = new Intent(AllSong.this, NowPlaying.class);
                startActivity(nowPlaying);
            }
        });
    }
}