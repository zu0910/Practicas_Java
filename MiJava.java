/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mijava;

public class MiJava {

    // NOMBRES DE VARIABLES 
    
    public static void main(String[] args) {
       
        int studentCount = 25; // Una veriable entera que almacena la cantidad de estudiantes.
        double averageGrade = 87.5; // Una variable tipo double que almacena la nota del promedio del curso 
        String courseName = "Introduction to Java"; // Una variable tipo string que almacena el nombre del curso.
        boolean isCourseActive = true; // Una variable tipo booleana que indica si el curso esta activo o no.

        // Imprimir los valores de las variables
        System.out.println("Course Name: " + courseName); // Se utiliza `System.out.println()` para imprimir en la consola los valores almacenados en las variables, concatenando texto explicativo con los valores de las variables.
        System.out.println("Number of Students: " + studentCount);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Is the Course Active? " + isCourseActive);
    }
}


