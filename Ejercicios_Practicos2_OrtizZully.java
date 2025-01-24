/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_practicos2_ortizzully;

/**
 *
 * @author const
 */
import java.util.Scanner;

public class Ejercicios_Practicos2_OrtizZully {

    public static void main(String[] args) {
        
        /* Ejercicio 5: Calculadora de descuentos
        Escribe un programa que reciba el precio de un producto y el tipo de cliente 
        (A, B o C). Aplica un descuento según el tipo:
        A: 30%
        B: 20%
        C: 10% Muestra el precio final después del descuento.
        */
        
        Scanner teclado = new Scanner(System.in);
        
        double precio, A, B, C, totalA, totalB, totalC;
        char tipo;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
        
        System.out.println("Ingrese el tipo de cliente (A/B/C): ");
        tipo = teclado.next().charAt(0);
        
        A = precio * 0.30;
        B = precio * 0.20;
        C = precio * 0.10;
        
        switch(tipo){
            case 'A' -> {
                totalA = precio - A;
                System.out.println("El precio final con descuento es: .2f%" + totalA);
            }
            case 'B' -> {
                totalB = precio - B;
                System.out.println("El precio final con descuento es: .2f%" + totalB);
            }
            case 'C' -> {
                totalC = precio - C;
                System.out.println("El precio final con descuento es: .2f%" + totalC);
            }
        }
        
        /* Ejercicio 6: Calculadora de tarifas de estacionamiento
            Crea un programa que calcule la tarifa de un estacionamiento basado en el número de horas:
            1 hora o menos: $5
            2-3 horas: $10
            4 o más horas: $15  
        */
        
        int horas, tarifa = 0;
        
        System.out.println("Ingrese el numero de horas estacionado: ");
        horas = teclado.nextInt();
        
        if (horas >= 0 && horas <=1){
            tarifa = 5;
        } else if (horas >= 2 && horas <=3){
            tarifa = 10;
        }else if (horas >= 4){
            tarifa = 15;
        }
        
        System.out.println("La tarifa del estacionamiento es de: $ " + tarifa);
        
        /* Ejercicio 7: Conversor de temperatura
             Escribe un programa que solicite una temperatura y la unidad de origen (Celsius o Fahrenheit).
            Convierte la temperatura a la unidad opuesta y muestra el resultado.
            Fórmulas:
            De Celsius a Fahrenheit: (C * 9/5) + 32
            De Fahrenheit a Celsius: (F - 32) * 5/9*/ 
        
        int temperatura, resultado = 0;
        char origen;
        
        System.out.println("Ingrese la temperatura: ");
        temperatura = teclado.nextInt();
        
        System.out.println("Ingrese la unidad de origen: (C/F)");
        origen = teclado.next().charAt(0);
        
        if (origen == 'C'){
            resultado = (temperatura * 9/5) + 32;
        } else if (origen == 'F'){
            resultado = (temperatura - 32) * 5/9;
        }
        
        System.out.println("El resultado es: " + resultado);
        
        /* Ejercicio 8: Cálculo de números pares e impares
            Solicita al usuario un número entero y muestra si es par o impar utilizando if-else .
        */
        
        int numero;
        
        System.out.println("Ingrese un numero entero: ");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar.");
        }
        
        /*Ejercicio 9: Determinador de estación del año
        Crea un programa que reciba un número de mes (1-12) y determine a qué estación pertenece:
        Primavera: marzo (3) a mayo (5)
        Verano: junio (6) a agosto (8)
        Otoño: septiembre (9) a noviembre (11)
        Invierno: diciembre (12) a febrero (2) 
        */
        
        int NumMes;
        
        System.out.println("Ingrese un numero del mes (1-12)");
        NumMes = teclado.nextInt();
        
        if (NumMes >=3 && NumMes <=5){
            System.out.println("Primavera");
        } else if (NumMes >=6 && NumMes <=8){
            System.out.println("Verano");
        }else if (NumMes >=9 && NumMes <=11){
            System.out.println("Otoño");
        }else if (NumMes >=12 && NumMes <=2){
            System.out.println("Invierno");
        }
        
        /* Ejercicio 10: Sistema de recomendaciones de comida
        Escribe un programa que recomiende una comida según el clima ( soleado , lluvioso , frío ) y la
        hora del día ( mañana , tarde , noche ). Usa match para manejar el clima y if para la hora.
        */
        
        String clima, hora, comida="";
        
        System.out.println("Ingrese el clima(soleado, lluvioso, frio): ");
        clima = teclado.nextLine().toLowerCase();
        
        System.out.println("Ingrese la hora del dia (manana,tarde,noche): ");
        hora = teclado.nextLine().toLowerCase();
        
        switch(clima){
            case "soleado" -> {
                comida = "pollo frito con coca-cola";
                break;
            }
            case "lluvioso" -> {
                comida = "Chocolate caliente";
                break;
            }
            case "frio" -> {
                comida = "Cafe con pan";
                break;
            }
        }
        
        if(hora.equals("mañana")){
            comida = "desayuno" + comida;
        }else if (hora.equals("tarde")){
            comida = "Almuerzo" + comida;
        }else if (hora.equals("noche")){
            comida = "Comida" + comida;
        }
        System.out.print("Recomendacion: " + comida);
        
        /* Ejercicio 11: Conversor de unidades
        Escribe un programa que convierta entre las siguientes unidades:
        Kilómetros a millas
        Celsius a Fahrenheit
        Kilogramos a libras
        Utiliza match para elegir la conversión y if para verificar valores negativos.
        */
        
        int opcion;
        double km, c, kg, millas, fahrenheit, libras;
        
        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Kilogramos a Libras");
        
        opcion = teclado.nextInt();
        
        switch (opcion){
            case 1 -> { 
                System.out.println("Ingrese los kilometros: ");
                km = teclado.nextDouble();
                
                if (km < 0 ){
                    System.out.println("El valor no puede ser negativo.");
                }else {
                    millas = km * 0.6214;
                    System.out.println(km + " kilometros son " + millas + " millas.");
                }
            }
            case 2 -> {
                System.out.println("Ingrese los grados celcius");
                c = teclado.nextDouble();
                
                if (c < 0 ){
                    System.out.println("El valor no puede ser negativo.");
                }else {
                    fahrenheit = (c * 9/5) + 32;
                    System.out.println(c + " grados celcius son " + fahrenheit + " fahrenheit.");
                }
            }
                
            case 3 -> {
                System.out.println("Ingrese los kilogramos");
                kg = teclado.nextDouble();
                
                if (kg < 0 ){
                    System.out.println("El valor no puede ser negativo.");
                }else {
                    libras = kg * 2.2046 ;
                    System.out.println(kg + " Kilogramos " + libras + " Libras.");
                }
            }
        }
        
        /* Ejercicio 12: Clasificación de años
            Crea un programa que determine si un año es:
            Bisiesto (divisible entre 4 pero no entre 100, excepto si también es divisible entre 400).
            Común.
        */
        
        int anio;
        
        System.out.println("Ingrese un año: ");
        anio = teclado.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 )){
            System.out.println("Este año " + anio + " es un año biciesto.");
        } else {
            System.out.println("El anio " + anio + " es un año comun.");
        }
        
        /*Ejercicio 13: Conversor de monedas
        Crea un programa que convierta un monto en dólares a otra moneda. Usa las siguientes tasas de
        cambio:
        Euros: 0.85
        Pesos Colombianos: 4100
        Yenes: 110
        Utiliza match para manejar las conversiones.
        */
        
        double dolar, euros, pesos, yenes;
        int  opcMoneda;
        
        System.out.println("Ingrese el monto ene dolares");
        dolar = teclado.nextDouble();
        
        System.out.println("Ingrese la moneda que desea convertir:");
        System.out.println("1. Euros");
        System.out.println("2. Pesos Colombianos");
        System.out.println("3. Yenes");
        
        opcMoneda = teclado.nextInt();
        
        switch (opcMoneda){
            case 1 -> { 
                euros = dolar * 0.85;
                System.out.println(dolar + " dolares son " + euros + " euros.");
                
            }
            case 2 -> {
                pesos = dolar * 4100;
                System.out.println(dolar + " dolares son " + pesos + " pesos Colombianos.");
            }
                
            case 3 -> {
                yenes = dolar * 110;
                System.out.println(dolar + " dolares son " + yenes + " Yenes.");
            }
        }
        
        /* Ejercicio 14: Calculador de IMC
        Crea un programa que calcule el Índice de Masa Corporal (IMC) y clasifique el resultado según las
        categorías:
        Menos de 18.5: Bajo peso
        18.5 a 24.9: Peso normal
        25 a 29.9: Sobrepeso
        30 o más: Obesidad*/
        
        double MasaCorporal;
        
        System.out.println("Ingrese su peso corporal");
        MasaCorporal = teclado.nextDouble();
        
        if (MasaCorporal <= 18.5){
            System.out.print("Bajo Peso");
        }else if(MasaCorporal >= 18.5 && MasaCorporal <= 24.9){
            System.out.print("Peso normal");
        }else if(MasaCorporal >= 25 && MasaCorporal <= 29.9){
            System.out.print("Sobrepeso");
        }else if(MasaCorporal >= 30){
            System.out.print("Obesidad");
        } 
        
        /*Ejercicio 15: Juego de piedra, papel o tijera
        Crea un programa que permita a dos jugadores ingresar sus elecciones ( piedra , papel o
        tijera ) y determine quién gana o si hay empate.*/
        
        String jugador1, jugador2 ;
        
        System.out.print("Por favor cada uno seleccione uno( piedra , papel o tijera ) ");
        System.out.print("Jugador uno:");
        jugador1 = teclado.nextLine();
        
        System.out.print("Jugador Dos:");
        jugador2 = teclado.nextLine();
        
        if (jugador1.equals(jugador2)){
            System.out.print("Empate");
        }
        switch (jugador1) {
            case "piedra" -> {
                if (jugador2.equals("tijera")) {
                    System.out.print("Jugador 1 gana con piedra.") ;
                } else {
                    System.out.print("Jugador 2 gana con papel.") ;
                }
            }
            case "papel" -> {
                if (jugador2.equals("piedra")) {
                    System.out.print("Jugador 1 gana con papel") ;
                } else {
                    System.out.print("Jugador 2 gana con tijera..") ;
                }
            }
            case "tijera" -> {
                if (jugador2.equals("papel")) {
                    System.out.print("Jugador 1 gana con tijera.") ;
                } else {
                    System.out.print("Jugador 2 gana con piedra.") ;
                }
            }
        }
    }
    
    
    
    
}
