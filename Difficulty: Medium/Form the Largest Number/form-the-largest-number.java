

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