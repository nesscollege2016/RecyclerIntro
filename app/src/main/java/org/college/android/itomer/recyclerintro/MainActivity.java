package org.college.android.itomer.recyclerintro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SongViewHolder song1, song2, song3, song4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Song> songs = getSongsFromService();
        song1 = new SongViewHolder(findViewById(R.id.song1), songs.get(0));
        song2 = new SongViewHolder(findViewById(R.id.song2), songs.get(1));
        song3 = new SongViewHolder(findViewById(R.id.song3), songs.get(2));
        song4 = new SongViewHolder(findViewById(R.id.song4), songs.get(3));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public ArrayList<Song> getSongsFromService() {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Hello", "Adele", "4:23", "The Song Lyrics", R.drawable.adele));
        songs.add(new Song("Nothing Like You", "Rihanna", "4:53", "The Song Lyrics", R.drawable.rihanna));
        songs.add(new Song("שיר על השכן", "Keren Peles", "3:25", "The Song Lyrics", R.drawable.keren));
        songs.add(new Song("אתמול היה טוב", "שלמה ארצי", "8:57", "The Song Lyrics", R.drawable.shlomo));

        return songs;
    }
}

class SongViewHolder {
    TextView tvArtist;
    TextView tvSongName;
    TextView tvDuration;
    ImageView ivAlbum;

    public SongViewHolder(View songView, Song song) {
        this.tvArtist = (TextView) songView.findViewById(R.id.tvArtist);
        this.tvSongName = (TextView) songView.findViewById(R.id.tvSongName);
        this.tvDuration = (TextView) songView.findViewById(R.id.tvDuration);
        this.ivAlbum = (ImageView) songView.findViewById(R.id.ivAlbum);

        tvArtist.setText(song.artist);
        tvSongName.setText(song.name);
        tvDuration.setText(song.duration);
        ivAlbum.setImageResource(song.albumResID);
    }
}