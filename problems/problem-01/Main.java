import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // For testing - UNCOMMENT the line below
        System.setIn(new FileInputStream("test_cases/input_01.txt"));
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Your solution here
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);
        
        sc.close();
    }
}
