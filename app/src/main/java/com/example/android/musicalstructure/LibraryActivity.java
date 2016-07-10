package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);


        //Playlist Button
        TextView playlistButton = (TextView) findViewById(R.id.playlists);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        //Song Button
        TextView songsButton = (TextView) findViewById(R.id.songs);
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(LibraryActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });
    }
}
