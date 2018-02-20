/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg6;

import java.util.Scanner;

/**
 *
 * @author shanmathee tegerraju
 */
public class Lab56 {

    /**
     * @param args the command line arguments
     */
    public static void print(int n){   
       
       int[] previousRow;
       int[] currentRow = {1};
       
       printArray(currentRow);
       previousRow = currentRow;
       for (int i = 2; i <= n; i++) {
           currentRow = new int[i];
           currentRow[0] = 1;
           currentRow[i - 1] = 1;
           for (int j = 0; j <= i - 3; j++) {
               currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
           }
           printArray(currentRow);
           previousRow = currentRow;
       }
   }
    
    
       public static void printArray(int[]array){
   
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        
         
  
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the row number of row of Pascal triangle to generate: ");
       int row = input.nextInt();
       System.out.println("The Pascal Triangle with "+row+" row(s)");
       print(row);
    }
    
}
