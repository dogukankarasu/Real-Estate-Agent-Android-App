package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        final EditText txt_user=(EditText)findViewById(R.id.txt_user);
        final EditText txt_pass=(EditText)findViewById(R.id.txt_pass);



        Intent i=getIntent();


        ((Button)findViewById(R.id.btn_enter)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i=new Intent(admin.this,OperationsPage.class);

                    startActivity(i);



            }
        });
    }
}
