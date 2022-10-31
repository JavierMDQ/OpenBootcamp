// OpenBootcamp / Curso de Introducción a la programación.
// Autor: JavierMDQ

// Enunciado del ejercicio:
// - Crear una clase coche.
// - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// - Una función que incremente el número de puertas que tiene el coche.
// - Crear un objeto miCoche en el main y añadirle una puerta.
// - Mostrar el número de puertas que tiene el objeto.

public class Tema_3_2 {
  public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.agregarPuerta();
    System.out.println("El coche tiene " + miCoche.numPuertas + " puertas.");
      
  }

  static class Coche {
    int numPuertas = 2;

    public void agregarPuerta() {
      this.numPuertas++;
    } 
  }
}
