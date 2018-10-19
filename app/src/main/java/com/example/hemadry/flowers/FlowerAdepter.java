package com.example.hemadry.flowers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class FlowerAdepter extends RecyclerView.Adapter<FlowerAdepter.MovieViewHolder> {

    private List<Flower> flowers;
    private int rowLayout;
    private Context context;

    public FlowerAdepter(List<Flower> flowers, int rowLayout, Context context) {
        this.flowers = flowers;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        holder.idTV.setText(String.valueOf(flowers.get(position).getProductId()));
        holder.nameTV.setText(flowers.get(position).getName());
        holder.cataTV.setText(flowers.get(position).getCategory());
        holder.priceTV.setText(String.valueOf(flowers.get(position).getPrice()));
        //holder.imageIV.setImageResource(Integer.parseInt(String.valueOf(flowers.get(position).getPhoto())));

    }

    @Override
    public int getItemCount() {
        return flowers.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView imageIV;
        TextView idTV,nameTV,cataTV,priceTV;

        public MovieViewHolder(View itemView) {
            super(itemView);

            imageIV = itemView.findViewById(R.id.imageI);
            idTV = itemView.findViewById(R.id.idT);
            nameTV = itemView.findViewById(R.id.nameT);
            cataTV = itemView.findViewById(R.id.cataT);
            priceTV = itemView.findViewById(R.id.priceT);
        }
    }
}

