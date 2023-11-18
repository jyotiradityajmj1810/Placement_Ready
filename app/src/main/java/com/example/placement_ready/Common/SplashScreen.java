package com.example.placement_ready.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.placement_ready.Common.LoginSignup.Login;
import com.example.placement_ready.R;
import com.example.placement_ready.User.UserDashboard;


public class SplashScreen extends AppCompatActivity {
    ImageView appback1,appback2,applogo;
    TextView appname;

    SharedPreferences on_bording_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);


        applogo = findViewById(R.id.applogo);
        appback1 = findViewById(R.id.appback1);
        appback2 = findViewById(R.id.appback2);
        appname = findViewById(R.id.appname);
        LottieAnimationView lottieAnimationView = findViewById(R.id.ani);
        lottieAnimationView.setAnimation(R.raw.ww);

        appback1.animate().translationY(-3500).setDuration(770).setStartDelay(2600);
        appback2.animate().translationY(-3500).setDuration(770).setStartDelay(2600);
        applogo.animate().translationY(-3000).setDuration(770).setStartDelay(2600);
        appname.animate().translationY(3000).setDuration(770).setStartDelay(2600);
        lottieAnimationView.animate().translationY(3000).setDuration(770).setStartDelay(2600);

        new Handler().postDelayed(() -> {
            on_bording_screen=getSharedPreferences("on_boarding_screen", MODE_PRIVATE);
            boolean if_first_time = on_bording_screen.getBoolean("first_time",true);

            if(if_first_time){
                SharedPreferences.Editor editor=on_bording_screen.edit();
                editor.putBoolean("first_time",false);
                editor.commit();

            Intent intent = new Intent(getApplicationContext(), OnBoarding.class);
            startActivity(intent);
            finish();

            }
            else {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }


        },3110 );

    }



}