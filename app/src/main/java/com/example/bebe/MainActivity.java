package com.example.bebe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ImageButton ib1;

    int Reproducir_sonido;

    SoundPool sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib1 = (ImageButton) findViewById(R.id.cerezas);
        tv1 = (TextView) findViewById(R.id.textView);
        tv1.setText(R.string.Textview);

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);

        Reproducir_sonido = sp.load(this,R.raw.sound_short, 1);


    }

    public void Cereza (View view){
        sp.play(Reproducir_sonido, 1, 1, 1, 0, 0);
    }

    public void Banana (View view){
        MediaPlayer mp =MediaPlayer.create(this, R.raw.sound_long);
        mp.start();
    }
}