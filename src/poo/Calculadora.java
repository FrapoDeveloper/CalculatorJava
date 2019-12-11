
package poo;

import java.util.Scanner;


public class Calculadora {
    
    //Atributos
     private float sum,subtraction, multiplication, division;
     private   float potency,root;
     private  int trinomio;
 
    //Metodos
    public float Sum(float  n1,float n2){
        sum = n1+n2;
        return sum;
        
        }
    
      public float Substaction(float  n1,float n2){
        subtraction = n1-n2;
        return subtraction;
         }
    
        public float Division(float  n1,float n2){
        division= n1/n2;
        return division;
          }
        
         public float Multiplication( float n1,float n2){
        multiplication = n1*n2;
        return multiplication;
        
          }
          
        public float Potency( int n1,int n2){
         potency = (int) Math.pow(n1,n2);
         return potency;
         }
     
        public void Root(){
          Scanner entrada = new  Scanner(System.in);
          System.out.print("Filing: ");
          double radicando = entrada.nextInt();
          System.out.print("Index: ");
          double indice = entrada.nextInt();
          float root = (float)Math.pow(radicando,1/ indice);
          System.out.println("Root: "+root);
        }
       
        public int Trinomio(int a, int b){
           trinomio =(int) ((Math.pow(a, 2)+(2*a*b)+(Math.pow(b, 2)) ));
           return trinomio;
        }
         
         
         
           
        
}

