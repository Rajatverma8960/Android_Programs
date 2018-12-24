package com.example.rajat.music_player;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar volumeSeekbar = null;
    private AudioManager audioManager = null;

    MediaPlayer song;

    int pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_main);
        initControls();
    }

    //---------------------------


    private void initControls() {
        try {
            volumeSeekbar = (SeekBar) findViewById(R.id.volume);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            volumeSeekbar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            volumeSeekbar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //--------------------------------------------

    public void play(View view)
    {
        if(song==null)
        {
            song= MediaPlayer.create(MainActivity.this,R.raw.raatein);
            song.start();
        }
        else if(!song.isPlaying())
        {
            song.seekTo(pause);
            song.start();
        }

    }
    public void stop(View view)
    {
        if(song==null)
        {
            Toast.makeText(getApplicationContext(),"Please Press Play Button.",Toast.LENGTH_LONG).show();
        }
        else
        {
            song.stop();
            song=null;
        }
    }
    public void pause(View view)
    {
        if(song==null)
        {
            Toast.makeText(getApplicationContext(),"Please Press Play Button.",Toast.LENGTH_LONG).show();
        }
        else
        {
            song.pause();
            pause=song.getCurrentPosition();
        }
    }
}
