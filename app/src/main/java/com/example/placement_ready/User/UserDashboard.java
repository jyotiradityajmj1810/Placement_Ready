package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.placement_ready.R;

public class UserDashboard extends AppCompatActivity {
    RecyclerView mostviewed_recylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        mostviewed_recylerView=findViewById(R.id.mostviewed_recylerView);
        mostviewed_recylerView();

    }

    private void mostviewed_recylerView() {

        mostviewed_recylerView.setHasFixedSize(true);
        mostviewed_recylerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }
}