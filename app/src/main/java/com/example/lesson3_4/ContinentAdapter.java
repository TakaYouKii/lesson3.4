package com.example.lesson3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continents;
    private onItemClickListener onItemClickListener;

    public ContinentAdapter(ArrayList<Continent> continents, com.example.lesson3_4.onItemClickListener onItemClickListener) {
        this.continents = continents;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.continent_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {
        private TextView tvContinent;
        private ImageView imgContinent;


        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContinent = itemView.findViewById(R.id.tv_continent);
            imgContinent = itemView.findViewById(R.id.img_continent);
        }

        public void bind(Continent continent ){
            tvContinent.setText(continent.getName());
            Glide.with(imgContinent).load(continent.getImage()).into(imgContinent);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
