package com.example.placement_ready.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.placement_ready.R;
import com.example.placement_ready.User.UserDashboard;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    TextInputLayout userpassword,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        username=findViewById(R.id.login_username);
        userpassword=findViewById(R.id.loin_userpassword);

    }

    public void back_btn (View view){
        Intent intent =new Intent(getApplicationContext(), StartUpScreen.class);
        startActivity(intent);
        finish();
    }
    public void nextScreen(View view){
        if (!validateusername()|!validatepassword()){
            return;
        }
        Intent intent=new Intent(getApplicationContext(), UserDashboard.class);
        startActivity(intent);
        finish();

    }
    public void signup_screen (View view){
        Intent intent =new Intent(getApplicationContext(), Signup.class);
        startActivity(intent);
        finish();
    }
    public void forgotpassword (View view){
        Intent intent =new Intent(getApplicationContext(), NewPassword.class);
        startActivity(intent);
        finish();
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