/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura =new Scanner(System.in);
        // declaracion del arreglo
        String opc ;
        int t;
       double [] op = new double[7];
      op[0]=20.3;
       op[1]=40.6;
       op[2]=78.6;
       op[3]=94.7;
       op[4]=55.3;
       op[5]=22.6;
       op[6]=84.3;
       
       do{
           System.out.println("ingresee la operaseion que desea ");
           System.out.println("1.-sumar ");
           System.out.println("2.-multiplicar ");
           System.out.println("3.-salir");
           t=lectura.nextInt();
           switch(t){
               case 1:
                   double suma=0;
                   for (int i = 0; i < op.length; i++) {
                       suma+=op[i];
                       System.out.println("resutado "+suma);
                       
                   }
                   break;
               case 2:
                   double multiplicacion=1;
                   for (int j = 0; j < op.length; j++) {
                       multiplicacion+=op[j];
                       System.out.println("resultado"+multiplicacion);
                       
                   }
                  break;
           
           }
       }while(t!=3);
       
        
    }
    
}
