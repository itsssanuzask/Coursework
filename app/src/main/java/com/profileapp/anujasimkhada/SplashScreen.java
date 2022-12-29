package com.profileapp.anujasimkhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {


private static int SPLASH_TIMER=5000;


    // Variables
    ImageView splashBackgroundImage;
    TextView poweredByLine;

     //Animations
      Animation sideAnim, bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Hooks
        splashBackgroundImage=findViewById(R.id.splash_background_image);
        poweredByLine=findViewById(R.id.powered_by_line);



        //Animations
        sideAnim= AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);



        //set Animation on Elements
        splashBackgroundImage.setAnimation(sideAnim);
        poweredByLine.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();


            }
        },SPLASH_TIMER);




    }
}