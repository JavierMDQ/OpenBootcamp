// OpenBootcamp / Curso de Introducción a la programación.
// Autor: JavierMDQ

// Enunciado del ejercicio:
// - Crear una función con tres parámetros que sean números que se suman entre sí.
// - Llamar a la función en el main y darle valores.

public class Tema_3_1 {

  public static void main(String[] args) {
      int resultado = 0;
      resultado = sumar(15, 20, 25);
      System.out.println(resultado);
  }

  public static int sumar(int a, int b, int c) {
      return a + b + c;
  }
}