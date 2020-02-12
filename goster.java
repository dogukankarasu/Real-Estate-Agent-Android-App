package com.example.finalprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class goster extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Advertise> advertiseList;
    private AdvertiseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goster);

    recyclerView= findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(goster.this));

        Call<AdversiteResponse> call= RetrofitClient.getInstance().getApi().getUsers();
        call.enqueue(new Callback<AdversiteResponse>() {
            @Override
            public void onResponse(Call<AdversiteResponse> call, Response<AdversiteResponse> response) {
                advertiseList=response.body().getUsers();
                adapter=new AdvertiseAdapter(goster.this,advertiseList);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<AdversiteResponse> call, Throwable t) {

            }
        });
    }


}
