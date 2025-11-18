import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("test_cases/input_01.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (seen.containsKey(diff)) {
                System.out.println(seen.get(diff) + " " + i);
                return;
            }
            seen.put(nums[i], i);
        }
    }
}
