package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        PlayGame();
    }
    public static void PlayGame() {
        int noOfRolls = 0;
        Scanner input = new Scanner(System.in);
        Hand hand = new Hand();
        while (noOfRolls<3) {
            noOfRolls +=1;
            System.out.println(hand);
            boolean bYatzy = CheckYatzy(hand);
            if(bYatzy) {
                System.out.println("Grattis! Du fick yatzy med siffran: " + hand.GetDice(0));

            } else if(noOfRolls<3) {
                System.out.println("Vill du slå en gång till(Ja/Nej)? ");
                String answer = input.nextLine();
                if (!answer.toLowerCase().equals("ja"))
                    break;
                else
                    hand = RollDices();
            }else
                break;
        }
        StartOver();
    }
    private static void StartOver() {
        Scanner restart = new Scanner(System.in);
        System.out.println("Game over, spela igen(Ja/Nej)? ");
        String reboot = restart.nextLine();
        if (reboot.toLowerCase().equals("ja")) {
            PlayGame();
        }
    }

    private static Hand RollDices(){
        return new Hand();
    }

    private static boolean CheckYatzy(Hand hand){
        if(hand.GetDice(0)==hand.GetDice(1) && hand.GetDice(1)==hand.GetDice(2) && hand.GetDice(2)==hand.GetDice(3) && hand.GetDice(3)==hand.GetDice(4))
            return true;
        else
            return false;
    }
}