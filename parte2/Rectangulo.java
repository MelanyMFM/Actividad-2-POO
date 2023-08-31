package ejercicio.pkg18.parte2;

public class Rectangulo {
  int base, altura;
  
Rectangulo(int base, int altura) {
  this.base = base;
  this.altura = altura;
  }
  
  double calcularArea() {
    return base * altura
  }
  double calcularPerimetro() {
    return (base * 2) + (altura * 2)
  }
}
