/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;
import java.util.Scanner;
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
        
        int[] arreglo;
        int[] tamanio;
        int opcion;
        int valores;
        System.out.println("Ingrese el tamaño del arreglo");
        opcion = entrada.nextInt();
        
        tamanio = new int [opcion];
        
        for (int i = 0; i < tamanio.length; i++) {
            System.out.println("Ingrese los valores del arreglo");
            int dato = entrada.nextInt();
            arreglo[i] = dato;
            
        }
        int resultado;
        resultado = misterio(arreglo, opcion);
        
        System.out.println("");
  
        
        System.out.println("El resulatado es:");
        
        
      
    }
    

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
