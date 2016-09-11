package com.bignerdranch.android.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserAccountActivity extends AppCompatActivity {

    Button btn_new_session;
    Button btn_completed;
    Button btn_new_submit;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_options_menu, menu);
        menu.findItem(R.menu.main_options_menu).setIntent(
                new Intent(UserAccountActivity.this, LaunchActivity.class));
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logoff_menu_item) {
            super.onOptionsItemSelected(item);
            Toast.makeText(this, "Logging You Off...", Toast.LENGTH_LONG).show();
            startActivity(new Intent(UserAccountActivity.this, LaunchActivity.class));
        }

        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);


        btn_new_session = (Button)findViewById(R.id.register_new_session);
        btn_new_session.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(UserAccountActivity.this, NewSessionActivity.class);
                startActivity(intent);
            }
        });
        btn_completed = (Button)findViewById(R.id.session_completed_button);
        btn_completed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(UserAccountActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
        btn_new_submit = (Button)findViewById(R.id.view_all_sessions_button);
        btn_new_submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(UserAccountActivity.this, ViewAllSessionsActivity.class);
                startActivity(intent);
            }
        });
    }
}