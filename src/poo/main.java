
/*
Calculator in java with class (OOP) 
Author: Ing. Fran Espino Mostacero
Email: fran_espino189@outlook.com
*/
package poo;

import java.util.*;

public class main {
    
      public static void main(String []args){
         float a,b;
         int x,y;
      Calculadora cal = new Calculadora();
      Scanner entrada = new Scanner(System.in);
      int op=0;
      
       do{
           System.out.println(".:CALCULADORA BASICA:.");
           System.out.println("1-SUM");
           System.out.println("2-SUBSTRACTION");
           System.out.println("3-MULTIPLICATION");
           System.out.println("4-DIVISION");
           System.out.println("5-POTENCY");
           System.out.println("6-ROOT N");
           System.out.println("7-TRINOMIAL");
           System.out.println("8-SALIR");
           
           System.out.print("Ingrese una opcion: ");
           op = entrada.nextInt();
           switch(op){
               case 1 : System.out.print("Enter a number: ");
                             a = entrada.nextFloat();
                             System.out.print("Enter another number: ");
                             b=entrada.nextFloat();
                             System.out.println("Answer: "+cal.Sum(a, b));
                             break;
                  
                case 2 : System.out.print("Enter a number: ");
                             a = entrada.nextFloat();
                             System.out.print("Enter another number: ");
                             b=entrada.nextFloat();
                             System.out.println("Answer: "+cal.Substaction(a, b));
                             break;
                case 3 : System.out.print("Enter a number: ");
                             a = entrada.nextFloat();
                             System.out.print("Enter another number: ");
                             b=entrada.nextFloat();
                             System.out.println("Answer: "+cal.Multiplication(a, b));
                             break;
                 case 4 : System.out.print("Enter a number: ");
                             a = entrada.nextFloat();
                             System.out.print("Enter another number: ");
                             b=entrada.nextFloat();
                             System.out.println("Answer: "+cal.Division(a, b));
                             break;
                 case 5 : System.out.print("Enter a base: ");
                             x = entrada.nextInt();
                             System.out.print("Enter a potency: ");
                             y=entrada.nextInt();
                             System.out.println("Answer: "+cal.Potency(x, y));
                             break;
                     
                 case 6 :  cal.Root();
                             break;
                     
                case 7 : System.out.print("Enter the value of a:");
                             x = entrada.nextInt();
                             System.out.print("Enter the value of b: ");
                             y=entrada.nextInt();
                             System.out.println("Answer: "+cal.Trinomio(x, y));
                             break;
                  
               
               
           }
       
           System.out.println("\n\n\n");
        
       }while(op!=8);
      
       
       
       
    }
    
    
    
}