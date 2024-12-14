import java.util.Scanner;

public class PainterPartition {
    public static boolean isPossible(int[] boards, int n, int k, int maxTime) {
        int painters = 1, total = 0;

        for (int board : boards) {
            total += board;

            if (total > maxTime) {
                painters++;
                total = board;

                if (painters > k) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMinTime(int[] boards, int n, int k) {
        int low = 0, high = 0;

        for (int board : boards) {
            low = Math.max(low, board); 
            high += board; 
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(boards, n, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int n = scanner.nextInt();

        int[] boards = new int[n];
        for (int i = 0; i < n; i++) {
            boards[i] = scanner.nextInt();
        }

        System.out.println(findMinTime(boards, n, k));

        scanner.close();
    }
}
