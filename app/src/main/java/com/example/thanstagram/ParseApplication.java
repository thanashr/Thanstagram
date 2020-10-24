package com.example.thanstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("APnGBXifpVItE9cFlbHSxb4gjIqYzZO2Pa1XNMH8")
                .clientKey("hE1xlm7LsoS6RRaPs79eLvGB2Xz6BCwNTrLrofjI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
