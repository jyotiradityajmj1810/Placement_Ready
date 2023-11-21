package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.placement_ready.R;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    TextView ques;
    Button ansa,ansb,ansc,ansd;
    Button submit;

    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ques =findViewById(R.id.ques);
        ansa=findViewById(R.id.ansa);
        ansb=findViewById(R.id.ansb);
        ansc=findViewById(R.id.ansc);
        ansd=findViewById(R.id.ansd);
        submit=findViewById(R.id.submit);

        ansa.setOnClickListener(this);
        ansb.setOnClickListener(this);
        ansc.setOnClickListener(this);
        ansd.setOnClickListener(this);
        submit.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

    }
}