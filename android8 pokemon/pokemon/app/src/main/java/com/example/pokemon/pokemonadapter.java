package com.example.pokemon;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonadapter extends RecyclerView.Adapter {
    ArrayList<pokemon1> pArray;
        Context context;

        public pokemonadapter(ArrayList<pokemon1>pArray, Context context){
            this.pArray = pArray;
            this.context = context;
        }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,  false);
            ViewHolder kj = new ViewHolder(v);
            return kj;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).total.setText(pArray.get(position).getTotal()+" ");
        ((ViewHolder)holder).name.setText(pArray.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }


     public static class ViewHolder extends RecyclerView.ViewHolder{
            public ImageView img ;
            public TextView name ;
            public TextView total ;
            public View view;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             view = itemView ;
             img = itemView.findViewById(R.id.imageView);
             name = itemView.findViewById(R.id.textView);
             total = itemView.findViewById(R.id.textView4);


         }
     }
}

