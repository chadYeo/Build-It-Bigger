package com.example.chadyeo.javajokelib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class JavaJokeLib {
    private List<String> jokes;
    private Random random;

    public JavaJokeLib() {
        jokes = new ArrayList<String>();

        jokes.add("When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.");
        jokes.add("Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.");
        jokes.add("Anton, do you think I’m a bad mother? My name is Paul.");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        jokes.add("What is the difference between a snowman and a snowwoman? Snowballs");
        jokes.add("Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!");
        jokes.add("Me and my wife decided that we don't want to have children anymore. So anybody who wants one can leave us their phone number and address and we will bring you one.");

    }

    public String getRandomJokes() {
        random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
}
