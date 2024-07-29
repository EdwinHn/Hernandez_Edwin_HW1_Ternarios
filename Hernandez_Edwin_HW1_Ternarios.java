/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_hw1;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_HW1_Ternarios {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        /*
        El operador ternario es un operador lógico que permite tomar decisiones con una
        condición booleana como parámetro.
        A diferencia de un if o un if-else, la estructura del operador ternario es más compacta
        pero ello reduce sus posibles resultados a dos.
        
        Su estructura consiste en establecer el tipo de dato y el nombre del operador,
        luego se establece una prueba lógica y por último los dos posibles resultados,
        de la siguiente manera, por ejemplo:
               String           nombre          =      (a>b)       ?        "verdadero"      :       "falso"     ;
            tipo de dato   nombre del operador      preuba lógica       resultado verdadero      resultado falso
         */
        
        
        /*
        En el caso del ternario que hace uso de un valor constante, el resultado 
        depende del valor predeterminado que se le asigne a una constante
        */
        System.out.println("-Ternario con valor constante");
        double nota = 45;
        System.out.println("Nota: "+nota);

        String constante = (nota >= 60) ? "Aprobado\n" : "Reprobado\n";
        System.out.println(constante);

        
        /*
        En el caso del ternario que hace uso de un valor variable, el resultado 
        depende del valor que se le asigne a una variable desde el teclado
        */
        System.out.println("-Ternario con valor variable");
        System.out.print("Ingrese su nota: ");
        nota = scan.nextDouble();

        String variable = (nota >= 60) ? "Aprobado\n" : "Reprobado\n";
        System.out.println(variable);

        
        /*
        En el caso del ternario que hace uso de formulas, en los dos posibles resultados
        pueden haber diferentes operaciones y cuyo resultado final depende del valor
        que se le asigne a una variable desde el teclado
        */
        System.out.println("-Ternario con formulas");
        String formula = (nota >= 60) ? ("Nota para excelencia: " + (90 - nota)) : ("Nota para aprobar: " + (60 - nota));
        System.out.println(formula);
    }
}
