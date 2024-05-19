/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class JavaApplication4 {

    public static void main(String[] args) {
  
        // Test de la classe NombrePair
        int number = 6;
        System.out.println("Le nombre " + number + " est pair : " + Pair.estPair(number));

        // Test de la classe PGCD
        int a = 24;
        int b = 36;
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + PGCD.pgcd(a, b));
        //test

        // Test de la classe Somme
        int[] tableau = {1, 2, 3, 4, 5};
        System.out.println("La somme des éléments du tableau est : " + somme.somme(tableau));

        // Test de la classe Moyenne
        int[] tableau2 = {1, 2, 3, 4, 5};
        System.out.println("La moyenne des éléments du tableau est : " + moyenne.calculerMoyenne(tableau2));
    
    }
}