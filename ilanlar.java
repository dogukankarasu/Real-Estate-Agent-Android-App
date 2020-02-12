package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ilanlar extends AppCompatActivity {



        private RecyclerView recyclerView;
        private List<Advertise> advertiseList;
        private AdvertiseAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ilanlar);

            Button btn_call=(Button) findViewById(R.id.btn_call);
            btn_call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i=new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:05438256974"));
                    startActivity(i);
                }
            });

            Button btn_mail=(Button)findViewById(R.id.btn_mail);
            btn_mail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:developer@example.com"));
                    startActivity(emailIntent);
                }
            });

            recyclerView= findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(ilanlar.this));

            Call<AdversiteResponse> call= RetrofitClient.getInstance().getApi().getUsers();
            call.enqueue(new Callback<AdversiteResponse>() {
                @Override
                public void onResponse(Call<AdversiteResponse> call, Response<AdversiteResponse> response) {
                    advertiseList=response.body().getUsers();
                    adapter=new AdvertiseAdapter(ilanlar.this,advertiseList);
                    recyclerView.setAdapter(adapter);

                }

                @Override
                public void onFailure(Call<AdversiteResponse> call, Throwable t) {

                }
            });
        }


}
