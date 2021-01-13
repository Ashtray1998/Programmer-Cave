package com.example.hello.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello.R;
import com.example.hello.model.Grid;
import com.example.hello.model.Horizontal;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.Viewholder>{

    private List<Horizontal> horizontalModelList;
    private Context context;

    public HorizontalAdapter(List<Horizontal> horizontalModelList, Context context) {
        this.horizontalModelList = horizontalModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalAdapter.Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_layout,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {


        String name = horizontalModelList.get(position).getName();
        int logo = horizontalModelList.get(position).getLogo();

        holder.setData(name,logo);


    }

    @Override
    public int getItemCount() {
        return horizontalModelList.size();
    }

    class  Viewholder extends RecyclerView.ViewHolder{


        private TextView textView;
        private ImageView imageView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView3);

        }

        public void setData(String name,int logo){


            textView.setText(name);
            imageView.setImageResource(logo);




        }
    }

}
