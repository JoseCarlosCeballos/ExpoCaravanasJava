
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class ExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = 1;
        String opcionStr;
        
        System.out.println("1.\tMostrar numero de entradas libres");
        System.out.println("2.\tVender entradas");
        System.out.println("3.\tSalir");
        
        try{
            opcionStr = sc.nextLine();
            x = Integer.parseInt(opcionStr);
        }catch (NumberFormatException e){
            System.out.println("Error, pon un numero del 1 al 3");
        }
        
        
    }
    
}
