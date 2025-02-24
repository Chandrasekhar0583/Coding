//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            String ans = ob.findLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        Integer[] arr1 = Arrays.stream(arr)
                               .boxed() 
                               .toArray(Integer[]::new);
        Arrays.sort(arr1, (n1, n2) -> {
            String s1 = n1 + "" + n2; 
            String s2 = n2 + "" +n1;
            return s2.compareTo(s1);    
        });

        StringBuilder sb = new StringBuilder();
        for (Integer num : arr1) {
            sb.append(num);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    
    }
}