package com.example.hello.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello.ChangeLanguage;
import com.example.hello.FrontPage;
import com.example.hello.R;
import com.example.hello.model.Language;

import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.Viewholder>{

    private List<Language> languagemodellist;
    private Context context;

    public LanguageAdapter(List<Language> languagemodellist, Context context) {
        this.languagemodellist = languagemodellist;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.change_language_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {


        Language language = languagemodellist.get(position);
        String name = languagemodellist.get(position).getName();
        int logo = languagemodellist.get(position).getLogo();

        String name2 = languagemodellist.get(position).getName2();
        int logo2 = languagemodellist.get(position).getLogo2();
        String name3 = languagemodellist.get(position).getName3();
        int logo3 = languagemodellist.get(position).getLogo3();
        String name4 = languagemodellist.get(position).getName4();
        int logo4 = languagemodellist.get(position).getLogo4();
        String name5 = languagemodellist.get(position).getName5();
        int logo5 = languagemodellist.get(position).getLogo5();
        String name6 = languagemodellist.get(position).getName6();
        int logo6 = languagemodellist.get(position).getLogo6();
        String name7 = languagemodellist.get(position).getName7();
        int logo7 = languagemodellist.get(position).getLogo7();


        int num1 = languagemodellist.get(position).getNum1();
        String text1 = languagemodellist.get(position).getText1();
        String input1 = languagemodellist.get(position).getInput1();
        String output1 = languagemodellist.get(position).getOutput1();
        String des1 = languagemodellist.get(position).getDes1();

        int num2 = languagemodellist.get(position).getNum2();
        String text2 = languagemodellist.get(position).getText2();
        String input2 = languagemodellist.get(position).getInput2();
        String output2 = languagemodellist.get(position).getOutput2();
        String des2 = languagemodellist.get(position).getDes2();

        int num3 = languagemodellist.get(position).getNum3();
        String text3 = languagemodellist.get(position).getText3();
        String input3 = languagemodellist.get(position).getInput3();
        String output3 = languagemodellist.get(position).getOutput3();
        String des3 = languagemodellist.get(position).getDes3();


        holder.setData(name,logo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FrontPage.class);
                intent.putExtra("language",language);
                context.startActivity(intent);

            }
        });





    }

    @Override
    public int getItemCount() {
        return languagemodellist.size();
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
