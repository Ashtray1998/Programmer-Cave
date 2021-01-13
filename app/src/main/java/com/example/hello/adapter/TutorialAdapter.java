package com.example.hello.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello.Code;
import com.example.hello.FrontPage;
import com.example.hello.R;
import com.example.hello.model.Language;
import com.example.hello.model.Tutorial;

import java.util.List;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.Viewholder>{

    private List<Tutorial> tutorialmodellist;
    private Context context;

    public TutorialAdapter(List<Tutorial> tutorialmodellist, Context context) {
        this.tutorialmodellist = tutorialmodellist;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TutorialAdapter.Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tutorial_list_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Tutorial tutorial = tutorialmodellist.get(position);
        String name = tutorialmodellist.get(position).getName();
        int logo = tutorialmodellist.get(position).getLogo();

        String input = tutorialmodellist.get(position).getInput();
        String output = tutorialmodellist.get(position).getOutput();
        String des = tutorialmodellist.get(position).getDes();


        holder.setData(name,logo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Code.class);
                intent.putExtra("tutorial",tutorial);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tutorialmodellist.size();
    }

    class  Viewholder extends RecyclerView.ViewHolder{


        private TextView textView;
        private ImageView imageView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

        }

        public void setData(String name,int logo){


            textView.setText(name);
            imageView.setImageResource(logo);




        }
    }
}
