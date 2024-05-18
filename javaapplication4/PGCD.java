package javaapplication4;

public class PGCD {
     // Méthode pour calculer le PGCD de deux nombres
    public static int pgcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}

//modif pour branche1
//modif pour conflit