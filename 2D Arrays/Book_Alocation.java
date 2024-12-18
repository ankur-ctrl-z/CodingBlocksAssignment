import java.util.*;

public class Book_Alocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int[] books = new int[n];

            for (int i = 0; i < n; i++) {
                books[i] = sc.nextInt();
            }

            int low = Arrays.stream(books).max().getAsInt(); 
            int high = Arrays.stream(books).sum(); 
            int result = high;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (isFeasible(books, n, m, mid)) {
                    result = mid; 
                    high = mid - 1; 
                } else {
                    low = mid + 1; 
                }
            }

            System.out.println(result);
        }

        sc.close();
    }

    public static boolean isFeasible(int[] books, int n, int m, int maxPages) {
        int studentCount = 1; 
        int currentSum = 0; 

        for (int i = 0; i < n; i++) {
            if (currentSum + books[i] > maxPages) {
                studentCount++;
                currentSum = books[i];

                if (studentCount > m) {
                    return false;
                }
            } else {
                currentSum += books[i];
            }
        }

        return true; 
    }
}


