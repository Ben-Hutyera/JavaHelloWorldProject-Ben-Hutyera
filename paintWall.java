package src;
import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class paintWall {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double paintNeeded;
      long cansNeeded;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();                      // FIXME (1): Prompt user to input wall's width
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;                        // FIXME (1): Calculate the wall's area
      System.out.println("Wall area: "+wallArea+" square feet");     
      
      paintNeeded = ((double)wallArea) / ((double)350);
      System.out.println("Paint needed: "+paintNeeded+" gallons");
   
      cansNeeded = java.lang.Math.round(paintNeeded);
      System.out.println("Cans needed: "+cansNeeded+" can(s)");
      scnr.close();
   }
}