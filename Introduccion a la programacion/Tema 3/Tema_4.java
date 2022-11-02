public class Tema_4 {  
  public static void main(String[] args) {
    int numeroIf = 4;

    if (numeroIf < 0) {
      System.out.println("El número " + numeroIf + " es negativo.");
    } else if (numeroIf > 0) {
      System.out.println("El número " + numeroIf + " es positivo.");
    } else {
      System.out.println("El número es 0.");
    }

    int numeroWhile = -1;
    while (numeroWhile < 3){
      numeroWhile++;
      System.out.println("numeroWhile vale: " + numeroWhile);
    }

    do {
      System.out.println("Esto se ejecuta una sola vez");
    } while (numeroWhile > 100);

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println("numeroFor vale: " + numeroFor);
    }

    String estacion = "verano";
    switch (estacion) {
      case "primavera":
        System.out.println("La estación es primavera.");
        break;
      case "verano":
        System.out.println("La estación es verano.");
        break;
      case "otoño":
        System.out.println("La estación es otoño.");
        break;
      case "invierno":
        System.out.println("La estación es invierno.");
        break;
      default:
        System.out.println("No es una estación.");      
    }

  }
}