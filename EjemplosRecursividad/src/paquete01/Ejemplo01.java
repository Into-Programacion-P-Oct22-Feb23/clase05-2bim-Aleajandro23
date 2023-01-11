/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
   procesoo recursivo
 */
package paquete01;

public class Ejemplo01 {

    public static void main(String[] args) {
        imprimirNumeros(4);
    }
                                          // 4 // 3
    public static void imprimirNumeros(int numero) {    // void es un procedimiento
        System.out.printf("El número es: %d\n", numero);
        numero = numero - 1;  // 4-1 = 3  // 3-1 = 2
        imprimirNumeros(numero);  // 3 // 2

    }

}
