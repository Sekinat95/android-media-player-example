package com.example.yahya.androidmediaplayerexample;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = (Button) findViewById(R.id.play);
         mediaPlayer = MediaPlayer.create(this, R.raw.hello);
        playButton.setOnClickListener(new View.OnClickListener(){
        @Override
            public  void onClick (View view){
            //Toast.makeText(MainActivity.this, "play", Toast.LENGTH_SHORT).show();
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    Toast.makeText(MainActivity.this,"I'm done!",Toast.LENGTH_SHORT).show();
                }
            }

            );
        }

        }) ;
        Button pauseButton = (Button) findViewById(R.id.pause);
        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View view){
                //Toast.makeText(MainActivity.this, "pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }

        }) ;
    }


}
