/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 Escribe un programa en Java que pida al usuario que introduzca dos numeros y realice 
 * las cinco operaciones aritmeticas basiccas (Suma, Resta, Multiplicacion, Division y modulo),
 * mostrando el resultado de cada una
 */

import java.util.Scanner; // Es una clase en Java que se utiliza para obtener la entrada del usuario desde la consola.

public class OperadoresAritmeticos {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multiplicacion = numero1 * numero2;
    int division = numero1 / numero2;
    int modulo = numero1 % numero2;
    
    System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        
        

   }
}



