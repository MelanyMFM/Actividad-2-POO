/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package actividad1;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here}

        int valordc = 0;
        float total = 0;
        String color = "";

        Scanner in = new Scanner(System.in);
        valordc = in.nextInt();
        Scanner en = new Scanner(System.in);
        color = en.nextLine();

        switch (color) {
            case "blanco" -> System.out.println("El costo del producto es "+ valordc);
            case "verde" -> {
                total = (float) (valordc * 0.9);
                System.out.println("El costo del producto es " + total);
            }
            case "amarilla" -> {
                total = (float) (valordc * 0.75);
                System.out.println("El costo del producto es " + total);
            }
            case "azul" -> {
                total = (float) (valordc * 0.5);
                System.out.println("El costo del producto es " + total);
            }
            case "roja" -> System.out.println("El producto es totalmente gratis");

        }
    }
}
