package com.bignerdranch.android.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EmailReceiptActivity extends AppCompatActivity {


    Button btn_send;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logoff_menu_item) {
            super.onOptionsItemSelected(item);
            Toast.makeText(this, "Logging You Off...", Toast.LENGTH_LONG).show();
            startActivity(new Intent(EmailReceiptActivity.this, LaunchActivity.class));
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_receipt);

        btn_send = (Button)findViewById(R.id.send_receipt_button);
        btn_send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                Intent intent = new Intent(EmailReceiptActivity.this, SuccessActivity.class);
                startActivity(intent);
            }
        });

    }
}