import java.util.Scanner;

public class TriangularMatrix {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(LowerTriangle(arr));

    }
    public static boolean LowerTriangle(int arr[][]) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                   if(i < j && arr[i][j] != 0){
                       return false;
                   }
               }
        }
        return true;
    }
}
