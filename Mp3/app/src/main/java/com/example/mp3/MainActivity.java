package com.example.mp3;

import android.media.ImageWriter;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String[] nombre ={"Monster","Sympnp","All nightmare","Zero absoluty", "Nightwich"  ,"no game no life"};


    int i = 0;
    int j=0;
    MediaPlayer song[] = new MediaPlayer[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song[0] = MediaPlayer.create(MainActivity.this, R.raw.song);
        song[1] = MediaPlayer.create(MainActivity.this, R.raw.song2);
        song[2] = MediaPlayer.create(MainActivity.this, R.raw.song3);
        song[3] = MediaPlayer.create(MainActivity.this, R.raw.song4);
        song[4] = MediaPlayer.create(MainActivity.this, R.raw.song5);
        song[5] = MediaPlayer.create(MainActivity.this, R.raw.song6);




        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        Button btnPause = (Button) findViewById(R.id.btnPause);
        Button btnStop = (Button) findViewById(R.id.btnStop);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        Button btnBack = (Button) findViewById(R.id.Back);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final ImageView img = (ImageView) findViewById(R.id.imageView);





        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (song[i].isPlaying()) {
                    Toast mensaje = Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT);
                    mensaje.show();
                } else {
                    song[i].start();
                    Toast mensaje = Toast.makeText(getApplicationContext(), "Pausado", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song[i].pause();
                Toast mensaje = Toast.makeText(getApplicationContext(), "Pausado", Toast.LENGTH_SHORT);
                mensaje.show();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song[i].stop();
                Toast mensaje = Toast.makeText(getApplicationContext(), "muerto", Toast.LENGTH_SHORT);
                mensaje.show();
                song[0] = MediaPlayer.create(MainActivity.this, R.raw.song);
                song[1] = MediaPlayer.create(MainActivity.this, R.raw.song2);
                song[2] = MediaPlayer.create(MainActivity.this, R.raw.song3);
                song[3] = MediaPlayer.create(MainActivity.this, R.raw.song4);
                song[4] = MediaPlayer.create(MainActivity.this, R.raw.song5);
                song[5] = MediaPlayer.create(MainActivity.this, R.raw.song6);

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i < song.length - 1) {

                    if (song[i].isPlaying()) {
                        song[i].stop();
                        i++;
                        song[i].start();
                        if (i == 0) {
                            textView.setBackgroundResource(R.drawable.image);
                            textView.setText(nombre[i]);
                        } else if (i == 1) {
                            textView.setBackgroundResource(R.drawable.image2);
                            textView.setText(nombre[i]);
                        } else if (i == 2) {
                            img.setBackgroundResource(R.drawable.image3);
                            textView.setText(nombre[i]);
                        } else if (i == 3) {
                            img.setBackgroundResource(R.drawable.image4);
                            textView.setText(nombre[i]);
                        } else if (i == 4) {
                            img.setBackgroundResource(R.drawable.image5);
                            textView.setText(nombre[i]);
                        } else if (i == 5) {
                            img.setBackgroundResource(R.drawable.image6);
                            textView.setText(nombre[i]);
                        }
                    } else {
                        i++;
                        if (i == 0) {
                            img.setBackgroundResource(R.drawable.image);
                            textView.setText(nombre[i]);
                        } else if (i == 1) {
                            img.setBackgroundResource(R.drawable.image2);
                            textView.setText(nombre[i]);
                        } else if (i == 2) {
                            img.setBackgroundResource(R.drawable.image3);
                            textView.setText(nombre[i]);
                        } else if (i == 3) {
                            img.setBackgroundResource(R.drawable.image4);
                            textView.setText(nombre[i]);
                        } else if (i == 4) {
                            img.setBackgroundResource(R.drawable.image5);
                            textView.setText(nombre[i]);
                        } else if (i == 5) {
                            img.setBackgroundResource(R.drawable.image6);
                            textView.setText(nombre[i]);
                        }
                    }
                } else {
                    Toast mensaje = Toast.makeText(getApplicationContext(), "No hay mas canciones", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }

        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i >= 1){

                    if(song[i].isPlaying()){
                        song[i].stop();

                        song[0] = MediaPlayer.create(MainActivity.this, R.raw.song);
                        song[1] = MediaPlayer.create(MainActivity.this, R.raw.song2);
                        song[2] = MediaPlayer.create(MainActivity.this, R.raw.song3);
                        song[3] = MediaPlayer.create(MainActivity.this, R.raw.song4);
                        song[5] = MediaPlayer.create(MainActivity.this, R.raw.song5);
                        song[4] = MediaPlayer.create(MainActivity.this, R.raw.song6);
                        i--;
                        if(i == 0){
                            img.setBackgroundResource(R.drawable.image);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 1){
                            img.setBackgroundResource(R.drawable.image2);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 2){
                            img.setBackgroundResource(R.drawable.image3);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 3){
                            img.setBackgroundResource(R.drawable.image4);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 4){
                            img.setBackgroundResource(R.drawable.image5);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 5){
                            img.setBackgroundResource(R.drawable.image6);
                            textView.setText(nombre[i]);
                        }
                        song[i].start();

                    }else{
                        i--;
                        if(i == 0){
                            img.setBackgroundResource(R.drawable.image);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 1){
                            img.setBackgroundResource(R.drawable.image2);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 2){
                            img.setBackgroundResource(R.drawable.image3);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 3){
                            img.setBackgroundResource(R.drawable.image4);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 4){
                            img.setBackgroundResource(R.drawable.image5);
                            textView.setText(nombre[i]);
                        }
                        else if(i == 5){
                            img.setBackgroundResource(R.drawable.image6);
                            textView.setText(nombre[i]);
                        }

                    }
                }else{
                    Toast mensaje = Toast.makeText(getApplicationContext(), "No hay mas canciones", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }

        });
    }
}
