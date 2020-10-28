package activityten;

import java.util.Random;

/** Class implementing two recursive functions.
* @author Janyl Jumadinova
* @author Add Your Name
*/
public class Recursive {

  /**
  * Demonstrate the use of the recursive algorithms.
  */
  public static void main(String[] args) {

    System.out.println("Starting factorial ...");

    /* Testing factorial */

    long startTime = System.currentTimeMillis();

    Recursive.factorial(10);

    long endTime = System.currentTimeMillis();
    System.out.println("Finished factorial.");

    long elapsed = endTime - startTime;
    System.out.println("Running time factorial: " + elapsed);

    /* Testing linearSum */

    int[] numbers = new int[15];
    Random rand = new Random();
    for (int count = 0; count < 15; count++) {
      numbers[count] = rand.nextInt(10);
      System.out.println("Array element " + count + " :" + numbers[count]);
    }

    System.out.println("Starting linearSum ...");
    startTime = System.currentTimeMillis();
    Recursive.linearSum(numbers, 10);
    endTime = System.currentTimeMillis();
    System.out.println("Finished linearSum.");
    elapsed = endTime - startTime;
    System.out.println("Running time linearSum: " + elapsed);

  }
}
