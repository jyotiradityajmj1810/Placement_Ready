package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.placement_ready.R;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_app_signup);

    }
    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), StartUpScreen.class);
        startActivity(intent);
        finish();
    }

    public void next (View view){
        Intent intent =new Intent(getApplicationContext(), Signup2.class);
        startActivity(intent);
        finish();
    }
}