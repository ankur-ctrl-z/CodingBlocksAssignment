import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = scanner.nextInt();
        }

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int maxDist = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(stalls, mid, c)) {
                maxDist = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(maxDist);
    }

    private static boolean isPossible(int[] stalls, int minDist, int cows) {
        int countCows = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                countCows++;
                lastPos = stalls[i];
            }
        }

        return countCows >= cows;
    }
}
