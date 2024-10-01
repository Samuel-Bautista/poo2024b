package triangulo;

import java.util.Scanner;

/**
 *
 * @author Samuel bautista 20241220454
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Triangulo miTriangulo = new Triangulo();
        
        System.out.println("Ingrese base del triangulo");
        miTriangulo.Base = input.nextInt();
        System.out.println("Ingrese altura del triangulo");
        miTriangulo.Altura = input.nextInt();
        
        miTriangulo.calcularAreaTriangulo();
        
    }
}
