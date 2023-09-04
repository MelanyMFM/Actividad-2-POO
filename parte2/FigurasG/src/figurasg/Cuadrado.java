/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package figurasg;

/**
 *
 * @author santi
 */
public class Cuadrado {

    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerímetro() {
        return (4 * lado);
    }
}
