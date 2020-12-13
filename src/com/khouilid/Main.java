package com.khouilid;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<String> ticket = new HashSet<String>();
        System.out.println("Nouveu caisse");
        ajouterProduit(ticket);
    }

    private static void ajouterProduit(HashSet<String> ticket) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________________________________________________________");
        System.out.print("Le nom de produit: ");
        String name = input.next();
        System.out.println("__________________________________________________________");
        System.out.print("Le prix: ");
        double price = input.nextDouble();

        System.out.println("__________________________________________________________");
        System.out.print("La quantité: ");
        int quantity = input.nextInt();
        System.out.println("__________________________________________________________");
        System.out.print("Il ya une sold [OUI/NON]: ");
        String sold = input.next().toLowerCase();
        System.out.println("__________________________________________________________");

        System.out.print("Ajouter autre produit [OUI/NON]: ");
        String add = input.next().toLowerCase();
        System.out.println("__________________________________________________________");
        boolean solde;
        if (sold.equals("oui")) solde = true;
            solde = false;

        Articles art = new Articles(name, price, solde);
        Chario chariot = new Chario(quantity, art.getPrice());
        Caisse caisse = new Caisse();
        Caisse.calcTotal(chariot);
        ticket.add(caisse.scanner(art, chariot));

        if (add.equals("oui")) ajouterProduit(ticket);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (var tick : ticket) {
            System.out.println("_______________________________________________");
            System.out.println(tick);
        }
        caisse.getTotal();


    }
}
