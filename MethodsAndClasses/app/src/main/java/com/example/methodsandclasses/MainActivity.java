package com.example.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeMusicians();
    }

    public void makeMusicians(){
        Musicians James = new Musicians("james",50,"Guitar");
        James.setAge(60);
        System.out.println(James.getAge());
    }

}
