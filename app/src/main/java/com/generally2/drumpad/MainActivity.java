package com.generally2.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6,
            sound7, sound8, sound9, sound10, sound11, sound12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool =new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = soundPool.load(getApplicationContext(), R.raw.weird2,1);
        sound2 = soundPool.load(getApplicationContext(), R.raw.weird1,1);
        sound3 = soundPool.load(getApplicationContext(), R.raw.downfilter1,1);
        sound4 = soundPool.load(getApplicationContext(), R.raw.cymbol_ride,1);
        sound5 = soundPool.load(getApplicationContext(), R.raw.closed_hihat1,1);
        sound6 = soundPool.load(getApplicationContext(), R.raw.hihat2,1);
        sound7 = soundPool.load(getApplicationContext(), R.raw.kick1,1);
        sound8 = soundPool.load(getApplicationContext(), R.raw.kick2,1);
        sound9 = soundPool.load(getApplicationContext(), R.raw.clap1,1);
        sound10 = soundPool.load(getApplicationContext(), R.raw.snare,1);
        sound11 = soundPool.load(getApplicationContext(), R.raw.snare2,1);
        sound12 = soundPool.load(getApplicationContext(), R.raw.hihat1,1);
    }

    public void playSound1(View view){
        soundPool.play(sound1, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound2(View view){
        soundPool.play(sound2, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound3(View view){
        soundPool.play(sound3, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound4(View view){
        soundPool.play(sound4, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound5(View view){
        soundPool.play(sound5, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound6(View view){
        soundPool.play(sound6, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound7(View view){
        soundPool.play(sound7, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound8(View view){
        soundPool.play(sound8, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound9(View view){
        soundPool.play(sound9, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound10(View view){
        soundPool.play(sound10, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound11(View view){
        soundPool.play(sound11, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void playSound12(View view){
        soundPool.play(sound12, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
