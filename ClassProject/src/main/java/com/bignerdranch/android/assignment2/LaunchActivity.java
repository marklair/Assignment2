package com.bignerdranch.android.assignment2;

import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Button;



public class LaunchActivity extends AppCompatActivity {


    private static final int REQUEST_READ_CONTACTS = 0;


    Button btn_signin;
    Button btn_register;
    private EditText mEmailView;
    private EditText mPasswordView;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        mEmailView = (EditText) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        btn_signin = (Button)findViewById(R.id.email_sign_in_button);
        btn_signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(LaunchActivity.this, UserAccountActivity.class);
                startActivity(intent);
            }
        });
        btn_register = (Button)findViewById(R.id.email_register_button);
        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(LaunchActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    private void LogInErrors () {


        mEmailView.setError(null);
        mPasswordView.setError(null);

        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();

        boolean cancel = false;
        View focusView = null;

        if (TextUtils.isEmpty(email)) {
            mEmailView.setError(getString(R.string.error_field_required));
            focusView = mEmailView;
            cancel = true;
            //Check for a valid userName
        } else if (!isEmailValid(email)) {
            mEmailView.setError(getString(R.string.error_invalid_email));
            focusView = mEmailView;
            cancel = true;

        } else {
            if (TextUtils.isEmpty(password)) {
                mPasswordView.setError(getString(R.string.error_invalid_password));
                focusView = mPasswordView;
                cancel = true;

            } else if(!isPasswordValid(password)) {
                mPasswordView.setError(getString(R.string.error_incorrect_password));
                focusView = mEmailView;
                cancel = true;

            }else
            {
                Intent i = new Intent(getApplicationContext(),UserAccountActivity.class);
                startActivity(i);
            }
        }
    }


    private boolean isEmailValid(String email) {
        String userName = (String) getText(R.string.username);
        return email.contains(userName);
    }

    private boolean isPasswordValid(String password) {
        String userPassword = (String) getText(R.string.password);
        return password.contains(userPassword);
    }

}