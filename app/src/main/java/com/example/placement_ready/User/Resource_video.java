package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

import com.example.placement_ready.Common.LoginSignup.StartUpScreen;
import com.example.placement_ready.R;

public class Resource_video extends AppCompatActivity {
    Button pdf,test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_video);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebView webView = findViewById(R.id.videoPlayer);
        String video = "<iframe width=\"330\" height=\"220\" src=\"https://www.youtube-nocookie.com/embed/eILUmCJhl64?si=Wq7wUVRkfrsUuTqp&amp;start=20\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        webView.loadData(video, "text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        pdf=findViewById(R.id.pdf);
        test=findViewById(R.id.test);

        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pdfActivity.class);
                startActivity(intent);
                finish();
            }
        });
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), TestActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });



    }
    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), UserDashboard.class);
        startActivity(intent);
        finish();
    }
}