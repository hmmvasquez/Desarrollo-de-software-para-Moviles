//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    float notas[] = {0,0,0,0,0,0,0,0,0,0}; 
    int contador=0;
    for (int i = 1; i < 11; i++) {
    for (int j=0; j<notas.length; j++) {
       System.out.println("Ingrese nota "+i+":");
       i++;
       notas[j] = myObj.nextInt();
    }
    }
    for (int i=0; i<notas.length; i++) {
      if(notas[i]>=7) {
        contador++;
      }
    }
    System.out.println("La cantidad de notas mayores o iguales a 7 es: "+contador);
  }
}