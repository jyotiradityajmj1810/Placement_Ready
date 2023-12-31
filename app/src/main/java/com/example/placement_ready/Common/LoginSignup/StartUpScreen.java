package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.placement_ready.R;

public class StartUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void login_screen (View view){
        Intent intent =new Intent(getApplicationContext(), Login.class);
        startActivity(intent);
        finish();
    }

    public void signup_screen (View view){
        Intent intent =new Intent(getApplicationContext(), Signup.class);
        startActivity(intent);
        finish();
    }
}