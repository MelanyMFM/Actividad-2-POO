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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int a = 0, b = 0, c = 0, d = 0;
        
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        Scanner en = new Scanner(System.in);
        b = en.nextInt();
        Scanner ins = new Scanner(System.in);
        c = ins.nextInt();
        Scanner inse = new Scanner(System.in);
        d = inse.nextInt();


        if (a == b && a == c) {
            System.out.println("La esfera diferente es la D" );
            
        }
        
        if (a == b && a == d) {
            System.out.println("La esfera diferente es la C" );
            
        }
        
        if (a == d && a == c) {
            System.out.println("La esfera diferente es la B" );
            
        }

        if (b == c && c == d) {
            System.out.println("La esfera diferente es la A" );
            
        }        
    }
}