package com.example.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView1);

        sharedPreferences = this.getSharedPreferences("com.example.storingdata", Context.MODE_PRIVATE);
        int storedAge = sharedPreferences.getInt("StoredAge",0);
        if(storedAge == 0){
            textView.setText("Your Age: ");
        }else{
            textView.setText("Your Age: " + storedAge);
        }
    }
    public void save(View view){
        if(!editText.getText().toString().equals("")){
            int userAge = Integer.parseInt(editText.getText().toString());
            textView.setText("Your Age: " + userAge);
            sharedPreferences.edit().putInt("StoredAge",userAge).apply();
        }
    }
    public void delete(View view){
        int storedData = sharedPreferences.getInt("StoredAge",0);
        if(storedData != 0){
            sharedPreferences.edit().remove("StoredAge").apply();
            textView.setText("Your Age: ");
        }
    }

}
