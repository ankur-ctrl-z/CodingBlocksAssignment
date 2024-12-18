import java.util.*;

public class murthal_paratha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int P = sc.nextInt(); 
        int L = sc.nextInt(); 
        int[] ranks = new int[L]; 
        
        for (int i = 0; i < L; i++) {
            ranks[i] = sc.nextInt();
        }
        
        int low = 1;
        int high = P * (P + 1) / 2 * ranks[0]; 
        int ans = high;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (canCookInTime(ranks, P, mid)) {
                ans = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        
        System.out.println(ans);
    }
    
    public static boolean canCookInTime(int[] ranks, int P, int time) {
        int totalParanthas = 0;
        
        for (int rank : ranks) {
            int t = 0; 
            int count = 0; 
            
            while (t + (count + 1) * rank <= time) {
                count++;
                t += count * rank;
            }
            
            totalParanthas += count;
            if (totalParanthas >= P) {
                return true; 
            }
        }
        
        return false; 
    }
}