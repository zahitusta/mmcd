/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class myFavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("song 1", "artist 1", R.drawable.note));
        songs.add(new Song("song 2", "artist 2", R.drawable.note));
        songs.add(new Song("song 3", "artist 3", R.drawable.note));
        songs.add(new Song("song 4", "artist 4", R.drawable.note));
        songs.add(new Song("song 5", "artist 5", R.drawable.note));
        songs.add(new Song("song 6", "artist 6", R.drawable.note));
        songs.add(new Song("song 7", "artist 7", R.drawable.note));
        songs.add(new Song("song 8", "artist 9", R.drawable.note));
        songs.add(new Song("song 10", "artist 10", R.drawable.note));
        songs.add(new Song("song 11", "artist 11", R.drawable.note));
        songs.add(new Song("song 12", "artist 12",R.drawable.note ));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter playlistsAdapter = new SongAdapter (this,songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(playlistsAdapter);
    }
}
