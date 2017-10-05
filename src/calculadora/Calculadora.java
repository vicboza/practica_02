/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import calculadora.clase_calculadora;
import java.util.*;
import java.io.*;

/**
 *
 * @author victo
 */
public class Calculadora {

    public static void main(String[] args) {
        
        clase_calculadora[] inicio = new clase_calculadora[1];
        clase_calculadora.inicialitza(inicio);
        
        Scanner in= new Scanner(System.in);
        
        int num1=0,num2=0, result=0;
        String op="";

            System.out.printf("Inserta una número: ");num1=in.nextInt();
            in.nextLine();
            System.out.printf("Inserta el signo de la operación ");op=in.nextLine();
            
            System.out.printf("Inserta otro número: ");num2=in.nextInt();
            
            inicio[0]=new clase_calculadora(num1,op,num2);
            
           System.out.printf("%s",inicio[0].getOp());
            
            
          switch(op)
          {
              case "+": System.out.printf("%d",num1+num2);
              case "-": System.out.printf("%d",num1-num2);
              case "*": System.out.printf("%d",num1*num2);
              case "/": System.out.printf("%d",num1/num2);
          }

    }
    
}
