class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toString(n , 2);
        String res = "";
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                res += '1';
            }else{
                res += '0';
            }
        }

        return Integer.parseInt(res , 2);
    }
}