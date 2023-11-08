/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosbid;

/**
 *
 * @author laraf
 */
public class ArreglosBid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       char letra='a';
        char[][]acb=new char [3][5];
       
        
        //System.out.println(letras);
        
         
        for (int i = 0; i <3 ; i++) {
            
            for (int j = 0; j < 5; j++) {
                acb[i][j]=letra;
                letra++;
                
               
                
                
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(acb[i][j]+ " ");
                
            }
             System.out.println();
        }
    
}
}
