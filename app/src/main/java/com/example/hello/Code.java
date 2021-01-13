package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hello.adapter.TutorialAdapter;
import com.example.hello.model.Grid;
import com.example.hello.model.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class Code extends AppCompatActivity {

    TextView textView,textView2,textView3,textView4;
    ImageView imageView;
    Tutorial tutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        textView = findViewById(R.id.textView8);
        textView2 = findViewById(R.id.textView11);
        textView3 = findViewById(R.id.textView14);
        textView4 = findViewById(R.id.textView16);
        imageView = findViewById(R.id.imageView8);


        Intent intent= new Intent();
        tutorial = (Tutorial) getIntent().getSerializableExtra("tutorial");

        imageView.setImageResource(tutorial.getLogo());
        textView.setText(tutorial.getName());
        textView2.setText(tutorial.getInput());
        textView3.setText(tutorial.getOutput());
        textView4.setText(tutorial.getDes());








    }
}