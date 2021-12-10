package com.Collections.Project;

import java.util.*;

//Enter a card :
//b2
//Four symbols gathered in 8 cards.
//Cards in Set are :
//a 1
//b 2
//c 2
//d 6

class Card{
    char symbol;
    int number;
    Card(char symbol, int number){
        super();
        this.symbol=symbol;
        this.number=number;
    }

    public Card() {

    }

    public int getNumber() {
        return number;
    }

    public char getSymbol() {
        return symbol;
    }


    @Override
    public int hashCode() {
        return String.valueOf(symbol).hashCode();
    }

    //If in case the symbol generated from hashcode is already present equals() will return true and it will not add the
    //object into the hashset.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return this.symbol == card.symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class Prj3 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Set<Card> set = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                System.out.println("Enter a card:");
                Card card = new Card(sc.nextLine().charAt(0), sc.nextInt());
                set.add(card);
                sc.nextLine();
            }
            System.out.println("Four symbols gathered in eight cards.");
            System.out.println("Cards in Set are:");


            for (Card card : set)
                System.out.println(card.getSymbol() + " " + card.getNumber());

            sc.close();
        }
    }
