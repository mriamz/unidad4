/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad4;

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
        //declaracion de arreglos 
        //no hay nada reservado
        //elementos con llaves y separando por comas 
        boolean[] banderas={true,false,true,true,false };
        String[] nombres = {"cesar","mateo","julio","victor","panchito","cris","liz","fatima","carlos","jacky","josue"};//solo a los string se le tiene que colocar comillas 
        //cesar,mateo,julio,victor,panchito,cris,liz,fatima,carlos,jacky,josue
        double[] calificaciones={9.4,8.9,7.8,6.8,9.0,
                                 7.9,8.2,6.1,8.3,7.6};
        char[] vocales;//caracteres #,@,a
        
                //. length es el tamaño de el arreglo
                System.out.println("banderas - "+banderas[0]);//corresponde al boolean
                System.out.println("arr -banderas en su posisio 4"
                        + "-elemento "+banderas[4]);
                System.out.println("nombres - "+ nombres.length);
                 System.out.println("nombres - "+ nombres[1]);
                 System.out.println("nombres - "+ nombres[9]);
                 System.out.println("nombres - "+ nombres[5]);
                 System.out.println("nombres - "+ nombres[0]);
                 System.out.println("calificaciones en su posicion 0"
                 +calificaciones[0]);
                  System.out.println("calificaciones en su posicion 1"
                 +calificaciones[1]);
                   System.out.println("calificaciones en su posicion 2"
                 +calificaciones[2]);
                  System.out.println("calificaciones en su posicion 3"
                 +calificaciones[3]);
                   System.out.println("calificaciones en su posicion 4"
                 +calificaciones[4]);
                    System.out.println("calificaciones en su posicion 5"
                 +calificaciones[5]);
                     System.out.println("calificaciones en su posicion 6"
                 +calificaciones[6]);
                      System.out.println("calificaciones en su posicion 7"
                 +calificaciones[7]);
                       System.out.println("calificaciones en su posicion 8"
                 +calificaciones[8]);
                        System.out.println("calificaciones en su posicion 9"
                 +calificaciones[9]);
               // System.out.println(nombres[0]);
                
    }
    
}
