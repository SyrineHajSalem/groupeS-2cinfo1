/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



    public class moyenne {

    // Méthode pour calculer la moyenne des éléments d'un tableau d'entiers
    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0; // Retourne 0 si le tableau est vide pour éviter une division par zéro
        }
        
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return (double) somme / tableau.length;
    }

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        System.out.println("La moyenne des éléments du tableau est : " + calculerMoyenne(tableau));
    }
}

