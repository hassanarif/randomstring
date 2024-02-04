package com.interview.randomstring.randomstring.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomStringGenerator {
    public static String[] getRandomStrings(int numberOfStrings, int length, boolean includeUpperCase, boolean includeLowerCase,
                                         boolean includeIntegers, boolean uniqueStrings) {

        String[] result = new String[numberOfStrings];

        if(numberOfStrings <= 0 ) {
            throw new IllegalArgumentException("Number of Strings must be greater than zero.");
        }

        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }

        StringBuilder characters = new StringBuilder();
        if(includeUpperCase) {
            characters.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if(includeLowerCase) {
            characters.append("abcdefghijklmnopqrstuvwxyz");
        }
        if(includeIntegers) {
            characters.append("0123456789");
        }

        Random random = new Random();
        if(uniqueStrings) {
            Set<String> uniqueSet = new HashSet<>();
            while(uniqueSet.size() < numberOfStrings) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < length; j++) {
                    int randomIndex = random.nextInt(characters.length());
                    char randomCharacter = characters.charAt(randomIndex);
                    stringBuilder.append(randomCharacter);
                }
                uniqueSet.add(stringBuilder.toString());
            }
            return uniqueSet.toArray(new String[0]);
        } else {
            for(int i=0;i<numberOfStrings;i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < length; j++) {
                    int randomIndex = random.nextInt(characters.length());
                    char randomCharacter = characters.charAt(randomIndex);
                    stringBuilder.append(randomCharacter);
                }
                result[i] = stringBuilder.toString();
            }
            return result;
        }
    }
}
