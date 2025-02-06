import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    String[] arr = {"bananas", "apples", "peaches", "pears", "oranges"};

    reverse(arr);
  }

  public static void reverse(String[] arr)
  {

    for (String word : arr) {
      String reverseWord = "";
      for (int i = word.length(); i > 0; i--) {
        reverseWord += word.substring(i-1, i);
      }
      System.out.println(reverseWord);
  }
}

  public int product(int[] arr)
  {
    // for (int[]num : arr) {
      
    // }

    return 0;
  }

  public double average(double[] arr)
  {
    return 0.0;
  }
}
