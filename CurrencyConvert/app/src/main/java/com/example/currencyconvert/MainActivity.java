package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView tryText;
    TextView cadText;
    TextView chfText;
    TextView usdText;
    TextView jpyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tryText = findViewById(R.id.tryText);
        cadText = findViewById(R.id.cadText);
        chfText = findViewById(R.id.chfText);
        usdText = findViewById(R.id.usdText);
        jpyText = findViewById(R.id.jpyText);
    }

    public void getRates(View view){
        DownloadData downloadData = new DownloadData();

        try {
            String url = "http://data.fixer.io/api/latest?access_key=04663110077090e37b0bfda927828466";

            downloadData.execute(url);
        } catch (Exception e){

        }
    }

    private class DownloadData extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {

            String result = "";
            URL url;
            HttpURLConnection httpURLConnection;

            try {
                url = new URL(strings[0]);
                httpURLConnection =(HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

                int data = inputStreamReader.read();

                while (data > 0){

                    char character = (char) data;
                    result += character;

                    data = inputStreamReader.read();
                }

                return result;

            } catch (Exception e){
                return null;
            }


        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            //System.out.println("alinan data:" + s);

            try {

                JSONObject jsonObject = new JSONObject(s);
                String base = jsonObject.getString("base");
                //System.out.println("base:" + base);

                String rates = jsonObject.getString("rates");
                System.out.println("rates:" + rates);

                JSONObject jsonObject1 = new JSONObject(rates);
                String turkishLira = jsonObject1.getString("TRY");
                String usd = jsonObject1.getString("USD");
                String jpy = jsonObject1.getString("JPY");
                String cad = jsonObject1.getString("CAD");
                String chf = jsonObject1.getString("CHF");

                tryText.setText("TRY: " + turkishLira);
                cadText.setText("CAD: " + cad);
                chfText.setText("CHF: " + chf);
                usdText.setText("USD: " + usd);
                jpyText.setText("JPY: " + jpy);

            } catch (Exception e){

            }
        }


    }
}
