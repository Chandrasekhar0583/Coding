
// User function Template for Java
class Solution {
    int countTriplet(int arr[]) {
        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    count++;
                    i++;
                    j--;
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }
}
