package com.gu;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    public final Map<Character, Integer> map = new HashMap<>();

    public Scrabble() {

        map.put('a',1);
        map.put('b',3);
        map.put('c',3);
        map.put('d',2);
        map.put('e',1);
        map.put('f',4);
        map.put('g',2);
        map.put('h',4);
        map.put('i',1);
        map.put('j',8);
        map.put('k',5);
        map.put('l',1);
        map.put('m',3);
        map.put('n',1);
        map.put('o',1);
        map.put('p',3);
        map.put('q',10);
        map.put('r',1);
        map.put('s',1);
        map.put('t',1);
        map.put('u',1);
        map.put('v',4);
        map.put('w',4);
        map.put('x',8);
        map.put('y',4);
        map.put('z',10);

    }

    public int getScoreOfWord(String word){

        if(word == null){
            return 0;
        }

        String lowerCaseWord = word.toLowerCase();

        int score = 0;

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            score += map.get(lowerCaseWord.charAt(i));
        }
        return score;

    }
























}
