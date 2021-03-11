package com.example.daniel_h_parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kQsilkum6JOztF8dvedahquN5UcZ63tk3pLpYM5Q")
                .clientKey("l3QaEbS9DwbDdeyXk8pRXZrbM8pJk6AOxSlM2BcE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
