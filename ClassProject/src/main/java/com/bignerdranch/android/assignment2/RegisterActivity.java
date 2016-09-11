package com.bignerdranch.android.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btn_new_session;
    Button btn_completed;
    Button btn_new_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_new_session = (Button)findViewById(R.id.register_new_session);
        btn_new_session.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(RegisterActivity.this, NewSessionActivity.class);
                startActivity(intent);
            }
        });
        btn_completed = (Button)findViewById(R.id.session_completed_button);
        btn_completed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(RegisterActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
        btn_new_submit = (Button)findViewById(R.id.view_all_sessions_button);
        btn_new_submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(RegisterActivity.this, ViewAllSessionsActivity.class);
                startActivity(intent);
            }
        });
    }
}