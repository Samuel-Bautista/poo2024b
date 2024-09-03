package ejerciciospoojava;

import java.util.Scanner;

/**
 *
 * @author Samuel Bautista u20241220454
 */
public class EjerciciosPooJava {
    public static void main(String[] args) {
        /*
        Ejercicio 1
        En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
        del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
        10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
        a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
        40% de descuento. El precio de cada computadora es de U$500.
        */
        int CantidadPcComprados;
        int Precio=500;
        double Descuento=0;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de equipos comprados...");
        CantidadPcComprados = input.nextInt();
        
        
        if (CantidadPcComprados<=0) {System.out.println("ERROR la cantidad de equipos comprados no puede ser cero");System.exit(0);}
        else if (CantidadPcComprados<5){Descuento=0.1;}
        else if (CantidadPcComprados>=5 && CantidadPcComprados<10){Descuento=0.2;}
        else if (CantidadPcComprados>=10) {Descuento=0.4;}
        
        
        double Op = ((CantidadPcComprados*Precio)-(CantidadPcComprados*Precio)*Descuento);
        System.out.println("TOTAL A PAGAR: "+Op);
    }
}
