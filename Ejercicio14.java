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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int vd1 = 0, vd2 = 0, vd3 = 0, ventasT = 0;
       float salariobase = 0, salario1=0, salario2=0, salario3 = 0, porcentajeV = 0;
       double prom1 = 0, prom2 = 0, prom3 = 0;

        Scanner in = new Scanner(System.in);
        vd1 = in.nextInt();
        Scanner en = new Scanner(System.in);
        vd2 = en.nextInt();
        Scanner ins = new Scanner(System.in);
        vd3 = ins.nextInt();
        Scanner inse = new Scanner(System.in);
        salariobase = inse.nextInt();    
        
        ventasT = vd1 + vd2 + vd2;
        porcentajeV = (float) (ventasT * 0.33);
       
       
        if (vd1 > porcentajeV) {
            salario1 = (float) (salariobase*1.20);
            System.out.println("El salario de los empleados del departamento 1 es " + salario1+"$");
           
            
        }else{
            System.out.println("El salario de los empleados del departamento 1 es " + salariobase +"$");
        }
            
            
        if (vd2 > porcentajeV) {
            salario2 = (float) (salariobase*1.20);
            System.out.println("El salario de los empleados del departamento 2 es " + salario2+"$");
        }else{
            System.out.println("El salario de los empleados del departamento 2 es " + salariobase+"$");
        }
            
        if (vd3 > porcentajeV) {
            salario3 = (float) (salariobase*1.20);
            System.out.println("El salario de los empleados del departamento 3 es " + salario3+"$");            
        }else{
            System.out.println("El salario de los empleados del departamento 3 es " + salariobase+"$");
        }
       
    }
}
