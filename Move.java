package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Move implements Scissors,Rock,Paper{

    public final Object Fighter = chooseFighter();
    public final Object Opponnent = choosingOpponent();

    private static Object chooseFighter(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Object choice = null;

        while (true) {
            try {
                System.out.println(" 1 - Papier\n 2 - Kamień\n 3 - Nożyce\n");

                int count = Integer.parseInt(br.readLine());

                switch (count) {
                    case 1:
                        choice = Paper.you;
                        break;
                    case 2:
                        choice = Rock.you;
                        break;
                    case 3:
                        choice = Scissors.you;
                        break;

                    default:
                        System.out.println("Type in 1 - 3 range");
                        break;
                }
                if(count > 0 && count < 4){
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Type count");
            }
        }
        return choice;
    }
    public static void check(Object yourFighter, Object opponnentFighter){
        String yourFighter1 = (String) yourFighter;
        switch (yourFighter1){
            case "Kamień":
                if(opponnentFighter.equals(Rock.opponent)){
                    System.out.println("Przegrałeś");
                }
                else if(opponnentFighter.equals(yourFighter)){
                    System.out.println("Remis");
                }
                else{
                    System.out.println("Wygrałeś");
                }
                break;

            case "Papier":
                if(opponnentFighter.equals(Paper.opponent)){
                    System.out.println("Przegrałeś");
                }
                else if(opponnentFighter.equals(yourFighter)){
                    System.out.println("Remis");
                }
                else{
                    System.out.println("Wygrałeś");
                }
                break;

            case "Nożyce":
                if(opponnentFighter.equals(Scissors.opponent)){
                    System.out.println("Przegrałeś");
                }
                else if(opponnentFighter.equals(yourFighter)){
                    System.out.println("Remis");
                }
                else{
                    System.out.println("Wygrałeś.");
                }
                break;

            default:
                System.out.println("Something gone wrong");
                break;
        }
    }
    private static Object choosingOpponent(){
        int count = random();

        Object choice = null;

        switch (count){
            case 1:
                choice = Paper.you;
                break;

            case 2:
                choice = Rock.you;
                break;
            case 3:
                choice = Scissors.you;
                break;

            default:
                System.out.println("Something gone wrong.");
                break;
        }
        return choice;
    }
    private static int random(){
        Random random = new Random();
        int count = random.nextInt(4) + 1;
        if(count == 4){
            count -= 1;
        }
        return count;
    }
}