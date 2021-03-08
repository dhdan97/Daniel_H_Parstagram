package com.example.daniel_h_parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kQsilkum6JOztF8dvedahquN5UcZ63tk3pLpYM5Q")
                .clientKey("l3QaEbS9DwbDdeyXk8pRXZrbM8pJk6AOxSlM2BcE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
