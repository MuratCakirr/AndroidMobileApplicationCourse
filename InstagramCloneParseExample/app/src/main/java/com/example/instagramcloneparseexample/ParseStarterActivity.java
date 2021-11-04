package com.example.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    public void onCreate (){
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("3MZjbRd6yKLayjIIVYO8SwrKTPUbWyMSKHlFjbus")
                        .clientKey("NE26x8hLM2mVotkVXzn6ei2hcWnvsp7oKL6XiKQi")
                        .server("https://parseapi.back4app.com/")
                        .build()
        );

    }

}
