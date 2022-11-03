// OpenBootcamp / Curso de Introducción a la programación.
// Autor: JavierMDQ

// ENCAPSULACIÓN
// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


public class Tema_8 {

    public static void main(String[] args) {

        Persona xPersona = new Persona();

        xPersona.setNombre("Javier");
        xPersona.setEdad(42);
        xPersona.setTelefono(1234567890);

        System.out.println("La persona se llama " + xPersona.getNombre() + ", tiene " + xPersona.getEdad() + " años, y su teléfono es " + xPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;
  
    public int getEdad() {
        return edad;
    }
  
    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    public String getNombre() {
        return nombre;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public int getTelefono() {
        return telefono;
    }
  
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  
  }
  
  

