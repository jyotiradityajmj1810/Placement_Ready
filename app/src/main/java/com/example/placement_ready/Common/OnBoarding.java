package com.example.placement_ready.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


import com.example.placement_ready.Common.LoginSignup.StartUpScreen;
import com.example.placement_ready.HelperClasses.SliderAdepter;
import com.example.placement_ready.R;
import com.example.placement_ready.User.UserDashboard;


public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;
    SliderAdepter sliderAdapter;
    TextView[] dots;
    Button GetStarted;
    Animation animation;
    int currentPos;
    Button skipButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_on_bording);


        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);
        GetStarted = findViewById(R.id.get_started);
        skipButton=findViewById(R.id.skip_btn);


        sliderAdapter = new SliderAdepter(this);
        viewPager.setAdapter(sliderAdapter);


        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Assuming you want to skip to the third page
                viewPager.setCurrentItem(2);
            }
        });

    }
    public void login_signup(View view) {

            Intent intent = new Intent(getApplicationContext(), StartUpScreen.class);
            startActivity(intent);
            finish();
        }


    public void next(View view) {

        viewPager.setCurrentItem(currentPos + 1);
    }
    public void prev(View view) {

        viewPager.setCurrentItem(currentPos - 1 );
    }
    private void addDots(int position) {

        dots = new TextView[3];
        dotsLayout.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.md_theme_dark_secondary));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            currentPos = position;

            if (position == 0) {
                GetStarted.setVisibility(View.INVISIBLE);
                skipButton.setVisibility(View.VISIBLE);
            } else if (position == 1) {
                GetStarted.setVisibility(View.INVISIBLE);
                skipButton.setVisibility(View.VISIBLE);

            } else {
                animation = AnimationUtils.loadAnimation(OnBoarding.this, R.anim.botton_anim);
                GetStarted.setAnimation(animation);
                GetStarted.setVisibility(View.VISIBLE);
                skipButton.setVisibility(View.INVISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };



}