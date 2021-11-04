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

public class EasyActivity extends AppCompatActivity {
    Runnable runnable;
    Handler handler;
    SharedPreferences sharedPreferences2;

    TextView[] textViews;

    TextView highText,K_text, E_text, p_text3,p_text4,p_text5,p_text6,p_text7,p_text8,p_text9,p_text10,p_text11,p_text12,p_text13,p_text14,p_text15,p_text16,p_text17,
            p_text18,textView49,p_text,K_text2,textView54,P_text2,E_text2,K_text3,kelimeText, timeText, scoreText;

    int flag=0, number=0,score=0,highScore=0;

    String kelam = "";

    Button e_button, t_button, s_button, k_button, i_button, p_button;

    String[] kelimeler = {"ÇAY","ARI","IRK","BOY","OVA","BAR","HAK","KAR","HAN","ANT","ÇOK","KÜL","KOL","KAÇ","İMA","ANİ","İRİ","İKİ","NAM","SAY","YAS","SET","TAY","FAY"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        K_text = findViewById(R.id.K_text);
        p_text3 = findViewById(R.id.p_text3);
        p_text4 = findViewById(R.id.p_text4);
        p_text5 = findViewById(R.id.p_text5);
        p_text6 = findViewById(R.id.p_text6);
        p_text7 = findViewById(R.id.p_text7);
        p_text8 = findViewById(R.id.p_text8);
        p_text9 = findViewById(R.id.p_text9);
        p_text10 = findViewById(R.id.p_text10);
        p_text11 = findViewById(R.id.p_text11);
        p_text12 = findViewById(R.id.p_text12);
        p_text13 = findViewById(R.id.p_text13);
        p_text14 = findViewById(R.id.p_text14);
        p_text15 = findViewById(R.id.p_text15);
        p_text16 = findViewById(R.id.p_text16);
        p_text17 = findViewById(R.id.p_text17);
        p_text18 = findViewById(R.id.p_text18);
        K_text2 = findViewById(R.id.K_text2);
        p_text = findViewById(R.id.p_text);
        P_text2 = findViewById(R.id.P_text2);
        E_text = findViewById(R.id.E_text);
        E_text2 = findViewById(R.id.E_text2);
        K_text3 = findViewById(R.id.K_text3);
        textView49 = findViewById(R.id.textView49);
        textView54 = findViewById(R.id.textView54);

        textViews = new TextView[]{K_text, E_text, p_text3,p_text4,p_text5,p_text6,p_text7,p_text8,p_text9,p_text10,p_text11,p_text12,p_text13,p_text14,p_text15,p_text16,p_text17,
                p_text18,textView49,p_text,K_text2,textView54,P_text2,E_text2,K_text3};

        kelimeText = findViewById(R.id.kelimeText);
        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);
        highText = findViewById(R.id.highText1);

        sharedPreferences2 = this.getPreferences(Context.MODE_PRIVATE);
        highScore = sharedPreferences2.getInt("highScore",0);
        highText.setText("High Score: " + highScore);

        e_button = findViewById(R.id.e_button);
        t_button = findViewById(R.id.t_button);
        s_button = findViewById(R.id.s_button);
        k_button = findViewById(R.id.k_button);
        i_button = findViewById(R.id.i_button);
        p_button = findViewById(R.id.p_button);

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

            t_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kelam += t_button.getText();
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

            k_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += k_button.getText();
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
            p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kelam += p_button.getText();
                kelimeText.setText(kelam);
            }
            });


    }

    public void onayla(View view){

        //1.BULMACA

        if(flag<3) {
            if (kelam.matches(kelimeler[0])) {
                p_text4.setText("Ç");
                K_text2.setText("A");
                p_text10.setText("Y");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[1])) {
                K_text2.setText("A");
                E_text2.setText("R");
                textView54.setText("I");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[2])) {
                textView54.setText("I");
                p_text5.setText("R");
                p_text13.setText("K");
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
            if(flag==3) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                K_text2.setVisibility(View.VISIBLE);
                p_text10.setVisibility(View.VISIBLE);
                p_text9.setVisibility(View.VISIBLE);
                K_text3.setVisibility(View.VISIBLE);
                p_text5.setVisibility(View.VISIBLE);
                p_text13.setVisibility(View.VISIBLE);
                textView54.setVisibility(View.VISIBLE);

            }

            e_button.setText("O");
            k_button.setText("B");
            p_button.setText("Y");
            s_button.setText("V");
            t_button.setText("A");
            i_button.setText("R");

            if (kelam.matches(kelimeler[3])) {
                K_text2.setText("B");
                p_text10.setText("O");
                p_text9.setText("Y");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[4])) {
                p_text10.setText("O");
                K_text3.setText("V");
                p_text5.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[5])) {
                textView54.setText("B");
                p_text5.setText("A");
                p_text13.setText("R");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //3.BULMACA

        if(flag>=6 && flag<10) {
            if(flag==6) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                p_text4.setVisibility(View.VISIBLE);
                K_text2.setVisibility(View.VISIBLE);
                p_text10.setVisibility(View.VISIBLE);
                P_text2.setVisibility(View.VISIBLE);
                K_text3.setVisibility(View.VISIBLE);
                p_text5.setVisibility(View.VISIBLE);
                p_text7.setVisibility(View.VISIBLE);
                p_text6.setVisibility(View.VISIBLE);
                textView49.setVisibility(View.VISIBLE);

            }

            e_button.setText("H");
            k_button.setText("K");
            p_button.setText("A");
            s_button.setText("N");
            t_button.setText("T");
            i_button.setText("R");

            if (kelam.matches(kelimeler[6])) {
                p_text4.setText("H");
                K_text2.setText("A");
                p_text10.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[7])) {
                p_text10.setText("K");
                K_text3.setText("A");
                p_text5.setText("R");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[8])) {
                p_text4.setText("H");
                P_text2.setText("A");
                textView49.setText("N");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[9])) {
                K_text3.setText("A");
                p_text7.setText("N");
                p_text6.setText("T");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        //4.BULMACA

        if(flag>=10 && flag<14) {
            if(flag==10) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                E_text.setVisibility(View.VISIBLE);
                p_text11.setVisibility(View.VISIBLE);
                p_text3.setVisibility(View.VISIBLE);
                p_text9.setVisibility(View.VISIBLE);
                p_text7.setVisibility(View.VISIBLE);
                K_text3.setVisibility(View.VISIBLE);
                E_text2.setVisibility(View.VISIBLE);
                p_text17.setVisibility(View.VISIBLE);
                textView54.setVisibility(View.VISIBLE);

            }

            e_button.setText("Ç");
            k_button.setText("K");
            p_button.setText("O");
            s_button.setText("Ü");
            t_button.setText("L");
            i_button.setText("A");

            if (kelam.matches(kelimeler[10])) {
                E_text.setText("Ç");
                p_text11.setText("O");
                p_text3.setText("K");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[11])) {
                p_text3.setText("K");
                p_text9.setText("Ü");
                p_text7.setText("L");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[12])) {
                E_text2.setText("K");
                K_text3.setText("O");
                p_text7.setText("L");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[13])) {
                E_text2.setText("K");
                textView54.setText("A");
                p_text17.setText("Ç");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag>=14 && flag<19) {
            if(flag==14) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                K_text.setVisibility(View.VISIBLE);
                E_text.setVisibility(View.VISIBLE);
                p_text11.setVisibility(View.VISIBLE);
                p_text10.setVisibility(View.VISIBLE);
                p_text9.setVisibility(View.VISIBLE);
                p_text8.setVisibility(View.VISIBLE);
                K_text3.setVisibility(View.VISIBLE);
                E_text2.setVisibility(View.VISIBLE);
                P_text2.setVisibility(View.VISIBLE);
                textView49.setVisibility(View.VISIBLE);
                p_text18.setVisibility(View.VISIBLE);

            }

            e_button.setText("İ");
            k_button.setText("A");
            p_button.setText("M");
            s_button.setText("N");
            t_button.setText("R");
            i_button.setText("K");

            if (kelam.matches(kelimeler[14])) {
                K_text.setText("İ");
                E_text.setText("M");
                p_text11.setText("A");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[15])) {
                p_text11.setText("A");
                p_text10.setText("N");
                K_text3.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[16])) {
                P_text2.setText("İ");
                E_text2.setText("R");
                K_text3.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[17])) {
                P_text2.setText("İ");
                textView49.setText("K");
                p_text18.setText("İ");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[18])) {
                p_text10.setText("N");
                p_text9.setText("A");
                p_text8.setText("M");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            }else{
                score-=25;
                scoreText.setText("Score: " + String.valueOf(score));
            }
        }

        if(flag>=19 && flag<24) {
            if(flag==19) {

                for (int i=0; i<textViews.length; i++){
                    if(!textViews[i].getText().equals("")){
                        textViews[i].setVisibility(View.INVISIBLE);
                        textViews[i].setText("");
                    }
                }

                K_text.setVisibility(View.VISIBLE);
                E_text.setVisibility(View.VISIBLE);
                p_text11.setVisibility(View.VISIBLE);
                p_text10.setVisibility(View.VISIBLE);
                K_text3.setVisibility(View.VISIBLE);
                p_text7.setVisibility(View.VISIBLE);
                p_text6.setVisibility(View.VISIBLE);
                p_text12.setVisibility(View.VISIBLE);
                p_text14.setVisibility(View.VISIBLE);
                p_text16.setVisibility(View.VISIBLE);
                p_text15.setVisibility(View.VISIBLE);

            }

            e_button.setText("S");
            k_button.setText("A");
            p_button.setText("Y");
            s_button.setText("E");
            t_button.setText("T");
            i_button.setText("F");

            if (kelam.matches(kelimeler[19])) {
                K_text.setText("S");
                E_text.setText("A");
                p_text11.setText("Y");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[20])) {
                p_text11.setText("Y");
                p_text10.setText("A");
                K_text3.setText("S");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[21])) {
                K_text3.setText("S");
                p_text7.setText("E");
                p_text6.setText("T");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[22])) {
                p_text6.setText("T");
                p_text12.setText("A");
                p_text14.setText("Y");
                score+=50;
                scoreText.setText("Score: " + String.valueOf(score));
                flag++;
            } else if (kelam.matches(kelimeler[23])) {
                p_text16.setText("F");
                p_text15.setText("A");
                p_text14.setText("Y");
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
                sharedPreferences2.edit().putInt("highScore",highScore).apply();
            }
            Toast.makeText(getApplicationContext(),"SCORE: " + String.valueOf(score),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(EasyActivity.this,MenuActivity.class);
            startActivity(intent);
        }
        kelam="";


    }

}
