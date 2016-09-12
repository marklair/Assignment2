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

public class ReceiptActivity extends AppCompatActivity {
    Button btn_print;
    Button btn_email_receipt;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logoff_menu_item) {
            super.onOptionsItemSelected(item);
            Toast.makeText(this, "Logging You Off...", Toast.LENGTH_LONG).show();
            startActivity(new Intent(ReceiptActivity.this, LaunchActivity.class));
        }

        return true;
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receipt);

            btn_print = (Button)findViewById(R.id.print_receipt_button);
            btn_print.setOnClickListener(new View.OnClickListener() {
                @Override
                //Use the name of the function you assigned to the xml design of the button
                public void onClick(View v) {
                   //Leave it blank for printing.
                }
            });
            btn_email_receipt = (Button)findViewById(R.id.email_receipt_button);
            btn_email_receipt.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    //Use the name of this class, and the name class where you want to be taken when the button is clicked.
                    Intent intent = new Intent(ReceiptActivity.this, EmailReceiptActivity.class);
                    startActivity(intent);
                }
            });
        }
}