package ejercicio.pkg19;
import java.util.Scanner;
public class Ejercicio19 {
    /**
     * Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
       perímetro, el valor de la altura y el área del triángulo.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float lado, perimetro;
        System.out.println("Ingrese el valor del lado del triangulo: ");
        lado = tec.nextFloat();
        
        perimetro = lado * 3;
        double altura = (Math.sqrt(3) * lado) / 2;
        double area = (lado * altura) / 2;
        
        System.out.println("El triangulo equilatero de lado " + lado + "tiene: ");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + (float)altura);
        System.out.println("Area: " + (float)area);
    }
}
