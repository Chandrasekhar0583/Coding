class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        char arr[] = new char[n];
        int c = 0;
        for(int i = 0 ; i < n; i++){
            if(s.charAt(i) == '1'){
                c++;
            }
        }
        arr[n - 1] = '1';
        c--;
        int i = 0;
        while(i < n -1 && c > 0){
            arr[i] = '1';
            i++;
            c--;
        }
        while(i < n - 1){
            arr[i] = '0';
            i++;
        }
        return new String(arr);
    }
}