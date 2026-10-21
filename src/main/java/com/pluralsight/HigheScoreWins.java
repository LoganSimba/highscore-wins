package com.pluralsight;

import java.util.Scanner;

public class HigheScoreWins {
        public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //ask user for score
        System.out.println("Display the game score in this format Home:Visitor|21:9 ");
        String scoreformat = scanner.nextLine().trim();

        String[] gameParts = scoreformat.split("\\|");
        String teams = gameParts[0];
        String score = gameParts[1];

        System.out.println(teams);
        System.out.println(score);

    }
}
