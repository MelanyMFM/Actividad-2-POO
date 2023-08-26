package ejercicio.pkg18;

import java.util.Scanner;

public class Ejercico11 {
    public static void main(String[] args) {
        int N1, N2, N3, mayor;
        Scanner input = new Scanner(System.in);
        System.out.print("Inserte el primer numero: ");
        N1 = input.nextInt();
        System.out.print("Inserte el segundo numero: ");
        N2 = input.nextInt();
        System.out.print("Inserte el tercer numero: ");
        N3 = input.nextInt();
        if (N1 > N2 && N1 > N3) {
            mayor = N1;
        } else{
            if (N2>N3){
                mayor = N2;
            } else{
                mayor = N3;
            }
        }
        System.out.println("El mayor valor entre " + N1 +
                ", " + N2 + " y " + N3 + " es: " + mayor);
    }
}
