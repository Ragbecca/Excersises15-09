package com.ragbecca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalExercise {

    public static void numberCalc() {
        Scanner scanner = new Scanner(System.in);

        boolean realNumber = false;
        int gottenInt;

        do {
            System.out.print("Geef een geheel potief getal: ");
            String gottenLine = scanner.nextLine();
            try {
                gottenInt = Integer.parseInt(gottenLine);
            } catch (NumberFormatException numberFormatException) {
                System.out.print("Dat is geen echt getal, zet een nieuwe neer: ");
                continue;
            }
            if (gottenInt < 0) {
                continue;
            }
            int evenSum = 0;
            int unEvenSum = 0;
            for (int i = 1; i <= gottenInt; i++) {
                if ((i % 2) == 0) {
                    evenSum += i;
                } else {
                    unEvenSum += i;
                }
            }
            System.out.println("som van oneven getallen tot en met " + gottenInt + " is " + unEvenSum);
            System.out.println("som van even getallen tot en met " + gottenInt + " is " + evenSum);
            int resultDifference;
            if ((evenSum-unEvenSum)<0) {
                resultDifference = (evenSum-unEvenSum)*-1;
            } else {
                resultDifference = evenSum-unEvenSum;
            }
            System.out.println("verschil tussen twee sommen is " + resultDifference);
            realNumber = true;
        } while (!realNumber);
    }
}
