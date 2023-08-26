package ejercicio.pkg18;
/**
 *Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente.
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese codigo del empleado: ");
        int codigo_empleado = tec.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = tec.next();
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        int horas_trabajadas = tec.nextInt();
        System.out.println("Ingrese el valor de hora trabajada: ");
        int valor_hora = tec.nextInt();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        float porcentaje_retencion = tec.nextFloat();
        
        int salario_bruto = horas_trabajadas * valor_hora;
        float retencion = salario_bruto * (porcentaje_retencion / 100);
        float salario_neto = salario_bruto - retencion;
        
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Codigo del empleado: " + codigo_empleado);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
    
}
