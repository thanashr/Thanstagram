package com.example.thanstagram;

import android.util.Log;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String TAG = "Posthere";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED_KEY = "createdAt";


    public String getDescription() {
        Log.i(TAG, "testing db "+ getDate(KEY_CREATED_KEY));
//        Log.i(TAG, "Here" + "Sat Oct 31 01:38:49 +0000 2020" + "-----"+ getDate(KEY_CREATED_KEY));

        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION , description);
    }

    public ParseFile getImage() {

//        Log.i(TAG, "HereImage" + KEY_IMAGE.getClass().getName() + KEY_IMAGE);

        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE , parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser user) {
        put(KEY_USER , user);
    }


}
