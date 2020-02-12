package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class duzelt extends AppCompatActivity {

    private  EditText txt_id,txt_ctg,txt_typ,txt_adr,txt_prc,txt_rm,txt_sz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duzelt);

        txt_id=(EditText) findViewById(R.id.txt_sil);
        txt_ctg=(EditText) findViewById(R.id.txt_ctg);
        txt_typ=(EditText) findViewById(R.id.txt_typ);
        txt_adr=(EditText) findViewById(R.id.txt_adr);
        txt_prc=(EditText) findViewById(R.id.txt_prc);
        txt_rm=(EditText) findViewById(R.id.txt_rm);
        txt_sz=(EditText) findViewById(R.id.txt_sz);
        Button btn_updt=(Button) findViewById(R.id.btn_updt);

        btn_updt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                update();

            }
        });

    }

    private void update(){

        String id=txt_id.getText().toString().trim();
        String category=txt_ctg.getText().toString().trim();
        String type=txt_typ.getText().toString().trim();
        String adress=txt_adr.getText().toString().trim();
        String price=txt_prc.getText().toString().trim();
        String room=txt_rm.getText().toString().trim();
        String size=txt_sz.getText().toString().trim();


        if(id.isEmpty()){
            txt_id.setError("Id cannot empty ");
            txt_id.requestFocus();
            return;
        }
        if(category.isEmpty()){
            txt_ctg.setError("Category cannot empty ");
            txt_ctg.requestFocus();
            return;
        }

        if(adress.isEmpty()){
            txt_adr.setError("Adress cannot empty ");
            txt_adr.requestFocus();
            return;
        }
        if(type.isEmpty()){
            txt_typ.setError("Type cannot empty ");
            txt_typ.requestFocus();
            return;
        }
        if(price.isEmpty()){
            txt_prc.setError("Price cannot empty ");
            txt_prc.requestFocus();
            return;
        }
        if(room.isEmpty()){
            txt_rm.setError("Room cannot empty ");
            txt_rm.requestFocus();
            return;
        }
        if(size.isEmpty()){
            txt_sz.setError("Size cannot empty ");
            txt_sz.requestFocus();
            return;
        }
        Call<ResponseBody> call= RetrofitClient
                .getInstance()
                .getApi()
                .updateAdvertise(id,category,type,adress,price,room,size);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String s=response.body().string();
                    Toast.makeText(duzelt.this,s,Toast.LENGTH_LONG).show();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(duzelt.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
