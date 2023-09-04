/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasg;

/**
 *
 * @author santi
 */
public class TrianguloRectangulo {
    private double base, altura,hipotenusa;
    public TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
    }

    public double calcularArea(){
        return(base*altura/2);
    }

    public double calcularHipotenusa(){
        return hipotenusa;
    }
    public double calcularPerimetro(){
        return(base+altura+hipotenusa);
    }

    public void determinarTipoTriangulo(){
        if (base != altura && altura != hipotenusa){
            System.out.println("Es un triángulo escaleno");
        }
        else {
            System.out.println("Es un triángulo isosceles");
        }

        /* omito Equilatero porque un triangulo-rectangulo nunca es equilatero */
}
}

