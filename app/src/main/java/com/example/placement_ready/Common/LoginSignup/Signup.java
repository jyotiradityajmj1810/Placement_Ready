package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.placement_ready.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Signup extends AppCompatActivity {
    TextInputLayout userpassword,email,username,fullname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_app_signup);

        fullname=findViewById(R.id.signup_fullname);
        username=findViewById(R.id.signup_username);
        email=findViewById(R.id.signup_email);
        userpassword=findViewById(R.id.signup_userpassword);
    }
    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), StartUpScreen.class);
        startActivity(intent);
        finish();
    }

    public void next (View view){

        if (!validateusername()|!validateemail()|!validatefullname()|!validatepassword()){
            return;
        }
        Intent intent =new Intent(getApplicationContext(), Signup2.class);
        startActivity(intent);
        finish();
    }

    private boolean validatefullname(){
        String val =fullname.getEditText().getText().toString().trim();
        if (val.isEmpty()){
            fullname.setError("Field can not be empty");
            return false;
        }else {
            fullname.setError(null);
            fullname.setErrorEnabled(false);
            return true;
        }

    }
    private boolean validateusername(){
        String val =username.getEditText().getText().toString().trim();
        String checkspaces = "\\A\\w{1,20}\\z";
        if (val.isEmpty()){
            username.setError("Field can not be empty");
            return false;
        }else if (val.length()>20){
            username.setError("Username is too large !");
            return false;
        }else if (!val.matches(checkspaces)){
            username.setError("No White space are allowed");
            return false;
        }
        else {
            username.setError(null);
            username.setErrorEnabled(false);
            return true;
        }

    }
    private boolean validateemail(){
        String val =email.getEditText().getText().toString().trim();
        String checkEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (val.isEmpty()){
            email.setError("Field can not be empty");
            return false;
        }
        else if (!val.matches(checkEmail)){
            email.setError("Invalid Email !");
            return false;
        }
        else {
            email.setError(null);
            email.setErrorEnabled(false);
            return true;
        }

    }
    private boolean validatepassword(){
        String val =userpassword.getEditText().getText().toString().trim();
        String checkpassword = "^"+"(?=.*[a-zA-Z])"+"(?=.*[@#%^&+=!])"+"(?=\\S+$)"+".{4,}"+"$";
        if (val.isEmpty()){
            userpassword.setError("Field can not be empty");
            return false;
        }else if (!val.matches(checkpassword)){
            userpassword.setError("Password should have 4 characters !");
            return false;
        }
        else {
            userpassword.setError(null);
            userpassword.setErrorEnabled(false);
            return true;
        }

    }

}