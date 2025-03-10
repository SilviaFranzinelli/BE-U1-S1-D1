package it.epicode.esercizio3;

public class esercizio3 {
    //  1 metodo "prerimetroRettangolo": che accetta la lunghezza dei due lati di un rettangolo e ne calcola il perimetro

    public static double perimetroRettangolo(double base, double altezza) {
        return (base + altezza) * 2;

    }

    // 2 metodo "pariDispari": accetta un numero e restituisce 0 se il numero è pari e 1 se è dispari

    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // 3 metodo "perimetroTriangolo": accetta le lunghezze decimali dei lati di un triangolo e ne restituisce l'area

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }

    public static void main(String[] args) {
        System.out.println(perimetroRettangolo(4, 11));
        System.out.println(pariDispari(5));
        System.out.println(perimetroTriangolo(3, 4, 5));
    }
}
