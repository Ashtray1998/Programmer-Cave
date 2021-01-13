package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hello.adapter.GridAdapter;
import com.example.hello.adapter.HorizontalAdapter;
import com.example.hello.adapter.LanguageAdapter;
import com.example.hello.model.Grid;
import com.example.hello.model.Horizontal;
import com.example.hello.model.Language;

import java.util.ArrayList;
import java.util.List;

public class FrontPage extends AppCompatActivity {

    RecyclerView recyclerView,recyclerView2;
    Language language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        recyclerView = findViewById(R.id.RV);
        recyclerView2 = findViewById(R.id.RV2);

        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        linearLayout.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setHasFixedSize(true);

        List<Horizontal> horizontalList = new ArrayList<>();
        horizontalList.add(new Horizontal("Basic",R.drawable.intro));
        horizontalList.add(new Horizontal("Syllabus",R.drawable.syllabus));
        horizontalList.add(new Horizontal("Bookmark",R.drawable.bookmark));
        horizontalList.add(new Horizontal("Books",R.drawable.books));
        horizontalList.add(new Horizontal("Compiler",R.drawable.compiler));
        horizontalList.add(new Horizontal("Video",R.drawable.video));

        HorizontalAdapter adapter2 = new HorizontalAdapter(horizontalList,FrontPage.this);
        recyclerView.setAdapter(adapter2);
        adapter2.notifyDataSetChanged();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setHasFixedSize(true);

        Intent intent= new Intent();
        language = (Language) getIntent().getSerializableExtra("language");

        List<Grid> gridList= new ArrayList<>();

        gridList.add(new Grid(language.getName2(),language.getLogo2(),language.getNum1(),language.getText1(),language.getInput1(),language.getOutput1(),language.getDes1(),language.getNum2(),language.getText2(),language.getInput2(),language.getOutput2(),language.getDes2(),language.getNum3(),language.getText3(),language.getInput3(),language.getOutput3(),language.getDes3()));
        gridList.add(new Grid(language.getName3(),language.getLogo3(),0,"","","","",0,"","","","",0,"","","",""));
        gridList.add(new Grid(language.getName4(),language.getLogo4(),0,"","","","",0,"","","","",0,"","","",""));
        gridList.add(new Grid(language.getName5(),language.getLogo5(),0,"","","","",0,"","","","",0,"","","",""));
        gridList.add(new Grid(language.getName6(),language.getLogo6(),0,"","","","",0,"","","","",0,"","","",""));
        gridList.add(new Grid(language.getName7(),language.getLogo7(),0,"","","","",0,"","","","",0,"","","",""));







        GridAdapter adapter = new GridAdapter(gridList,FrontPage.this);
        recyclerView2.setAdapter(adapter);
        adapter.notifyDataSetChanged();











    }

    public void click(View v) {

        Intent i = new Intent(FrontPage.this, ChangeLanguage.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);


    }
}