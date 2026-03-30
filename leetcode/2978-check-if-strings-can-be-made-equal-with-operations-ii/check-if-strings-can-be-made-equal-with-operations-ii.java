class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        char arr1[];
        char arr2[];
        if (n % 2 == 0) {
            arr1 = new char[n / 2];
            arr2 = new char[n / 2];
        } else {
            arr1 = new char[n / 2 + 1];
            arr2 = new char[n / 2 + 1];
        }
        int j = 0;
        for (int i = 0; i < n; i += 2) {
            arr1[j] = s1.charAt(i);
            arr2[j] = s2.charAt(i);
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1 , arr2)) {
            arr1 = new char[n / 2];
            arr2 = new char[n / 2];
            j = 0;
            for (int i = 1; i < n; i += 2) {
                arr1[j] = s1.charAt(i);
                arr2[j] = s2.charAt(i);
                j++;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1 , arr2);
        }
        return false;
    }
}