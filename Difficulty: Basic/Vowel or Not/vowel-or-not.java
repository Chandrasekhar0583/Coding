// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i')
            return "YES";
        return "NO";
    }
}
