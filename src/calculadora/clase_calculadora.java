package calculadora;

import java.io.*;

/**
 *
 * @author victo
 */
public class clase_calculadora implements Serializable{
    
   private int num1;
   private String op;
   private int num2;
   
   
   public clase_calculadora()
   {
       num1=0;
       op="";
       num2=0;
 
   }
   
   public clase_calculadora(int num1, String op, int num2)
   {
       this.num1 = num1;
       this.op = op;
       this.num2 = num2;
   }
   
   public static void inicialitza(clase_calculadora[] inicio)
   {
       for (int i=0;i<inicio.length;i++)
       {
           inicio[i]= new clase_calculadora(0," ",0);
       }
   }
   
   public static void suma(clase_calculadora[] suma)
   {
       
   }
   
   public static void resta(clase_calculadora[] resta)
   {
       
   }
   
   public static void multiplica(clase_calculadora[] multiplica)
   {
       
   }
   
   public static void fantasma(int num1, int num2)
   {
      
   }
    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}
