/*
* This class creates an integer stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-09
*/

import java.util.ArrayList;  // Import the ArrayList class

public class JacobStack {
  // Initializing the array list field
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  /**
   * This method adds user input to a stack.
   */
  public void push(Integer inputNumber) {
    stackAsArray.add(inputNumber);
  }

  /**
   * This method pops the item on top of the stack and returns it.
   */
  public Integer pop() throws Exception {
    if (this.stackAsArray.size() <= 0) {
      throw null;
    } else {
      int poppedNumber = this.stackAsArray.get(this.stackAsArray.size() - 1);
      this.stackAsArray.remove(this.stackAsArray.size() - 1);
      return poppedNumber;
    }
  }

  /**
   * This method shows the last number on the stack to the user.
   */
  public Integer peek() throws Exception {
    if (this.stackAsArray.size() <= 0) {
      throw null;
    } else {
      int peekedNumber = this.stackAsArray.get(this.stackAsArray.size() - 1);
      return peekedNumber;
    }
  }

  /**
   * This method clears the stack of all values.
   */
  public void clear() {
    if (this.stackAsArray.size() <= 0) {
      throw null;
    } else {
      while (this.stackAsArray.size() > 0) {
        stackAsArray.remove(this.stackAsArray.size() - 1);
      }
    }
  }

  /**
   * This getter tells the user the most recent itteration of the array.
   */
  public String currentStack() {
    String currentValues = "Current ArrayList: ";
    for (int valueCounter = 0; valueCounter < stackAsArray.size(); 
         valueCounter++) {
      currentValues = currentValues 
                      + this.stackAsArray.get(valueCounter) + ", ";
    }
    return currentValues;
  }
}
