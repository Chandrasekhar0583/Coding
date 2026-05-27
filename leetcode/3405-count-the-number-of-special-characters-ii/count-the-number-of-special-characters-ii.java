class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[] = new int[26];
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                arr[ch - 'a']++;
            }
        }
        int arr2[] = new int[26];
        int count = 0;
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                arr2[ch - 'a']++;
            }
            if(Character.isUpperCase(ch)){
                int x = ch - 'A';
                if(arr[x] == arr2[x] && arr[x] != 0){
                    count++;
                }
                arr[x] = -1;
            }
        }
        return count;
    }
}