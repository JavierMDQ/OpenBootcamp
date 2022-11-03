// OpenBootcamp / Curso de Introducción a la programación.
// Autor: JavierMDQ

// Crea una clase Persona con las siguientes variables:
// La edad
// El nombre
// El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.


public class Tema_9 {

    public static void main(String[] args) {

        Cliente xCliente = new Cliente();
        xCliente.setEdad(42);
        xCliente.setNombre("Javier");
        xCliente.setTelefono(123456789);
        xCliente.setCredito(2000);

        System.out.println("Cliente: " + xCliente.getNombre());
        System.out.println("Edad: " + xCliente.getEdad());
        System.out.println("Teléfono: " + xCliente.getTelefono());
        System.out.println("Crédito: " + xCliente.getCredito());

        System.out.println();


        Trabajador xTrabajador = new Trabajador();
        xTrabajador.setEdad(42);
        xTrabajador.setNombre("Javier");
        xTrabajador.setTelefono(123456789);
        xTrabajador.setSalario(40000);

        System.out.println("Trabajador: " + xTrabajador.getNombre());
        System.out.println("Edad: " + xTrabajador.getEdad());
        System.out.println("Teléfono: " + xTrabajador.getTelefono());
        System.out.println("Salario: " + xTrabajador.getSalario());       
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}