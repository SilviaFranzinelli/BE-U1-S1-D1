package it.epicode.esercizio2;

import java.util.Scanner;

public class esercizio2 {
    // Implementare un metodo che chiede all'utente di inserire tre stringhe da tastiera e scrivere in console la concatenazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String stringa3 = scanner.nextLine();

        System.out.println("Concatenazione in ordine di inserimento: " + stringa1 + " " + stringa2 + " " + stringa3);
        System.out.println("Concatenazione in ordine di inserimento inverso: " + stringa3 + " " + stringa2 + " " + stringa1);

        scanner.close();
    }


}
