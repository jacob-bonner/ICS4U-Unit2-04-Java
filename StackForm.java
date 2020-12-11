/*
* This program pushes user inputted integers to a stack, pops an integer,
* peeks at the top of the stack then finally clears the stack.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-09
*/

import java.util.Scanner;  // Import the Scanner class

public class StackForm {
  /**
   * This function allows the user to add an inputted number to a stack and
   * will show the user two numbers popped from the top of the stack.
   */
  public static void main(String[] args) {
    // Declaring stack by using the JacobStack class
    JacobStack stack = new JacobStack();

    try {
      // User input for size of stack
      Scanner stackInput = new Scanner(System.in);
      System.out.println("How many integers would you like for the stack: ");
      int stackSize = stackInput.nextInt();
      System.out.println();

      for (int counter = 0; counter < stackSize; counter++) {
        // User input for integer to be added to stack
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an Integer for the Stack: ");
        int numberChosen = userInput.nextInt();
        System.out.println();

        // Placing the inputted integers on the stack
        stack.push(numberChosen);
      }

      // Popping the most recent integer and returning it to the user
      System.out.println("Number Popped From Stack: " + stack.pop());

      // Peeking at the final number on the stack and returning it to the user
      System.out.println("Final (Peeked) Number in Stack: " + stack.peek());

      // Printing the current values in the stack
      System.out.println(stack.currentStack());

      // Clearing the current stack and showing the empty stack
      System.out.println("Clearing Stack");
      stack.clear();
      System.out.println(stack.currentStack());

      // Catches and tells the user what error occured
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Null Received");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("ERROR: Invalid Input");
    }
  }
}
