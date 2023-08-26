package ejercicio.pkg7;
/**
 *Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
 si A es mayor, menor o igual a B.
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int a, b;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        a = tec.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = tec.nextInt();
        
        if(a > b){System.out.print(a + " es mayor que " + b);}
        else if (b > a){System.out.println(a + " es menor que " + b);} 
        else {System.out.println("Ambos numeros son iguales");}
    }
    
}
