package ejercicio.pkg18;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String Nombre;
        int Horas_trabajadas, Valor_hora, Horas_extras, Horas_extras_8, Salario;

        Scanner input = new Scanner(System.in);
        NumberFormat pesos = NumberFormat.getCurrencyInstance();

        System.out.print("Nombre del trabajador: ");
        Nombre = input.nextLine();

        System.out.print("Numero de horas trabajadas: ");
        Horas_trabajadas = input.nextInt();

        System.out.print("Valor hora trabajada: ");
        Valor_hora = input.nextInt();

        if(Horas_trabajadas > 40){
            Horas_extras = Horas_trabajadas - 40;
            if(Horas_extras > 8){
                Horas_extras_8 = Horas_extras - 8;
                Salario = 40 * Valor_hora + 16 * Valor_hora + Horas_extras_8 * 3 * Valor_hora;
            } else {
                Salario = 40 * Valor_hora + Horas_extras * 2 * Valor_hora;
            }
        } else {
            Salario = Horas_trabajadas * Valor_hora;
        }

        System.out.println("El trabajador " + Nombre + " devengó " + pesos.format(Salario));
    }
}
