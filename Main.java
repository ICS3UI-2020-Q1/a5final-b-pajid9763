import java.util.Scanner;

/**
 * program that adds odd numbers
 * 
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter the maximum number to sum to:");
    int num = input.nextInt();

    // declare variable to add odd numbers to
    int total = 0;

    // loop body will repeat based of these instructions
    for (int i = 1; i <= num; i++) {

      // if number is odd, it will be added to total
      if (i % 2 != 0) {
        total += i;

        // if number is even, nothing happens and the loop body repeats
      } else if (i % 2 == 0) {

      }
    }
    // once for loop conditions are met, tell the user the sum of the odd numbers
    System.out.println("The sum of the odd numbers is " + total);

  }
}
