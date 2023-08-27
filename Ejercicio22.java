package ejercicio.pkg18;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
 * número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
 * de $450.000, de lo contrario escriba sólo el nombre.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String nombre;
        int salario_basico, horas_mes, salario;

        Scanner input = new Scanner(System.in);
        NumberFormat pesos = NumberFormat.getCurrencyInstance();

        System.out.print("Inserte el nombre del empleado: ");
        nombre = input.nextLine();

        System.out.print("Salario básico por hora: ");
        salario_basico = input.nextInt();

        System.out.print("Horas trabajadas en el mes: ");
        horas_mes = input.nextInt();

        salario = salario_basico * horas_mes;

        System.out.println("Empleado: " + nombre);
        if (salario > 450000){
            System.out.println("Salario: " + pesos.format(salario));
        }


    }
}
