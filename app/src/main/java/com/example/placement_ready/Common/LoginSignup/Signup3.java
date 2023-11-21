package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.placement_ready.HelperClasses.User;
import com.example.placement_ready.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.hbb20.CountryCodePicker;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup3 extends AppCompatActivity {
    TextInputLayout phoneNumber;
    CountryCodePicker countryCodePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_signup3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        countryCodePicker=findViewById(R.id.country_code_picker);
        phoneNumber=findViewById(R.id.signup_phone_number);

    }

    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), Signup2.class);
        startActivity(intent);
        finish();
    }

    public void nextScreen(View view){
        if (!validatePhoneNumber()){
            return;
        }
        Intent intent=new Intent(getApplicationContext(), StartUpScreen.class);
        startActivity(intent);
        finish();

    }

    private boolean validatePhoneNumber(){
        String val =phoneNumber.getEditText().getText().toString().trim();
        if (val.isEmpty()){
            phoneNumber.setError("Field can not be empty");
            return false;
        }else {
            phoneNumber.setError(null);
            phoneNumber.setErrorEnabled(false);
            return true;
        }

    }

}