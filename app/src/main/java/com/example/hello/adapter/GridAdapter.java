package com.example.hello.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello.FrontPage;
import com.example.hello.R;
import com.example.hello.TutorialsList;
import com.example.hello.model.Grid;
import com.example.hello.model.Language;

import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.Viewholder>{

    private List<Grid> gridmodellist;
    private Context context;



    public GridAdapter(List<Grid> gridmodellist, Context context) {
        this.gridmodellist = gridmodellist;
        this.context = context;
    }



    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridAdapter.Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_front_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {



        Grid grid = gridmodellist.get(position);
        String name = gridmodellist.get(position).getName();
        int logo = gridmodellist.get(position).getLogo();


        int num1 = gridmodellist.get(position).getNum1();
        String text1 = gridmodellist.get(position).getText1();
        String input1 = gridmodellist.get(position).getInput1();
        String output1 = gridmodellist.get(position).getOutput1();
        String des1 = gridmodellist.get(position).getDes1();

        int num2 = gridmodellist.get(position).getNum2();
        String text2 = gridmodellist.get(position).getText2();
        String input2 = gridmodellist.get(position).getInput2();
        String output2 = gridmodellist.get(position).getOutput2();
        String des2 = gridmodellist.get(position).getDes2();

        int num3 = gridmodellist.get(position).getNum3();
        String text3 = gridmodellist.get(position).getText3();
        String input3 = gridmodellist.get(position).getInput3();
        String output3 = gridmodellist.get(position).getOutput3();
        String des3 = gridmodellist.get(position).getDes3();

        holder.setData(name,logo);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1!=0){
                    Intent intent = new Intent(context, TutorialsList.class);
                    intent.putExtra("grid",grid);
                    context.startActivity(intent);
                }
                else{



                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return gridmodellist.size();
    }

    class  Viewholder extends RecyclerView.ViewHolder{


        private TextView textView;
        private ImageView imageView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView2);

        }

        public void setData(String name,int logo){


            textView.setText(name);
            imageView.setImageResource(logo);




        }
    }
}
