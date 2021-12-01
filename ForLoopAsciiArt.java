// Allen Bao
// 11/03/2021
// A program that prints out a triangle based off the height the user inputs

import java.util.Scanner; // Import the Scanner class to get user's input

public class ForLoopAsciiArt {
   public static void main (String[] args) {

      // Declares variables to keep track of triangle's dimensions. 
      int triangleHeight = 0;
      String aSCIICharacter = "@";
      Scanner keyboard = new Scanner(System.in);

      // Gets users input (height of triangle) and stores it
      System.out.println("This program prints a simple ASCII triangle. ");
      System.out.print("How tall should the triangle be? ");
      triangleHeight = keyboard.nextInt() + 1;

      // Declare varibles to keep track of the while loop position
      String triangleRowChars = "";
      int rowCharacterPosition = 1;

      // Loop for every row
      for (int triangleRow = 1; triangleRow < triangleHeight; ++triangleRow) {
         triangleRowChars = "";
         // Add aSCIICharacter the current row number amount of times. 
         for (rowCharacterPosition = 1; rowCharacterPosition <= triangleRow; ++rowCharacterPosition) {
            triangleRowChars += aSCIICharacter;
         }
         // Print the resulting row of the triangle
         System.out.println(triangleRowChars);
      }
   }
}
