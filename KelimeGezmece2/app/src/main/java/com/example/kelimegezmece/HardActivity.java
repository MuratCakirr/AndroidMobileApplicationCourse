package com.example.kelimegezmece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HardActivity extends AppCompatActivity {
    Runnable runnable;
    Handler handler;
    SharedPreferences sharedPreferences;

    String kelam="";

    int flag=0,number=0,score=0,highScore=0;

    String[] kelimeler = {"MACERA","MECRA","ACEMİ","TOPRAK","ORTAK","AKORT","MAKALE","EMLAK","KALEM","MAKAS",
            "SİTEM","SİSTEM","TESİS","METRİS","İLETİ","ETKİLİ","EKİLİ","KALİTE","İLETKİ","ARAMA","MATARA","ARATMA","İMDAT","TARAMA"};

    TextView[] textViews;

    TextView highText,timeText,kelimeText,scoreText, textView12,textView13,textView14,textView15,textView40,textView19,
            textView22,textView21,textView25,textView24,textView23,textView29,textView34,textView41,
            textView1,textView16,textView18,textView17,textView20,textView46,textView44,
            textView43,textView42,textView38,textView26,textView31,textView36,textView27,
            textView32,textView37,textView28,textView33,textView39,textView30,textView35,textView45;

    Button m_button,e_button,c_button,r_button,a_button,i_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView40 = findViewById(R.id.textView40);
        textView19 = findViewById(R.id.textView19);
        textView22 = findViewById(R.id.textView22);
        textView21 = findViewById(R.id.textView21);
        textView25 = findViewById(R.id.textView25);
        textView24 = findViewById(R.id.textView24);
        textView23 = findViewById(R.id.textView23);
        textView29 = findViewById(R.id.textView29);
        textView34 = findViewById(R.id.textView34);
        textView41 = findViewById(R.id.textView41);
        textView1 = findViewById(R.id.textView1);
        textView16 = findViewById(R.id.textView16);
        textView18 = findViewById(R.id.textView18);
        textView17 = findViewById(R.id.textView17);
        textView20 = findViewById(R.id.textView20);
        textView46 = findViewById(R.id.textView46);
        textView44 = findViewById(R.id.textView44);
        textView43 = findViewById(R.id.textView43);
        textView42 = findViewById(R.id.textView42);
        textView38 = findViewById(R.id.textView38);
        textView26 = findViewById(R.id.textView26);
        textView31 = findViewById(R.id.textView31);
        textView36 = findViewById(R.id.textView36);
        textView27 = findViewById(R.id.textView27);
        textView32 = findViewById(R.id.textView32);
        textView37 = findViewById(R.id.textView37);
        textView28 = findViewById(R.id.textView28);
        textView33 = findViewById(R.id.textView33);
        textView39 = findViewById(R.id.textView39);
        textView30 = findViewById(R.id.textView30);
        textView35 = findViewById(R.id.textView35);
        textView45 = findViewById(R.id.textView45);

        textViews = new TextView[]{textView12,textView13,textView14,textView15,textView40,textView19,
                textView22,textView21,textView25,textView24,textView23,textView29,textView34,textView41,
                textView1,textView16,textView18,textView17,textView20,textView46,textView44,
                textView43,textView42,textView38,textView26,textView31,textView36,textView27,
                textView32,textView37,textView28,textView33,textView39,textView30,textView35,textView45};

        m_button = findViewById(R.id.m_button);
        e_button = findViewById(R.id.e_button);
        c_button = findViewById(R.id.c_button);
        r_button = findViewById(R.id.r_button);
        a_button = findViewById(R.id.a_button);
        i_button = findViewById(R.id.i_button);

        kelimeText = findViewById(R.id.kelimeText);
        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);
        highText = findViewById(R.id.highText);

        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        highScore = sharedPreferences.getInt("highScore",0);
        highText.setText("High Score: " + highScore);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                timeText.setText("Time: " + number);
                number++;
                timeText.setText("Time: " + number);
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);

        m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += m_button.getText();
                kelimeText.setText(kelam);
            }
        });
        e_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += e_button.getText();
                kelimeText.setText(kelam);
            }
        });
        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += c_button.getText();
                kelimeText.setText(kelam);
            }
        });
        r_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += r_button.getText();
                kelimeText.setText(kelam);
            }
        });
        a_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += a_button.getText();
                kelimeText.setText(kelam);
            }
        });
        i_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += i_button.getText();
                kelimeText.setText(kelam);
            }
        });
    }

    public void onayla3(View view){

        //1.BULMACA

        if(flag<3) {
            if (kelam.matches(kelimeler[0])) {
                textView12.setText("M");
                textView19.setText("A");
                textView21.setText("C");
                textView29.setText("E");
                textView34.setText("R");
                textView41.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[1])) {
                textView12.setText("M");
                textView13.setText("E");
                textView14.setText("C");
                textView15.setText("R");
                textView40.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[2])) {
                textView22.setText("A");
                textView21.setText("C");
                textView25.setText("E");
                textView24.setText("M");
                textView23.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;


            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }


        //2.BULMACA

        if(flag>=3 && flag<6) {
            if(flag==3){

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setText("");
                    }
                }

                textView27.setVisibility(View.VISIBLE);
                textView26.setVisibility(View.VISIBLE);
                textView43.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                textView44.setVisibility(View.VISIBLE);
                textView28.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.INVISIBLE);
                textView25.setVisibility(View.INVISIBLE);
                textView24.setVisibility(View.INVISIBLE);
                textView23.setVisibility(View.INVISIBLE);
                textView41.setVisibility(View.INVISIBLE);
                textView44.setVisibility(View.INVISIBLE);

            }

            m_button.setText("T");
            e_button.setText("K");
            c_button.setText("O");
            a_button.setText("A");
            r_button.setText("R");
            i_button.setText("P");

            if (kelam.matches(kelimeler[3])) {
                textView1.setText("T");
                textView12.setText("O");
                textView13.setText("P");
                textView14.setText("R");
                textView15.setText("A");
                textView40.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[4])) {
                textView12.setText("O");
                textView19.setText("R");
                textView21.setText("T");
                textView29.setText("A");
                textView34.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[5])) {
                textView29.setText("A");
                textView28.setText("K");
                textView27.setText("O");
                textView26.setText("R");
                textView43.setText("T");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //3.BULMACA

        if(flag>=6 && flag<10){
            if(flag==6){
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setText("");
                    }
                }

                textView1.setVisibility(View.INVISIBLE);
                textView19.setVisibility(View.INVISIBLE);
                textView29.setVisibility(View.INVISIBLE);
                textView27.setVisibility(View.INVISIBLE);
                textView26.setVisibility(View.INVISIBLE);
                textView43.setVisibility(View.INVISIBLE);
                textView41.setVisibility(View.INVISIBLE);
                textView18.setVisibility(View.VISIBLE);
                textView28.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);
                textView33.setVisibility(View.VISIBLE);
                textView39.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView35.setVisibility(View.VISIBLE);
                textView32.setVisibility(View.VISIBLE);
                textView31.setVisibility(View.VISIBLE);

            }

            m_button.setText("S");
            e_button.setText("E");
            c_button.setText("M");
            a_button.setText("A");
            r_button.setText("L");
            i_button.setText("K");

            if (kelam.matches(kelimeler[6])) {
                textView13.setText("M");
                textView18.setText("A");
                textView25.setText("K");
                textView28.setText("A");
                textView33.setText("L");
                textView39.setText("E");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[7])) {
                textView12.setText("E");
                textView13.setText("M");
                textView14.setText("L");
                textView15.setText("A");
                textView40.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[8])) {
                textView35.setText("K");
                textView34.setText("A");
                textView33.setText("L");
                textView32.setText("E");
                textView31.setText("M");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[9])) {
                textView22.setText("M");
                textView21.setText("A");
                textView25.setText("K");
                textView24.setText("A");
                textView23.setText("S");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //4.BULMACA

        if(flag>=10 && flag<14 ){

            if(flag==10){
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setText("");
                    }
                }


                textView1.setVisibility(View.VISIBLE);
                textView16.setVisibility(View.VISIBLE);
                textView30.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView27.setVisibility(View.VISIBLE);
                textView32.setVisibility(View.VISIBLE);
                textView46.setVisibility(View.VISIBLE);
                textView44.setVisibility(View.VISIBLE);
                textView42.setVisibility(View.VISIBLE);
                textView38.setVisibility(View.VISIBLE);
                textView35.setVisibility(View.VISIBLE);
                textView43.setVisibility(View.VISIBLE);

                textView19.setVisibility(View.INVISIBLE);
                textView21.setVisibility(View.INVISIBLE);
                textView29.setVisibility(View.INVISIBLE);
                textView34.setVisibility(View.INVISIBLE);
                textView18.setVisibility(View.INVISIBLE);
                textView25.setVisibility(View.INVISIBLE);
                textView28.setVisibility(View.INVISIBLE);
                textView33.setVisibility(View.INVISIBLE);
                textView39.setVisibility(View.INVISIBLE);
                textView23.setVisibility(View.INVISIBLE);
                textView26.setVisibility(View.INVISIBLE);
                textView31.setVisibility(View.INVISIBLE);
                textView41.setVisibility(View.INVISIBLE);

            }

            m_button.setText("S");
            e_button.setText("T");
            c_button.setText("İ");
            a_button.setText("E");
            r_button.setText("R");
            i_button.setText("M");

            if (kelam.matches(kelimeler[10])) {
                textView1.setText("S");
                textView16.setText("İ");
                textView22.setText("T");
                textView30.setText("E");
                textView35.setText("M");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[11])) {
                textView1.setText("S");
                textView12.setText("İ");
                textView13.setText("S");
                textView14.setText("T");
                textView15.setText("E");
                textView40.setText("M");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[12])) {
                textView14.setText("T");
                textView17.setText("E");
                textView24.setText("S");
                textView27.setText("İ");
                textView32.setText("S");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[13])) {
                textView40.setText("M");
                textView46.setText("E");
                textView44.setText("T");
                textView43.setText("R");
                textView42.setText("İ");
                textView38.setText("S");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }

        }

        //5.BULMACA

        if(flag>=14 && flag<19 ){

            if(flag==14){
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setText("");
                    }
                }


                textView45.setVisibility(View.VISIBLE);
                textView21.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView28.setVisibility(View.VISIBLE);
                textView33.setVisibility(View.VISIBLE);
                textView39.setVisibility(View.VISIBLE);
                textView20.setVisibility(View.VISIBLE);
                textView26.setVisibility(View.VISIBLE);
                textView31.setVisibility(View.VISIBLE);
                textView36.setVisibility(View.VISIBLE);
                textView34.setVisibility(View.VISIBLE);
                textView18.setVisibility(View.VISIBLE);

                textView12.setVisibility(View.INVISIBLE);
                textView13.setVisibility(View.INVISIBLE);
                textView14.setVisibility(View.INVISIBLE);
                textView15.setVisibility(View.INVISIBLE);
                textView40.setVisibility(View.INVISIBLE);
                textView46.setVisibility(View.INVISIBLE);
                textView43.setVisibility(View.INVISIBLE);
                textView38.setVisibility(View.INVISIBLE);
                textView17.setVisibility(View.INVISIBLE);
                textView27.setVisibility(View.INVISIBLE);

            }

            m_button.setText("K");
            e_button.setText("E");
            c_button.setText("T");
            a_button.setText("İ");
            r_button.setText("L");
            i_button.setText("A");

            if (kelam.matches(kelimeler[14])) {
                textView20.setText("İ");
                textView23.setText("L");
                textView26.setText("E");
                textView31.setText("T");
                textView36.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[15])) {
                textView22.setText("E");
                textView21.setText("T");
                textView25.setText("K");
                textView24.setText("İ");
                textView23.setText("L");
                textView44.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[16])) {
                textView18.setText("E");
                textView25.setText("K");
                textView28.setText("İ");
                textView33.setText("L");
                textView39.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[17])) {
                textView35.setText("K");
                textView34.setText("A");
                textView33.setText("L");
                textView32.setText("İ");
                textView31.setText("T");
                textView42.setText("E");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[18])) {
                textView1.setText("İ");
                textView16.setText("L");
                textView22.setText("E");
                textView30.setText("T");
                textView35.setText("K");
                textView45.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }

        }

        if(flag>=19 && flag<24 ){

            if(flag==19){
                System.out.println(kelam);
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }


                textView1.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView40.setVisibility(View.VISIBLE);
                textView41.setVisibility(View.VISIBLE);
                textView19.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.VISIBLE);
                textView21.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView44.setVisibility(View.VISIBLE);
                textView29.setVisibility(View.VISIBLE);
                textView27.setVisibility(View.VISIBLE);
                textView35.setVisibility(View.VISIBLE);
                textView34.setVisibility(View.VISIBLE);
                textView33.setVisibility(View.VISIBLE);
                textView32.setVisibility(View.VISIBLE);
                textView31.setVisibility(View.VISIBLE);

            }

            m_button.setText("M");
            e_button.setText("T");
            c_button.setText("R");
            a_button.setText("A");
            r_button.setText("D");
            i_button.setText("İ");

            if (kelam.matches(kelimeler[19])) {
                textView14.setText("A");
                textView17.setText("R");
                textView24.setText("A");
                textView27.setText("M");
                textView32.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[20])) {
                textView22.setText("M");
                textView21.setText("A");
                textView25.setText("T");
                textView24.setText("A");
                textView23.setText("R");
                textView44.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[21])) {
                textView12.setText("A");
                textView19.setText("R");
                textView21.setText("A");
                textView29.setText("T");
                textView34.setText("M");
                textView41.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[22])) {
                textView35.setText("İ");
                textView34.setText("M");
                textView33.setText("D");
                textView32.setText("A");
                textView31.setText("T");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if (kelam.matches(kelimeler[23])) {
                textView1.setText("T");
                textView12.setText("A");
                textView13.setText("R");
                textView14.setText("A");
                textView15.setText("M");
                textView40.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }

        }

        if(flag==24){
            score-=number;
            if(score>highScore){
                highScore=score;
                sharedPreferences.edit().putInt("highScore",highScore).apply();
            }
            Toast.makeText(getApplicationContext(),"SCORE: " + String.valueOf(score),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HardActivity.this,MenuActivity.class);
            startActivity(intent);
        }


        kelam="";
    }
}
