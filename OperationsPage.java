package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OperationsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations_page);

        Intent i=getIntent();


        ((Button)findViewById(R.id.btn_exit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OperationsPage.this,MainActivity.class);

                startActivity(i);

            }
        });

        ((Button)findViewById(R.id.btn_show)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OperationsPage.this,goster.class);

                startActivity(i);

            }
        });
        ((Button)findViewById(R.id.btn_update)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OperationsPage.this,duzelt.class);

                startActivity(i);

            }
        });
        ((Button)findViewById(R.id.btn_insert)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OperationsPage.this,ekle.class);

                startActivity(i);

            }
        });
        ((Button)findViewById(R.id.btn_delete)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(OperationsPage.this,sil.class);

                startActivity(i);

            }
        });
    }
}
