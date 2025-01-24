/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_practicos3_ortizzully;

/**
 *
 * @author const
 */
import java.util.Scanner;
public class Ejercicios_Practicos3_OrtizZully {

    public static void main(String[] args) {
       /* Ejercicio 16: Clasificación de números según divisibilidad
        Crea un programa que solicite un número entero y determine:
        Si es divisible por 2 y por 3.
        Si es divisible solo por 2.
        Si es divisible solo por 3.
        Si no es divisible por ninguno de los dos.
        */ 
       Scanner teclado = new Scanner(System.in);
       
       int numero;
       
       System.out.println("Ingrese un numero entero: ");
       numero = teclado.nextInt();
       
       if (numero % 2 == 0 && numero % 3 == 0){
           System.out.println("El numero es divisible por 2 y por 3.");
       }else if (numero % 2 == 0){
           System.out.println("El numero es divisible solo por 2.");
       }else if (numero % 3 == 0){
           System.out.println("El numero es divisible solo por 3.");
       }else{
           System.out.println("El numero no es divisible ni por 2 ni por 3.");
       }
       
       /*Ejercicio 17: Clasificación por niveles de velocidad
        Escribe un programa que solicite la velocidad de un vehículo (en km/h) y clasifique:
        0-20 km/h : Muy lento
        21-60 km/h : Moderado
        61-120 km/h : Rápido
        Más de 120 km/h : Muy rápido
        */
       int velocidad;
        
        System.out.println("Ingrese la velocidad del vehiculo: ");
        velocidad = teclado.nextInt();
        
        if (velocidad >=0 && velocidad <=20){
            System.out.println("Muy lento.");
        } else if (velocidad >=21 && velocidad <=60){
            System.out.println("Moderado.");
        }else if (velocidad >=61 && velocidad <=120){
            System.out.println("Rapido.");
        }else if (velocidad >=120){
            System.out.println("Muy rapido.");
        }
        
        /*Ejercicio 18: Determinación de rango etario
            Crea un programa que solicite la edad de una persona y determine:
            Si es un bebé (0-2 años).
            Si es un niño (3-12 años).
            Si es un adolescente (13-17 años).
            Si es un adulto (18-64 años).
            Si es un adulto mayor (65 años o más).
        */
        
        int edad; 
        
        System.out.println("Ingrese la edad de la persona: ");
        edad = teclado.nextInt();
        
        if (edad >= 0 && edad <= 2){
            System.out.println("Eres un bebe.");
        } else if ( edad >= 3 && edad <= 12){
            System.out.println("Eres un niño.");
        }else if ( edad >= 13 && edad <= 17){
            System.out.println("Eres un adolescente.");
        } else if( edad >= 18 && edad <= 64 ){
            System.out.println("Eres un adulto.");
        }else if( edad >= 65 ){
            System.out.println("Eres un adulto mayor.");
        }
        
        /* Ejercicio 19: Simulador de alarma de peligro
        Crea un programa que solicite la cantidad de sensores activados y el nivel de alerta:
        1-2 sensores : Alerta baja.
        3-5 sensores : Alerta media.
        6 o más sensores : Alerta alta.
        */
        
        int CantSensor;
        
        System.out.println("Ingrese la cantidad de sensores: ");
        CantSensor = teclado.nextInt();
        
        if (CantSensor >=1 && CantSensor <=2){
            System.out.println("Alerta baja.");
        } else if (CantSensor >=3 && CantSensor <=5){
            System.out.println("Alerta media.");
        }else if (CantSensor >=6){
            System.out.println("Alerta alta.");
        }
        
        /* Ejercicio 20: Identificación del trimestre
        Crea un programa que reciba el número de un mes (1-12) y determine a qué trimestre del año
        pertenece:
        1-3 : Primer trimestre.
        4-6 : Segundo trimestre.
        7-9 : Tercer trimestre.
        10-12 : Cuarto trimestre*/
        
        int mes;
        
        System.out.println("Ingrese el numero de un mes (1-12)");
        mes = teclado.nextInt();
        
        if (mes >=1 && mes <=3){
            System.out.println("Primer trimestre.");
        } else if (mes >=4 && mes <=6){
            System.out.println("Segundo trimestre.");
        }else if (mes >=7 && mes <=9){
            System.out.println("Tercer trimestre.");
        }else if (mes >=10 && mes <=12){
            System.out.println("Cuarto trimestre.");
        }
        
        /*Ejercicio 21: Clasificación de figuras geométricas
            Crea un programa que reciba el número de lados de una figura geométrica y clasifique:
            3 lados : Triángulo.
            4 lados : Cuadrado o rectángulo.
            5 lados : Pentágono.
            6 lados : Hexágono.
            Otros: Figura no soportada.
            */
        
        int lados; 
        
        System.out.println("Ingrese el numero de lados de la figura geometrica");
        lados = teclado.nextInt();
        
        switch (lados){
            case 3 -> System.out.println("Ka figura es un triangulo.");
            case 4 -> System.out.println("La figura es un cuadrado o rectangulo");
            case 5 -> System.out.println("La figura es un pentagono.");
            case 6 -> System.out.println("La figura es un hexagono.");
            default -> System.out.println("Figura no soportada.");
        }
        
        /*Ejercicio 22: Evaluación de signos del zodiaco
        Crea un programa que reciba un mes (1-12) y un día (1-31) y determine el signo zodiacal de la
        persona.*/
        int mess, dia;
        
        System.out.println("Ingrese el mes (1/12): ");
        mess = teclado.nextInt();
        
        System.out.println("Ingrese el dia (1-31): ");
        dia = teclado.nextInt();
        
        if ((mess == 3 && dia >= 21) || (mess == 4 && dia <=19)){
            System.out.println("El signo zodiacal es Aries");
        }else if ((mess == 4 && dia >= 20) || (mess == 5 && dia <=20)){
            System.out.println("El signo zodiacal es Tauro");
        }else if ((mess == 5 && dia >= 21) || (mess == 6 && dia <=22)){
            System.out.println("El signo zodiacal es Geminis");
        }else if ((mess == 6 && dia >= 21) || (mess == 7 && dia <= 22)) {
            System.out.println("El signo zodiacal es Cancer");
        } else if ((mess == 7 && dia >= 23) || (mess == 8 && dia <= 22)) {
            System.out.println("El signo zodiacal es Leo");
        } else if ((mess == 8 && dia >= 23) || (mess == 9 && dia <= 22)) {
            System.out.println("El signo zodiacal es Virgo");
        } else if ((mess == 9 && dia >= 23) || (mess == 10 && dia <= 22)) {
            System.out.println("El signo zodiacal es Libra");
        } else if ((mess == 10 && dia >= 23) || (mess == 11 && dia <= 21)) {
            System.out.println("El signo zodiacal es Escorpio");
        } else if ((mess == 11 && dia >= 22) || (mess == 12 && dia <= 21)) {
            System.out.println("El signo zodiacal es Sagitario");
        } else if ((mess == 12 && dia >= 22) || (mess == 1 && dia <= 19)) {
            System.out.println("El signo zodiacal es Capricornio");
        } else if ((mess == 1 && dia >= 20) || (mess == 2 && dia <= 18)) {
            System.out.println("El signo zodiacal es Acuario");
        } else if ((mess == 2 && dia >= 19) || (mess == 3 && dia <= 20)) {
            System.out.println("El signo zodiacal es Piscis");
        } else {
            System.out.println("Fecha invalida");
        }
        /*Ejercicio 23: Conversor de edades caninas
        Escribe un programa que convierta la edad de un perro a años humanos:
        Los dos primeros años del perro equivalen a 10.5 años humanos cada uno.
        Cada año adicional equivale a 4 años humanos.*/
        
        int edadPerro;
        int edadHumana;
        
        System.out.println("Ingrese la edad del perro: ");
        edadPerro = teclado.nextInt();
        
        System.out.println("Ingrese la edad del humano: ");
        edadHumana = teclado.nextInt();

        if (edadPerro <=2) {
            edadHumana = (int) (edadPerro * 10.5);
        } else {
            edadHumana = (int) (2 * 10.5 + (edadPerro - 2) * 4);
        }
        System.out.println("La edad del perro en años humanos es: " + edadHumana);
        /*Ejercicio 24: Clasificación por índice de contaminación
            Crea un programa que reciba el índice de calidad del aire (ICA) y determine la categoría
            correspondiente:
            0-50: Bueno
            51-100: Moderado
            101-150: No saludable para grupos sensibles
            151-200: No saludable
            201-300: Muy no saludable
            301+: Peligroso */
        
        int aire;
        
        System.out.println("Ingresa el indice de la calidad del aire: ");
        aire = teclado.nextInt();
        
        if (aire <= 0 && aire >=50){
            System.out.println("Bueno");
        }else if (aire <= 51 && aire >=100){
            System.out.println("Moderado");
        }else if (aire <= 101 && aire >=150){
            System.out.println("No saludable para grupos sensibles.");
        }else if (aire <= 151 && aire >=200){
            System.out.println("No saludable");
        }else if (aire <= 200 && aire >=300){
            System.out.println("Muy no saludable");
        }else if (aire <= 301){
            System.out.println("Peligroso");
        }
    }
    
}
