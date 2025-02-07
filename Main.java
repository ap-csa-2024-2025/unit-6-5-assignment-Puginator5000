import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    //String[] arr = {"bananas", "apples", "peaches", "pears", "oranges"};
    // double[] arr = {1.0, 2.3, 3.6, 4.2, 5.0};
    //int[] arr = {1, 2, 3, 4, 5};

    //average(arr);
    //reverse(arr);
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

  public static int product(int[] arr)
  {
    int ans = 1;

    for (int num : arr) {
      ans *= num;
    }

    return ans;
  }

  public static double average(double[] arr)
  {
    double avg = 0;

    for (double num : arr) {
      avg += num;
    }
    avg = avg / arr.length;
    
    return avg;
  }
}
