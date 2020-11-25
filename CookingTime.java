/*
* This function tells the user how long a microwave will
* take to cook select foods in select quantities.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-11-24
*/

import java.util.Scanner;  // Import the Scanner class

public class CookingTime {
  /**
   * This function tells the user how long a microwave will
   * take to cook select foods in select quantities based on
   * the food the user inputs.
   */
  public static void main(String[] args) {

    // Constants
    final float pizzaCookingTime = 0.75f;
    final float subCookingTime = 1;
    final float soupCookingTime = 1.75f;
    final float twoItemTimeIncrease = 1.5f;
    final float threeItemTimeIncrease = 2;

    try {
      // Input for the type of food
      Scanner foodInput = new Scanner(System.in);
      System.out.println("Enter the type of food you would like to cook " 
                          + "(pizza, sub or soup):");
      String foodChosen = foodInput.nextLine();
      String foodChosenUpperCase = foodChosen.toUpperCase();
      System.out.println();

      // Input for the quantity of food
      Scanner numberInput = new Scanner(System.in);
      System.out.println("Enter how many items you would like to be cooked:");
      int numberOfItems = foodInput.nextInt();
      System.out.println();

      // Process and outputs
      if ((numberOfItems <= 3) && (numberOfItems >= 1)) {
        if (foodChosenUpperCase.equals("PIZZA")) {
          // Output time for cooking pizzas
          float cookingTime = pizzaCookingTime
                              + (0.5f * pizzaCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else if (foodChosenUpperCase.equals("SUB")) {
          // Output time for cooking subs
          float cookingTime = subCookingTime
                              + (0.5f * subCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else if (foodChosenUpperCase.equals("SOUP")) {
          // Output time for cooking cups of soup
          float cookingTime = soupCookingTime
                              + (0.5f * soupCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else {
          // Output if input is not one of the three foods
          System.out.println("The microwave cannot cook this");
        }
      } else {
        System.out.println("You did not enter a valid number of items.");
      }
      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
