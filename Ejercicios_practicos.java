/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_practicos;

/**
 *
 * @author const
 */
public class Ejercicios_practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // precios originales 
        double camisa = 25.0;
        double pantalon = 30.0; 
        
        //  descuento 
        double descuento = 0.15;
        double descuentoDoble = 0.05;
        
        // Aplicar descuento a cada prenda 
        
        double DescuentoCamisa = camisa * (1 - descuento);
        double DescuentoPantalon = pantalon * ( 1 - descuento);
        
        // Aplicar descuento si realiza una segunda compra 
        
        double DescuentoCamisaDos = DescuentoCamisa * (1 - descuentoDoble);
        
        // Total 
        
        Double Total = DescuentoCamisa + DescuentoPantalon + DescuentoCamisaDos;
        
        System.out.printf("Precio de la camisa con descuento = $%.2f%n ", DescuentoCamisa);
        System.out.printf("Precio del pantalon con descuento = $%.2f%n", DescuentoPantalon);
        System.out.printf("Precio de la segunda camisa con descuento = $%.2f%n ", DescuentoCamisaDos);
        System.out.printf("Precio de la camisa con descuento = $%.2f%n", DescuentoCamisa);
        System.out.printf("Precio Total de todas las prendas = $%.2f%n ", Total);
    }
    
}
