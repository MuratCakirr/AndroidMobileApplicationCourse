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

public class NormalActivity extends AppCompatActivity {

    Runnable runnable;
    Handler handler;
    SharedPreferences sharedPreferences1;

    String kelam="";

    int flag=0,number=0,score=0,highScore=0;

    Button e_button, k_button, p_button, s_button, t_button, i_button;

    TextView[] textViews;
    TextView highText, timeText, kelimeText,scoreText, textView1, textView2,textView3, textView4, textView5,textView6,
            textView7,textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15,
    textView16,textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24,textView25;

    String[] kelimeler = {"AYET","SENA","PRİZ","İBRE","KİRA","AŞIK","IRAK","DELİ","ESİR","REİS","ETKİ","ETİK","TİPİ","EKŞİ","SEMA","APSE","ESMA","KASE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        e_button = findViewById(R.id.e_button);
        k_button = findViewById(R.id.k_button);
        p_button = findViewById(R.id.p_button);
        s_button = findViewById(R.id.s_button);
        t_button = findViewById(R.id.t_button);
        i_button = findViewById(R.id.i_button);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);

        textViews = new TextView[]{textView1, textView2,textView3, textView4, textView5,textView6,
                textView7,textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15,
                textView16,textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24,textView25};

        kelimeText = findViewById(R.id.kelimeText);
        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);
        highText = findViewById(R.id.highText2);

        sharedPreferences1 = this.getPreferences(Context.MODE_PRIVATE);
        highScore = sharedPreferences1.getInt("highScore",0);
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

        e_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += e_button.getText();
                kelimeText.setText(kelam);
            }
        });

        k_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += k_button.getText();
                kelimeText.setText(kelam);
            }
        });

        p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += p_button.getText();
                kelimeText.setText(kelam);
            }
        });

        s_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += s_button.getText();
                kelimeText.setText(kelam);
            }
        });

        t_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += t_button.getText();
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

    public void onayla1(View view){

        //1.BULMACA

        if(flag<2) {
            if (kelam.matches(kelimeler[0])) {
                textView16.setText("A");
                textView9.setText("Y");
                textView6.setText("E");
                textView11.setText("T");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[1])) {
                textView10.setText("S");
                textView6.setText("E");
                textView14.setText("N");
                textView22.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //2.BULMACA

        if(flag>=2 && flag<4) {
            if(flag==2) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setText("");
                    }
                }

                textView16.setVisibility(View.INVISIBLE);
                textView9.setVisibility(View.INVISIBLE);
                textView11.setVisibility(View.INVISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);

            }

            e_button.setText("P");
            k_button.setText("B");
            p_button.setText("R");
            s_button.setText("Z");
            t_button.setText("İ");
            i_button.setText("E");

            if (kelam.matches(kelimeler[2])) {
                textView15.setText("P");
                textView14.setText("R");
                textView13.setText("İ");
                textView25.setText("Z");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[3])) {
                textView10.setText("İ");
                textView6.setText("B");
                textView14.setText("R");
                textView22.setText("E");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //3.BULMACA

        if(flag>=4 && flag<7) {
            if(flag==4) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                textView1.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);

            }

            e_button.setText("A");
            k_button.setText("R");
            p_button.setText("İ");
            s_button.setText("K");
            t_button.setText("Ş");
            i_button.setText("I");

            if (kelam.matches(kelimeler[4])) {
                textView12.setText("K");
                textView15.setText("İ");
                textView14.setText("R");
                textView13.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[5])) {
                textView1.setText("A");
                textView10.setText("Ş");
                textView2.setText("I");
                textView17.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[6])) {
                textView2.setText("I");
                textView11.setText("R");
                textView13.setText("A");
                textView23.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag>=7 && flag<10) {
            if(flag==7) {
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                textView4.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);

            }

            e_button.setText("R");
            k_button.setText("İ");
            p_button.setText("S");
            s_button.setText("D");
            t_button.setText("L");
            i_button.setText("E");

            if (kelam.matches(kelimeler[7])) {
                textView12.setText("D");
                textView15.setText("E");
                textView14.setText("L");
                textView13.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[8])) {
                textView4.setText("E");
                textView1.setText("S");
                textView10.setText("İ");
                textView2.setText("R");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[9])) {
                textView2.setText("R");
                textView11.setText("E");
                textView13.setText("İ");
                textView23.setText("S");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag>=10 && flag<14) {
            if(flag==10) {
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                textView4.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.VISIBLE);
                textView9.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView7.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);

            }

            e_button.setText("E");
            k_button.setText("K");
            p_button.setText("P");
            s_button.setText("Ş");
            t_button.setText("T");
            i_button.setText("İ");

            if(kelam.matches(kelimeler[10])){
                textView4.setText("E");
                textView1.setText("T");
                textView10.setText("K");
                textView2.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[11])){
                textView5.setText("E");
                textView1.setText("T");
                textView9.setText("İ");
                textView15.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[12])){
                textView7.setText("T");
                textView2.setText("İ");
                textView11.setText("P");
                textView13.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[13])){
                textView12.setText("E");
                textView15.setText("K");
                textView14.setText("Ş");
                textView13.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag>=14 && flag<18) {
            if(flag==14) {
                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                textView4.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.VISIBLE);
                textView21.setVisibility(View.VISIBLE);
                textView20.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView9.setVisibility(View.VISIBLE);

            }

            e_button.setText("S");
            k_button.setText("M");
            p_button.setText("A");
            s_button.setText("P");
            t_button.setText("K");
            i_button.setText("E");

            if(kelam.matches(kelimeler[14])){
                textView4.setText("S");
                textView1.setText("E");
                textView10.setText("M");
                textView2.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[15])){
                textView2.setText("A");
                textView11.setText("P");
                textView13.setText("S");
                textView23.setText("E");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[16])){
                textView1.setText("E");
                textView9.setText("S");
                textView15.setText("M");
                textView21.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }
            else if(kelam.matches(kelimeler[17])){
                textView20.setText("K");
                textView21.setText("A");
                textView22.setText("S");
                textView23.setText("E");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag==18){
            score-=number;
            if(score>highScore){
                highScore=score;
                sharedPreferences1.edit().putInt("highScore",highScore).apply();
            }
            Toast.makeText(getApplicationContext(),"SCORE: " + String.valueOf(score),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(NormalActivity.this,MenuActivity.class);
            startActivity(intent);
        }

        kelam="";



    }
}
