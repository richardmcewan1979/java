package com.gu;

import junit.framework.TestCase;
import org.junit.Test;

public class ScrabbleTest extends TestCase {


    @Test
    public void testWordScoreToHandlesNull() {
        Scrabble scrabble = new Scrabble();
        String wordToTest = null;
        assertEquals(0, scrabble.getScoreOfWord(null));
    }

    @Test
    public void testWordScoreReturnsTheCorrect() {
        Scrabble scrabble = new Scrabble();
        String wordToTest = "guardian";
        assertEquals(10, scrabble.getScoreOfWord(wordToTest));
    }

    @Test
    public void testWordScoreHandlesUpperCase() {
        Scrabble scrabble = new Scrabble();
        String wordToTest = "GuarDian";
        assertEquals(10, scrabble.getScoreOfWord(wordToTest));
    }

}
