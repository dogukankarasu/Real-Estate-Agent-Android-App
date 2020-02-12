package com.example.finalprojesi;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class AdvertiseAdapter extends RecyclerView.Adapter<AdvertiseAdapter.AdvertiseHolder> {

    private Context context;
    private List<Advertise> advertiseList;

    public AdvertiseAdapter(Context context, List<Advertise> advertiseList) {
        this.context = context;
        this.advertiseList = advertiseList;



    }

    @NonNull
    @Override
    public AdvertiseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerview,parent,   false);
        return new AdvertiseHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdvertiseHolder holder, int position) {

        Advertise advertise= advertiseList.get(position);

        holder.textViewId.setText(String.valueOf(advertise.getId()));
        holder.textViewCategory.setText("CATEGORY: "+advertise.getCategory());
        holder.textViewType.setText("TYPE: "+advertise.getType());
        holder.textViewAdress.setText("ADRESS: "+advertise.getAdress());
        holder.textViewPrice.setText("PRICE:  "+advertise.getPrice());
        holder.textViewRoom.setText("ROOM"+advertise.getRoom());
        holder.textViewSize.setText("SIZE:  "+advertise.getSize());
    }

    @Override
    public int getItemCount() {
        return advertiseList.size();
    }

    class AdvertiseHolder extends RecyclerView.ViewHolder{
        TextView textViewId,textViewCategory,textViewType,textViewAdress,textViewPrice,textViewRoom,textViewSize;

        public AdvertiseHolder( View itemView) {
            super(itemView);
            textViewId=(TextView) itemView.findViewById(R.id.textViewId);
            textViewCategory=(TextView)itemView.findViewById(R.id.textViewCategory);
            textViewType=(TextView)itemView.findViewById(R.id.textViewType);
            textViewAdress=(TextView)itemView.findViewById(R.id.textViewAdress);
            textViewPrice=(TextView)itemView.findViewById(R.id.textViewPrice);
            textViewRoom=(TextView)itemView.findViewById(R.id.textViewRoom);
            textViewSize=(TextView)itemView.findViewById(R.id.textViewSize);
        }
    }
}
