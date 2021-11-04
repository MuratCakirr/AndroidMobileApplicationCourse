package com.example.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    public void onCreate(){
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("Ciu3iv11Eo23JjcXo0m19UevCOhVCJSH4iV1vht5")
                    .clientKey("nNSngss6oXeMieIsOWQxc54jUDNQo3jIVNNKh1aV")
                    .server("https://parseapi.back4app.com/")
                    .build()
        );

    }
}
