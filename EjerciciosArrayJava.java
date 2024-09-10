package ejerciciosarrayjava;

import java.util.Scanner;

/**
 *
 * @author Samuel Bautista u20241220454
 */
public class EjerciciosArrayJava {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida por teclado 10 números enteros y los almacene en un array. Al acabar
        de pedir los números, nos pedirá que busquemos un número entre los introducidos, y nos dirá si ha
        sido encontrado o no.
        */
        
        int [] Numbers = new int[10];
        
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Ingrese 10 numeros enteros");
        for (int i=0; i<=9; i++) {
            System.out.println("ingrese el valor "+(i+1));
            int input = Scan.nextInt();
            Numbers[i] = input;
        }
        
        System.out.println("Ingrese un numero para buscar");
        int input = Scan.nextInt();
        for (int i=0; i<=9;) {
            if (Numbers[i]==input) {
                System.out.println("Numero "+input+" Encontrado en el puesto "+(i+1));
                System.exit(0);
                }
            else if (i != input && i>=9){
                System.out.println("Numero no encontrado");
                }
            i += 1;
            }
    }   
}
