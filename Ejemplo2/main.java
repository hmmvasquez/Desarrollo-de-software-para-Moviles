//Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos

import java.util.Scanner;

public class EstructuraCondicionalSimple1 {
 public static void main(String[] ar) {
 Scanner teclado = new Scanner(System.in);
 float sueldo;
 System.out.print("Ingrese el sueldo:");
 sueldo = teclado.nextFloat();
 if (sueldo > 3000) {
 System.out.println("Esta persona debe abonar impuestos");
 }
 else {
   System.out.println("Esta persona no debe abonar impuestos.");
 }
 }
}