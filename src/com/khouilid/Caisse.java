package com.khouilid;

import java.util.Random;

public class Caisse {
    private int caisseNumber;
    private static double montentTotal = 0;

    public Caisse() {
        Random rand = new Random();
        int number = rand.nextInt();
        if (number < 0) {
            number = number * (-1);
        }
        this.caisseNumber = number;
    }


    public static void calcTotal(Chario chario) {
        montentTotal += chario.getTotalePrice();


    }

    public String scanner(Articles art, Chario chario) {

        return  art.getName() + " : " + art.getPrice() + " X " + chario.getQuantity()
                + " = " + chario.getTotalePrice() + " (" + art.isSold() + ")";

    }

    public void getTotal() {
        System.out.println("_______________________________________________");
        System.out.println("Totale :                             " + montentTotal + "DH");
        System.out.println("N°: " + caisseNumber);
        System.out.println("_______________________________________________");

    }


}
