package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.hello.adapter.LanguageAdapter;
import com.example.hello.model.Language;

import java.util.ArrayList;
import java.util.List;

public class ChangeLanguage extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
        recyclerView = findViewById(R.id.changeLanguageRV);


        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        linearLayout.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayout);

        List<Language> languageList= new ArrayList<>();
        languageList.add(new Language("Java",R.drawable.java,"Basic",R.drawable.javapractise,"Practice",R.drawable.java,"Interview",R.drawable.javainterview,"Books",R.drawable.javabooks,"Compiler",R.drawable.javacompiler,"Video",R.drawable.javavideo,R.drawable.one,"Hello world with Java","hello world input with Java","Hello world output with Java","You are a Java programmer",R.drawable.two,"Sorting with Java","Here is the shorting Input","Here is the ourput sorting","Good job",R.drawable.three,"Linklist with java","Here is the algorithm input","Output algo here","Great job"));
        languageList.add(new Language("Python",R.drawable.python,"Basic",R.drawable.pythonpractise,"Practice",R.drawable.python,"Interview",R.drawable.pythoninterview,"Books",R.drawable.pythonbook,"Compiler",R.drawable.pythoncompiler,"Video",R.drawable.pythonvideos,R.drawable.one,"Hello world with python","hello python input here","Hello python output","You are a python programmer now",R.drawable.two,"Tree with python","Here is the shorting Python Input","Here is the ourput Python sorting","Good job Python",R.drawable.three,"Sorting Python","Here is the pYTHON algorithm input","Output algo Python here","Great job Python"));




        LanguageAdapter adapter = new LanguageAdapter(languageList,ChangeLanguage.this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();







    }
}