package javaapplication4;

public class somme {
    public static int somme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        System.out.println("La somme des éléments du tableau est : " + somme(tableau));
    }

    }

    

