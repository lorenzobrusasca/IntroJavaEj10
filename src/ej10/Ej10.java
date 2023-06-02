/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
    
    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner (System.in);
        
        
        int suma = 0;
        int num = 0;
        int lim;
        
        System.out.println("Ingrese un número límite positivo");
            lim = leer.nextInt();
            
            while(lim<0)
            {System.out.println("Error, el número debe ser positivo");
            lim = leer.nextInt();
            }
        
        
        while (suma<=lim)
        {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
                        
            suma = suma + num;
            
        }
        
        System.out.println("La suma de los números superó el límite inicial" + "\nLa suma es = " + suma + "\nEl límite inicial fué = " + lim);  
      
    }
    
}
