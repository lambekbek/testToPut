/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial4;

/**
1a. Find the largest integer n so that n^3 is less than 2000.
 */
public class t4q1a {
    public static void main(String[] args) {
        int n=1;
        while (Math.pow(n+1,3)<2000){
            n++;
        }
        System.out.println("The largest integer n is "+n);
    }
}
