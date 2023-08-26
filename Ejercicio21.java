package ejercicio.pkg18;
/**
 *Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo
7
 */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float lado1, lado2, lado3;
        System.out.print("Ingrese el valor del lado 1: ");
        lado1 = tec.nextFloat();
        System.out.print("Ingrese el valor del lado 2: ");
        lado2 = tec.nextFloat();
        System.out.print("Ingrese el valor del lado 3: ");
        lado3 = tec.nextFloat();
        
        float perimetro = lado1 + lado2 + lado3;
        float semiperimetro = perimetro / 2; //suma de los lados dividido 2
        double altura = (2/lado1)*(Math.sqrt(semiperimetro*(semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado3))); //ni idea, me toco buscarla
        float area = (lado1 * (float)altura)/2;
        
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Semiperimetro = " + semiperimetro);
        System.out.println("Area = " + area);
    }
    
}
