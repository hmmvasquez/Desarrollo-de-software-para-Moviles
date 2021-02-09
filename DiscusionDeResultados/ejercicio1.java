//Crear un programa en consola que me permita saber si dos números son divisibles entre sí, para saber si un número es divisible por otro se tiene que obtener el modulo y si este es cero entonces este número es divisible por el otro.

import java.util.* ;

public class Main {
  static void modulo(int num1, int num2) {
    int resultado = num1 % num2;
    if (resultado==0) {
      System.out.println("Los numeros son divisibles entre si");
    }
    else {
      System.out.println("Los numeros no son divisibles entre si");
    }
  }

  public static void main(String[] args) {
    int num1, num2;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Ingrese un numero:");
    num1 = myObj.nextInt(); 
    System.out.println("Ingrese un numero:");
    num2 = myObj.nextInt(); 
    modulo(num1, num2);
  }
}
