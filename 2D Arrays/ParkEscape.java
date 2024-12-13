import java.util.Scanner;

public class ParkEscape {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int K = sc.nextInt(); 
        int S = sc.nextInt(); 

        char[][] park = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }

        int strength = S;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (park[i][j] == '.') {
                    strength -= 3;  
                } else if (park[i][j] == '*') {
                    strength += 4;  
                }

                if (strength < K) {
                    System.out.println("No");
                    return;
                }

                if (park[i][j] == '#') {
                    break;  
                }
            }
        }

        System.out.println("Yes");
        System.out.println(strength);
    }
}