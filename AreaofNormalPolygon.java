/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofnormalpolygon;
import java.util.Scanner;

public class AreaofNormalPolygon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Sides, length;
        double Area;
        
        System.out.print("Input the number of sides of the polygon: ");    
        Sides = input.nextInt();
        System.out.print("\nInput the length of each side of the polugon: ");
        length = input.nextInt();
        
        Area = (Sides * (length * length)) / (4.0 * Math.tan((Math.PI / Sides)));
        
        System.out.printf("\nThe Area of the polygon is: %.4f", Area);
    }
    
}
