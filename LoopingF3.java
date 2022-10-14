/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class LoopingF3 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("do while loop");

        // loop using do while
        {
            int x = 0, y = 0, max = 5;

            do {
                do {
                    if (y == (max - 1) || x == (max - 1)) {
                        System.out.print("0");
                    } else {
                        System.out.print("*");
                    }
                    y++;
                } while (y < max);
                System.out.println("");
                y = 0;
                x++;
            } while (x < max);
        }
    }
}
