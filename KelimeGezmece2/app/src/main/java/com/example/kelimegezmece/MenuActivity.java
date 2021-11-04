package com.example.kelimegezmece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void easy_activity(View view){

        Intent intent = new Intent(MenuActivity.this, EasyActivity.class);
        startActivity(intent);
    }

    public void normal_activity(View view){
        Intent intent = new Intent(MenuActivity.this, NormalActivity.class);
        startActivity(intent);
    }

    public void hard_activity(View view){
        Intent intent = new Intent(MenuActivity.this, HardActivity.class);
        startActivity(intent);
    }
}
