package com.ragbecca;

import java.util.Scanner;

public class DateCalc {

    int time;

    public static void dateCalc() {
        int getTimeValue = getTime();
        System.out.println(getTimeValue);
    }

    public static int getTime() {
        System.out.println("Vul in: nummer <TIJDSDUUR>");
        System.out.println("Geldige tijdsduren zijn jaren, weken, dagen en uren. Dit zijn alleen gehele getallen");
        Scanner scanner = new Scanner(System.in);

        String gottenLine;
        boolean realNumber = false;
        boolean realType = false;
        int value = 0;
        int valueFromMinutes = 0;

        do {
            gottenLine = scanner.nextLine();
            String timeType = gottenLine.substring(gottenLine.indexOf(" ") + 1).toLowerCase();
            String timeValue = gottenLine.substring(0, gottenLine.indexOf(" "));
            try {
                value = Integer.parseInt(timeValue);
                realNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Je hebt geen geldig nummer gekozen.");
            }
            if (timeType.equals("jaren") || timeType.equals("jaar")) {
                valueFromMinutes = 525600;
                realType = true;
            } else if (timeType.equals("weken") || timeType.equals("week")) {
                valueFromMinutes = 10080;
                realType = true;
            } else if (timeType.equals("dagen") || timeType.equals("dag")) {
                valueFromMinutes = 1440;
                realType = true;
            } else if (timeType.equals("uren") || timeType.equals("uur")) {
                valueFromMinutes = 60;
                realType = true;
            } else {
                System.out.println("Je hebt geen geldige tijdsduur gekozen! Kies een andere");
            }
        } while (!realNumber && !realType);

        return value*valueFromMinutes;
    }
}
