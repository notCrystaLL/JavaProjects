/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heronsformula;
import java.util.Scanner;

public class HeronsFormula {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int S1, S2, S3;
        
        System.out.print("Find the area of any triangle using Heron's Formula :");
        System.out.print("\n-------------------------------------------------------");
        System.out.print("\nInput the length of 1st side of the triangle : ");
        S1 = input.nextInt();
        System.out.print("\nInput the length of the 2nd side of the triangle : ");
        S2 = input.nextInt();
        System.out.print("\nInput the lenght of the 3rd side of the triangle : ");
        S3 = input.nextInt();
        
        double Area = (S1+S2+S3)/2.0d;
        double FinalArea = Math.sqrt(Area * (Area - S1) * (Area - S2) * (Area - S3));
        
        System.out.printf("\nThe area of the triangle is : %.4f", FinalArea);
    }
}
