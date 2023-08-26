package ejercicio.pkg10;
import java.util.Scanner;
/**
 *Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2 ́000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el numero de la inscripcion: ");
        String numero_inscripcion = tec.next();
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = tec.nextLine();
        nombre = tec.nextLine();
        System.out.println("Ingrese el patrimonio del estudiante: ");
        int patrimonio = tec.nextInt();
        System.out.println("Ingrese el estrato del estudiante: ");
        byte estrato = tec.nextByte();
        
        double matricula = 50000;
        if((patrimonio > 2000000) && (estrato > 3)){
        matricula = matricula + (patrimonio * 0.03);}
        
        System.out.print("El estudiante con numero de inscripcion " + numero_inscripcion);
        System.out.println(" y nombre " + nombre + " debe pagar $" + matricula);
    }
    
}
