package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hello.adapter.GridAdapter;
import com.example.hello.adapter.LanguageAdapter;
import com.example.hello.adapter.TutorialAdapter;
import com.example.hello.model.Grid;
import com.example.hello.model.Language;
import com.example.hello.model.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class TutorialsList extends AppCompatActivity {

    RecyclerView recyclerView;
    Grid grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials_list);

        recyclerView = findViewById(R.id.changeLanguageRV);


        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        linearLayout.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayout);



        Intent intent= new Intent();
        grid = (Grid) getIntent().getSerializableExtra("grid");


        List<Tutorial> tutorialList= new ArrayList<>();
        tutorialList.add(new Tutorial(grid.getText1(),grid.getNum1(),grid.getInput1(),grid.getOutput1(),grid.getDes1()));
        tutorialList.add(new Tutorial(grid.getText2(),grid.getNum2(),grid.getInput2(),grid.getOutput2(),grid.getDes2()));
        tutorialList.add(new Tutorial(grid.getText3(),grid.getNum3(),grid.getInput3(),grid.getOutput3(),grid.getDes3()));








        TutorialAdapter adapter = new TutorialAdapter(tutorialList,TutorialsList.this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();





    }
}