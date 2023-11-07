package com.example.placement_ready.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_Adepter;
import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_helperClass;
import com.example.placement_ready.HelperClasses.Homeadepter.videos_Adepter;
import com.example.placement_ready.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView mostviewed_recylerView,videos_recylerView;
    RecyclerView.Adapter adapter;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        mostviewed_recylerView=findViewById(R.id.mostviewed_recylerView);
        videos_recylerView=findViewById(R.id.videos_recylerView);
        videos_recylerView();
        mostviewed_recylerView();


        drawerLayout = findViewById(R.id.drawer_layout);
        menuIcon = findViewById(R.id.menu_icon);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);



        naviagtionDrawer();

    }

    private void naviagtionDrawer() {

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
            else drawerLayout.closeDrawer(GravityCompat.START);
        super.onBackPressed();
    }

    private void videos_recylerView() {
        videos_recylerView.setHasFixedSize(true);
        videos_recylerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        ArrayList<mostviewed_helperClass> videoslocation=new ArrayList<>();
        videoslocation.add(new mostviewed_helperClass(R.drawable.btn1,"sfsf","dfghjkkfdffgf dgfhjkfgjgjgghjgjghghf fccgcccfghgh"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));

        adapter = new videos_Adepter(videoslocation);
        videos_recylerView.setAdapter(adapter);
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.nav_aboutus){
            Intent intent=new Intent(getApplicationContext(), AboutUs.class);
            startActivity(intent);
        }
        return true;

    }
}