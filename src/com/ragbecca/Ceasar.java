package com.ragbecca;

import java.util.Scanner;

public class Ceasar {

    public static void ceasarCode() {
        System.out.print("Insert your text (ONLY UPPERCASE AND LETTERS) ");
        Scanner scanner = new Scanner(System.in);
        String gottenText = scanner.nextLine();

        if (gottenText.isBlank()) {
            System.out.println("That isn't anty text");
            ceasarCode();
            return;
        }

        char[] chars = gottenText.toUpperCase().toCharArray();
        StringBuilder text = new StringBuilder();

        for (char inChars : chars) {
            switch (inChars) {
                case 'Z' -> {
                    char updatedCharC = 'C';
                    text.append(updatedCharC);
                }
                case 'Y' -> {
                    char updatedCharB = 'B';
                    text.append(updatedCharB);
                }
                case 'X' -> {
                    char updatedCharA = 'A';
                    text.append(updatedCharA);
                }
                default -> {
                    char updatedChar = (char) (inChars + 3);
                    text.append(updatedChar);
                }
            }
        }

        System.out.println("The values are: " + text);
    }
}
