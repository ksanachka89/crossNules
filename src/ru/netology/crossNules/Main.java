package ru.netology.crossNules;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        int xCounter = 0;
        int oCounter = 0;

        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                xCounter++;
            } else if (input.charAt(i) == 'O')
                oCounter++;
        }

        if (Math.abs(xCounter - oCounter) > 1) {
            System.out.println("Impossible");
        } else if (testX(input) && testO(input)) {
            System.out.println("Impossible");
        } else if (testX(input)) {
            System.out.println("X wins");
        } else if (testO(input)) {
            System.out.println("O wins");
        } else {
            boolean spaceTest = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '_') {
                    spaceTest = true;
                }
            }
            if (spaceTest) {
                System.out.println("Game not finished");
            } else {
                System.out.println("Draw");
            }
        }
    }

    public static boolean testX(String s) {
        boolean test = false;
        if (s.charAt(0) + s.charAt(1) + s.charAt(2) == 264) {
            test = true;
        } else if (s.charAt(3) + s.charAt(4) + s.charAt(5) == 264) {
            test = true;
        } else if (s.charAt(6) + s.charAt(7) + s.charAt(8) == 264) {
            test = true;
        } else if (s.charAt(0) + s.charAt(3) + s.charAt(6) == 264) {
            test = true;
        } else if (s.charAt(1) + s.charAt(4) + s.charAt(7) == 264) {
            test = true;
        } else if (s.charAt(2) + s.charAt(5) + s.charAt(8) == 264) {
            test = true;
        } else if (s.charAt(0) + s.charAt(4) + s.charAt(8) == 264) {
            test = true;
        } else if (s.charAt(2) + s.charAt(4) + s.charAt(6) == 264) {
            test = true;
        }
        return test;

    }
    public static  boolean testO(String s) {
        boolean test = false;
        if (s.charAt(0) + s.charAt(1) + s.charAt(2) == 237) {
            test = true;
        } else if (s.charAt(3) + s.charAt(4) + s.charAt(5) == 237) {
            test = true;
        } else if (s.charAt(6) + s.charAt(7) + s.charAt(8) == 237) {
            test = true;
        } else if (s.charAt(0) + s.charAt(3) + s.charAt(6) == 237) {
            test = true;
        } else if (s.charAt(1) + s.charAt(4) + s.charAt(7) == 237) {
            test = true;
        } else if (s.charAt(2) + s.charAt(5) + s.charAt(8) == 237) {
            test = true;
        } else if (s.charAt(0) + s.charAt(4) + s.charAt(8) == 237) {
            test = true;
        } else if (s.charAt(2) + s.charAt(4) + s.charAt(6) == 237) {
            test = true;
        }
        return test;
    }
}
