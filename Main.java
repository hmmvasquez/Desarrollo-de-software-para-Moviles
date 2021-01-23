//Suma y producto de dos numeros
/** import java.util.*;

class Main {

    public static void main(String[] ar) {

        Scanner teclado=new Scanner(System.in);
        int num1,num2,suma,producto;
 
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();

        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();

        suma=num1 + num2;

        producto=num1 * num2;

        System.out.print("La suma de los dos valores es:");
        System.out.println(suma);

        System.out.print("El producto de los dos valores es:");
        System.out.println(producto);
    }

} */

//Ingresar nombre y edades
/* import java.util.Scanner;

class Main {
    private Scanner teclado;
    private String[] nombres;
    private int[] edades;

    public void cargar() {
        teclado=new Scanner(System.in);

        nombres=new String[5];
        edades=new int[5];

        for(int f=0;f<nombre.leght;f++) {
            System.out.print("Ingrese nombre:");
            nombres[f]=teclado.next();

            System.out.print("Ingrese edad:");
            edades[f]=teclado.nextInt();
        }
    }

    public void mayoresEdad() {
        System.out.println("Personas mayores de edad.");
        for(int f=0;f<nombres.length;f++) {
            if (edades[f]>=18) {
                System.out.println(nombres[f]);
            }
        }
    }

    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.mayoresEdad();
    }
} */

//Ejercicio#1
// Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.
/*
import java.util.Scanner;

class Main {
    private Scanner teclado;
    private int num1;
    private int num2;

    public void cargar() {
        teclado=new Scanner(System.in);

            System.out.print("Ingrese primer valor:");
            num1=teclado.nextInt();

            System.out.print("Ingrese segundo valor:");
            num2=teclado.nextInt();
        }

    public void relacion() {
        if(num1>num2){
          System.out.println("El primer valor es mayor que el segundo");
          int suma = num1+num2;
          System.out.println("La suma de los valores es:");
          System.out.println(suma);
          int resta = num1-num2;
          System.out.println("La resta de los valores es:");
          System.out.println(resta);
        }
        else {
          System.out.println("El segundo valor es menor o igual que el primero");
          int producto = num1*num2;
          System.out.println("La producto de los valores es:");
          System.out.println(producto);
          int division = num1-num2;
          System.out.println("La division de los valores es:");
          System.out.println(division);
        }
    }


    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.relacion();
    }
}  */

//Ejercicio#2
//6- Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
//a) La cantidad de valores ingresados negativos.
//b) La cantidad de valores ingresados positivos.
//c) La cantidad de múltiplos de 15.
//d) El valor acumulado de los números ingresados que son pares.

import java.util.Scanner;

class Main {
    private Scanner teclado;
    private int[] valores;

    public void cargar() {
        teclado=new Scanner(System.in);
        valores=new int[10];

        for(int f=0;f<10;f++) {
            System.out.print("Ingrese Valor:");
            valores[f]=teclado.nextInt();
        }
    }

   public void conteo() {
     int contadorneg=0;
     int contadorpos=0;
     int contadormul=0;
     int modulo;

        for(int f=0;f<10;f++) {
            if (valores[f]>=0) {
              contadorpos++;
            }
            if (valores[f]<0) {
              contadorneg++;
            }
            modulo=valores[f]%5;
            if (modulo==0) {
              contadormul++;
            }
        }
        System.out.println(contadorpos);
        System.out.println(contadorneg);
        System.out.println(contadormul);
    }

    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.conteo();
    }
}