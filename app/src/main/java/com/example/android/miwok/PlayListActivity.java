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

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.list;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create an arrayList of songs
        final ArrayList<Song> songs = new ArrayList<Song>();
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
        songs.add(new Song("song 12", "artist 12", R.drawable.note));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter playlistsAdapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of songs.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(playlistsAdapter);


    }
}
