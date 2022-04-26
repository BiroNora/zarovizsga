package com.codecool.word_finder;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void getWordCount_wordRace_returns0() {
        WordFinder wordFinder = new WordFinder("src/main/resources/word_finder_empty.txt");
        Map<String, Integer> result = wordFinder.getWordCount("race");
        assertEquals(0, result.get("race"));

        Map<String, Integer> result2 = wordFinder.getWordCount("acre");
        assertEquals(0, result2.get("acre"));
    }

    @Test
    void getWordCount_wordRace_returns_when_on_every_line_single_occurance() {
        WordFinder wordFinder = new WordFinder("src/main/resources/word_finder_simple.txt");
        Map<String, Integer> result = wordFinder.getWordCount("race");
        assertEquals(1, result.get("race"));

        Map<String, Integer> result2 = wordFinder.getWordCount("acre");
        assertEquals(3, result2.get("acre"));
    }
    @Test
    void getWordCount_wordRace_returns41() {
        WordFinder wordFinder = new WordFinder("src/main/resources/word_finder.txt");
        Map<String, Integer> result = wordFinder.getWordCount("race");

        assertEquals(41, result.get("race"));
    }

    @Test
    void getWordCount_wordAcre_returns30() {
        WordFinder wordFinder = new WordFinder("src/main/resources/word_finder.txt");
        Map<String, Integer> result = wordFinder.getWordCount("acre");

        assertEquals(30, result.get("acre"));
    }

    @Test
    void getWordCount_notFoundWord_throwsIllegalArgumentException() {
        WordFinder wordFinder = new WordFinder("src/main/resources/word_finder.txt");

        assertThrows(IllegalArgumentException.class, () -> {
            wordFinder.getWordCount("xyz");});
    }
}