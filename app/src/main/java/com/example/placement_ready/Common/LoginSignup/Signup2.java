package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.placement_ready.R;

import java.util.Calendar;

public class Signup2 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedGender;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_signup2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        radioGroup=findViewById(R.id.radio_groups);
        datePicker=findViewById(R.id.age);
    }
    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), Signup.class);
        startActivity(intent);
        finish();
    }
    public void next (View view){
        if (!validategender()|!validateage()){
            return;
        }

        selectedGender=findViewById(radioGroup.getCheckedRadioButtonId());
        String _gender=selectedGender.getText().toString();

        int day = datePicker.getDayOfMonth();
        int month =datePicker.getMonth();
        int year = datePicker.getYear();
        String _date =day+"/"+month+"/"+year;

        Intent intent =new Intent(getApplicationContext(), Signup3.class);
        startActivity(intent);
        finish();
    }
    private boolean validategender(){
        if (radioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"Please Select Gender",Toast.LENGTH_SHORT).show();
            return false;
        }else {
            return true;
        }
    }

    private boolean validateage(){
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int UserAge = datePicker.getYear();
        int isAgeValid = CurrentYear-UserAge;
        if (isAgeValid<18){
            Toast.makeText(this,"You are not eligible to register",Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return true;
        }
    }
}