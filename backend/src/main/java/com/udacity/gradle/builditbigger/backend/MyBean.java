package com.udacity.gradle.builditbigger.backend;

import com.example.chadyeo.javajokelib.JavaJokeLib;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JavaJokeLib().getRandomJokes();
        return myData;
    }

}