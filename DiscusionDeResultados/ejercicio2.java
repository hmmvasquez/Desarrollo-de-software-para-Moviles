//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    float[] notas; 
    for (int i = 1; i < 11; i++) {
    System.out.println("Ingrese nota "+i+":");
    for (int j=0; j<10; j++) {
       notas[j] = myObj.nextInt();
       System.out.println(notas[j]);
    }
}
  }
}