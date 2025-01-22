/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transpilacionjava;

/**
 *
 * @author const
 */
import java.util.Scanner;
public class TranspilacionJava {


    public static void main(String[] args) {
        /* EJERCICIO 1
        
        Calcular el numero de pulsaciones que una persona debe tener por cada 10 
        segundos de ejercicio, si la formula es : Num. pulsaciones = (200 -edad)/10
        
        */
         
        String opciones;
        int edad;
        int pulsaciones;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique su edad: ");
        edad = teclado.nextInt();
        System.out.println("Indique si su sexo es masculino o femenino (M O F)");
        teclado = new Scanner (System.in);
        opciones = teclado.next();
        
        if (!"M".equals(opciones)&& !"m".equals(opciones)) {
            pulsaciones = (220 - edad ) / 10;
        } else {
            pulsaciones = (210 - edad) / 10;
        }
        System.out.println("El numero de pulsaciones que usted tiene es de: " + pulsaciones);
         
        /* EJERCICIO 2
        Tres personas deciden invertir su dinero para fundar una empresa. Cada una de ellas 
        invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte con 
        respecto a la cantidad total invertida
        */
        
        double p1,p2,p3;
        double inv1, inv2, inv3;
        double invtotal;
        
        System.out.println("Ingrese las cantidades a invertir cada uno: ");
        
        inv1 = teclado.nextDouble();
        inv2 = teclado.nextDouble();
        inv3 = teclado.nextDouble();
        
        invtotal = inv1 + inv2 + inv3;
        p1 = inv1 * 100 / invtotal;
        p2 = inv2 * 100 / invtotal;
        p3 = inv3 * 100 / invtotal;
        
        System.out.println("El porcentaje que invierte la 1ra persona es de %2.f: " + p1 );
        System.out.println("El porcentaje que invierte la 2da persona es de %2.f: " + p2 );
        System.out.println("El porcentaje que invierte la 3ra persona es de %2.f: " + p3 );
        
        
        /* EJERCICIO 3
        
        Un banco da sus ahorradores un interes de 1.5% sobre el monto ahorrado mesual.
        Teniendo como dato de entrada el saldo inicial del ahorrador y el numero de 
        meses, determine el saldo final.
        
        */
        
        double saldoinicial;
        int numbermounths;
        double monto;
        double saldofinal;
        
        System.out.println("Ingrese el saldo inicial del ahorrador: ");
        
        saldoinicial = teclado.nextDouble();
        
        System.out.println(" Ingrese el numero de meses: ");
        
        numbermounths = teclado.nextInt();
        
        monto = (0.015 * saldoinicial * numbermounths);
        
        saldofinal = saldoinicial + monto;
        
        System.out.println("El saldo final equivale a: " + saldofinal);
        
        /* EJERCICO 4
        
        Una empresa le hace los siguientes descuentos sobre el sueldo base a sus
        trabajadores: 1% por ley de política pública, 4% por seguro social, 0.5% por
        seguro forzoso y 5% por caja de ahorro. Realice un Algoritmo que determine el
        monto de cada descuento y el monto total a pagar al trabajador.
        
        */
        
        double basesueldo;
        double leypolitica;
        double segsocial;
        double segforzoso;
        double box_ahorro;
        double amount_total;
        
        System.out.println("Ingrese el sueldo base de sus trabajadores: ");
        basesueldo = teclado.nextDouble();
        
        leypolitica = basesueldo * 0.01;
        segsocial = basesueldo * 0.04;
        segforzoso = basesueldo * 0.005;
        box_ahorro = basesueldo * 0.05;
        amount_total = basesueldo - leypolitica - segsocial - segforzoso - box_ahorro;
        
        System.out.println("El monto a descontar en caja de ahorro es: " + box_ahorro);
        System.out.println("El monto a descontar en la ley de politica es: " + leypolitica);
        System.out.println("El monto a descontar del seguro forzoso es de: " + segforzoso);
        System.out.println("Valor de seguro social: " + segsocial);
        System.out.println("El monto a pagar a los trabajadores es de : " + amount_total);
        
        /* EJERCICIO 5
        
        El periódico el Informador cobra por un aviso clasificado un monto que depende
        del número de palabras, tamaño en centímetros y número de colores. Cada
        palabra tiene un costo de $20.000, cada centímetro tiene un costo de
        $15.000 y cada color tiene un costo de $25.000. Realice un algoritmo
        que determine el monto a pagar por un aviso clasificado.

        */
        
        int P, C, R, PS, CMS, CRS, precio;
        
        System.out.println("Escriba cuantas palabras hay en total: ");
        
        P = teclado.nextInt();
        
        System.out.println("Escriba cuantos cm hay en total: ");
        
        C = teclado.nextInt();
        
        System.out.println("Escriba cuantos colores se han usado en total: ");
        
        R = teclado.nextInt();
        
        PS = ( P * 20000);
        CMS = ( C * 15000);
        CRS = ( R * 25000);
        precio = (PS + CMS + CRS);
        
        System.out.println(" El precio total es de " + precio );
        
        
        /* EJERCICIO 6 
        
        Una empresa paga a sus empleados un bono por antigüedad que consiste
        en $100.000 por el primer año laboral y $120.000 por cada año siguiente.
        Realice un algoritmo que determine el monto del bono a pagar a un trabajador que
        tiene varios años en la empresa.

        */
        
        int years, bn1, bnfinal = 0;
        
        System.out.println("Ingrese la cantidad: ");
        
        years = teclado.nextInt();
        
        if (years >= 1){
            bn1 = 100000;
            bnfinal = ( (1)* 120000) + bn1;
        } System.out.println ("El bono a pagar es de: " + bnfinal);
    }
}
