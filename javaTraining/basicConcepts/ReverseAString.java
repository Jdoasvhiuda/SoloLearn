package javaTraining.basicConcepts;

/* Reverse a String
* Write a program to take a string as input and output its reverse.
* The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.
* 
* Sample Input:
* hello there
* 
* Sample Output:
* ereht olleh
* 
* You can loop through the char array, starting from the end, using arr.length to get the size of the array.
*/

import java.util.Scanner;

public class ReverseAString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    // your code goes here
    int result = calculateRemainingBalance(amount, 3, 10);
    System.out.println(result);
  }

  public static int calculateRemainingBalance(int initialBalance, int monthsPaid, int percentPaidPerMonth) {
    int result = initialBalance;
    for (int i = 0; i < monthsPaid; i++) {
      result = result - (result / 100 * percentPaidPerMonth);
    }
    return result;
  }
}
