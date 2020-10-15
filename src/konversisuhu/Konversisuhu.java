/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Konversisuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c,r,f,k; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<< Konversi Suhu >>>");
        System.out.print("Masukan Bilangan = ");
          c = input.nextInt(); 
          r = c*4/5; 
          f = (c*9/5)+32; 
          k = c+273; 
        System.out.println("  ");
        System.out.println("Celsius = " +c);   
        System.out.println("Reamur = "+r);     
        System.out.println("Fahrenheit = "+f); 
        System.out.println("Kelvin = "+k);     
    }
    
}
