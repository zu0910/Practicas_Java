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

    
    public static void main(String[] args) {
        
        /* EJERCICIO 1
    Una tienda de ropa está ofreciendo una promoción en la que se aplica un descuento del 15% 
    sobre el precio original de cada prenda. Si una camiseta cuesta $25 y un pantalón cuesta $30, 
    ¿Cuál será el precio total de ambas prendas después de aplicar el descuento? Además, si se compra 
    una segunda camiseta, se aplica un descuento adicional del 5% sobre el precio ya descuento de la primera camiseta.
     */
        
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
        
        /* EJERCICIO 2
        Una persona tiene una cantidad de dinero en su cuenta bancaria y quiere retirar una cantidad 
        fija cada semana durante un mes. Si la persona tiene inicialmente $1000 en su cuenta y retira $200 
        cada semana, ¿Cuánto dinero le quedará en su cuenta al final del mes?
     */
        
        double DineroInicial = 1000.00;
        double DineroRetirar = 200.00;
        int SemanaMensual = 4;
        
        double Retiro = DineroRetirar * SemanaMensual;
        double Restante = Retiro - DineroInicial;
        
        System.out.printf("Dinero inicial que tiene la persona es de $%.2f%n " , DineroInicial);
        System.out.printf("Total de retiro por cada semana teniendo encuenta que se retira $200.00 es de $%.2f%n ", Retiro);
        System.out.printf("Dinero restante al final del mes $%.2f%n", Restante);
        
    }
    
}
