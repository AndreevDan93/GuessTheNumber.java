package ru.geecbranes.gues_the_number;

import java.util.Scanner;

public class GuesTheNumber {

   private static Scanner scanner = new Scanner(System.in);
    private static Object playlevel;

    public static void main(String[] args) {
        System.out.println("Gues a number");
        for (int i = 10; i <= 30; i = i + 10) playlevel(i);
    }

    private static void playlevel( int range ) {
        while (true) {
             System.out.println("gues at 0 at " + range);
            int number = ((int) (Math.random() * range));
            int input_number = scanner.nextInt();
            if ( input_number == number ) {
                System.out.println("Right!" + input_number);
                break;

            } else if ( input_number > number ) {
                System.out.println("Number is low");
            } else {
                System.out.println("Number is hight");
            }
        }
        System.out.println("maybe + one more game?");
    }


}
