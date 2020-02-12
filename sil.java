package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class sil extends AppCompatActivity {

   private EditText  txt_sil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sil);

        txt_sil=(EditText) findViewById(R.id.txt_sil);

        Button btn_dlt=(Button) findViewById(R.id.btn_dlt);

        btn_dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
            }
        });

    }

    private void  delete(){

        String id=txt_sil.getText().toString().trim();


        Call<ResponseBody> call= RetrofitClient
                .getInstance()
                .getApi()
                .deleteAdvertise(id);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String s=response.body().string();
                    Toast.makeText(sil.this,s,Toast.LENGTH_LONG).show();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(sil.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
