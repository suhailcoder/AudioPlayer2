package com.example.matrix02.audioplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener   {

    Button b1,b2,b3;
    MediaPlayer mp,mp1,mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.Button1);
        b2=(Button) findViewById(R.id.Button2);
        b3=(Button) findViewById(R.id.Button3);
        mp=MediaPlayer.create(getApplicationContext(), R.raw.a);
        mp1=MediaPlayer.create(getApplicationContext(), R.raw.a1);
        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch(v.getId()){
                    case R.id.button1:
                        mp.start();
                        break;
                    default:
                        break;
                }
            }});

        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch(v.getId()){
                    case R.id.button2:
                        mp.pause();
                        break;
                    default:
                        break;
                }
            }});
        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch(v.getId()){
                    case R.id.button2:
                        mp1.start();
                        break;
                    default:
                        break;
                }
            }});

    }


}