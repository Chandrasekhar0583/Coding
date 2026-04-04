class Solution {
    public String decodeCiphertext(String s, int r) {
        int n = s.length();
        if(r == 1) return s;
        int c = n / r;
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < c ; i++){
            int x = 0;
            int y = i;
            while(x < r  && y < c){
                res.append(s.charAt(x * c + y));
                x++;
                y++;
            }
        }
        return res.toString().stripTrailing(); 
    }
}