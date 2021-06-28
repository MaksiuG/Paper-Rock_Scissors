package com.company;

public class Main {

    public static void main(String[] args) {
        Move move = new Move();

        Move.check(move.Fighter, move.Opponnent);
        System.out.println("Ty = " + move.Fighter);
        System.out.println("Przeciwnik = " + move.Opponnent);
    }
}