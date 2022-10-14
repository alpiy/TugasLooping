/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class LoopingF2 {
    public static void main(String[] args) {
         System.out.println("while loop");
        // loops using while
        {
            int x = 0, y = 0, max = 5;
            while (x < max) {
                while (y < max) {
                    if (y == (max - 1)) {
                        System.out.println("0");
                    } else if (x == (max - 1)) {
                        System.out.print("0");
                    } else {
                        System.out.print("*");
                    }
                    y++;
                }
                y = 0;
                x++;
            }
        }
    }
}
