package it.epicode.esercizio1;

import java.util.Arrays;

public class esercizio {
    // 1 metodo "prodotto": accetta due numeri interi e ritorna il loro prodotto

    public static int prodotto(int a, int b) {
        return a * b;
    }

    // 2 metodo "concatena": accetta una stringa e un intero e restituisce una stringa che concatena gli elementi

    public static String concatena(String a, int b) {
        return a + b;
    }

    // 3 metodo "inserisciInArray": accetta un array di strighe di cinque elementi ed una stringa che restituisca un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedenti in quarta e quinta posizione siano rispettivamente in quinta e sesta posizione

    public static String[] inserisciInArray(String[] a, String b) {
        String[] array = new String[6];
        array[0] = a[0];
        array[1] = a[1];
        array[2] = b;
        array[3] = a[2];
        array[4] = a[3];
        array[5] = a[4];
        return array;
    }

    public static void main(String[] args) {
        System.out.println(prodotto(12, 45));
        System.out.println(concatena("Che ore sono ", 1804));
        System.out.println(Arrays.toString(inserisciInArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa")));
    }













}
