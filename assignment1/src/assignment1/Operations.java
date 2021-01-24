/*Mutamuliza*/

package assignment1;

import java.util.Scanner;

public class Operations {
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the weight in kgs:");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in metres:");
		double height = sc.nextDouble();
		double BMI = weight / (height * height);
	      System.out.print("\nYour BMI is " + BMI + " kg/m2");
	      
	      double length=20;
	      double width=10;
	      double perimeter=2*(length+width);
	      double area=length*width;
	      System.out.println("\nGiven the length=20 \n width=10 of a rectangle:");
	      System.out.println("The perimeter of the rectangle is:"+perimeter+"cm");
	      System.out.println("The area of the rectangle is:"+area+"cmsqrd");
	}
	
 
}
