/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_practicos_ortizzully;

/**
 *
 * @author const
 */
import java.util.Scanner;
public class Ejercicios_Practicos_OrtizZully {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /* EJERCICIO 1 Clasificación de edades
        Escribe un programa que solicite la edad de una persona e indique si es un:
        Niño (0-12 años)
        Adolescente (13-17 años)
        Adulto (18-59 años)
        Adulto mayor (60+ años)

        */
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Por favor ingrese su edad: ");
        edad = teclado.nextInt();
        
        
        if (edad >= 0 && edad <= 12){
            System.out.println("Eres un niño.");
        } else if ( edad >= 13 && edad <= 17){
            System.out.println("Eres un adolescente.");
        }else if ( edad >= 18 && edad <= 59){
            System.out.println("Eres un adulto.");
        } else if( edad >= 60){
            System.out.println("Eres un adulto mayor.");}
        
        /* EJERCICIO 2 Calculadora simple
        Implementa una calculadora que reciba dos números y una operación ( + , - , * , / ) e imprima el
        resultado.

        */
        int num1, num2,suma, resta, multiplicacion, division;
        char signo;
        
        System.out.println("Ingrese el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("Que operacion deseas realizar +, -, *, /");
        signo = teclado.next().charAt(0);
        
        System.out.println("Ingrese el segundo numero");
        num2 = teclado.nextInt();
        
        
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        switch(signo){
            case '+' -> System.out.println("El resultado de la suma es: " + suma);
            case '-' -> System.out.println("El resultado de la resta es: " + resta);
            case '*' -> System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
            case '/' -> System.out.println("El resultado de la division es: " + division);
             
        }
        
        
        /* EJERCICIO 3 Simulador simple
        Crea un programa que reciba una calificación (0-100) y determine:
        A si la nota está entre 90-100.
        B si la nota está entre 80-89.
        C si la nota está entre 70-79.
        D si la nota está entre 60-69.
        F si la nota está por debajo de 60

        */
        int calificacion;
        
        System.out.println("Ingrese la calificacion que obtuviste (0-100)");
        calificacion = teclado.nextInt();
        
        if (calificacion >= 90 && calificacion <= 100){
            System.out.println("A.");
        } else if ( calificacion >= 80 && calificacion <= 89){
            System.out.println("B.");
        }else if ( calificacion >= 70 && calificacion <= 79){
            System.out.println("C.");
        } else if( calificacion >= 60 && calificacion <= 69){
            System.out.println("D.");
        } else if (calificacion <= 60){
            System.out.println("F.");
        }
        
        /* EJERCICIO 4 Clasificación de triángulos

        Escribe un programa que solicite las longitudes de los tres lados de un triángulo e indique si el
        triángulo es:
        Equilátero (todos los lados iguales)
        Isósceles (dos lados iguales)
        Escaleno (todos los lados diferentes)

        */
        double lado1, lado2, lado3;
        
        System.out.println("Ingrese la longitud del lado uno: ");
        lado1 = teclado.nextDouble();
        
        System.out.println("Ingrese la longitud del lado dos: ");
        lado2 = teclado.nextDouble();
        
        System.out.println("Ingrese la longitud del lado tres: ");
        lado3 = teclado.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("El tri�ngulo es equilatero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("El triangulo es Is�sceles.");
        } else {
            System.out.println("El triangulo es Escaleno. ");
        }
        
        /* Ejercicio 5: Calculadora de descuentos
        Escribe un programa que reciba el precio de un producto y el tipo de cliente (A, B o C). Aplica un
        descuento seg�n el tipo:
        A: 30%
        B: 20%
        C: 10% Muestra el precio final despu�s del descuento.
        */
        
        
        
        
    }
    
}
