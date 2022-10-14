/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class LoopingF1 {
    public static void main(String[] args) {
         System.out.println("");
        System.out.println("for loop");

        // loop using for
        {
            int max = 5;
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < max; j++) {
                    if (j == (max - 1) || i == (max - 1)) {
                        System.out.print("0");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }
    }
    
}
