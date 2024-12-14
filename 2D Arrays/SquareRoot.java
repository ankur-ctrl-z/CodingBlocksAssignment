import java.util.Scanner;

public class SquareRoot {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    System.out.print(squareRoot(A));
  }
  public static int squareRoot(int A) {
      if (A == 0 || A == 1) {
          return A; 
      }
      int start = 1, end = A, result = 0;

      while (start <= end) {
          int mid = start + (end - start) / 2;

          if (mid <= A / mid) {
              result = mid; 
              start = mid + 1;
          } else {
              end = mid - 1; 
          }
      }

      return result; 
  }
}
