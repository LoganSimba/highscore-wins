package com.pluralsight;

import java.util.Scanner;

public class HigheScoreWins {
        public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //ask user for score
        System.out.println("Display the game score in this format Home:Visitor|21:9 ");
        String scoreformat = scanner.nextLine().trim();

        //split the input into teams and scores
        String[] gameParts = scoreformat.split("\\|");
        String teams = gameParts[0];
        String score = gameParts[1];

        String[] teamsPlaying = teams.split(":");
        String homeTeam = teamsPlaying[0];
        String awayTeam = teamsPlaying[1];

        // store the right side(the score part) in a variable
        String[] teamsScore= gameParts[1].split(":");

        // Parse the scores in integers
        int homeScore = Integer.parseInt(teamsScore[0]);
        int awayScore = Integer.parseInt(teamsScore[1]);


        System.out.println(teams);
        System.out.println(score);

    }
}
