package com.example.placement_ready.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_Adepter;
import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_helperClass;
import com.example.placement_ready.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {
    RecyclerView mostviewed_recylerView;
    RecyclerView.Adapter adapter;

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
        mostviewed_recylerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<mostviewed_helperClass> mostviewedlocation=new ArrayList<>();
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.btn1,"Test 1","dfghjkkfdffgf dgfhjkfgjgjgghjgjghghf fccgcccfghgh"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        adapter = new mostviewed_Adepter(mostviewedlocation);
        mostviewed_recylerView.setAdapter(adapter);




    }
}