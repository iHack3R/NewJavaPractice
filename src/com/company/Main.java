package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String sentence = "Earth is beautiful!";
        int character = sentence.length();
        String newSentence = sentence.replace("!", "!!");
        System.out.println(character);
        System.out.println(newSentence);
        int [] numbers = {2, 1, 5, 4, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int x = (int) (Math.round (Math.random() * 100));
        int y = (int) (Math.random() * 100);
        System.out.println(x);
        System.out.println(y);
    }
    }
}