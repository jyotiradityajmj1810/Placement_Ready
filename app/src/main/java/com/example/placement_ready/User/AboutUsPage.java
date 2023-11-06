package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.placement_ready.R;

public class AboutUsPage extends AppCompatActivity {
    Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);

//        button_back =findViewById(R.id.back_home);
//        button_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AboutUsPage.super.onBackPressed();
//            }
//        });

    }
}