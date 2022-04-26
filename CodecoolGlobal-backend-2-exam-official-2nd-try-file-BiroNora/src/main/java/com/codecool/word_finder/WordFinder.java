package com.codecool.word_finder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFinder {
    String pathName = "";

    public WordFinder(String pathName) {
        this.pathName = pathName;
    }

    public Map<String, Integer> getWordCount(String race) throws IllegalArgumentException {
        if (race == null || race.length() == 0) throw new IllegalArgumentException();

        Map<String, Integer> result = new HashMap<>();
        int raceCounter = 0;
        int length = race.length();

        try {
            File file = new File(pathName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().replace(" ", "");
                int pos = 0;
                while (true) {
                    pos = line.indexOf(race, pos);
                    if (pos < 0) {
                        break;
                    }
                    raceCounter++;
                    pos += length;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        result.put(race, raceCounter);
        return result;
    }

}
