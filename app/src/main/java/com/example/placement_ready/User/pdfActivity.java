package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.placement_ready.R;
import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("react.pdf").load();
    }
    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), Resource_video.class);
        startActivity(intent);
        finish();
    }

}