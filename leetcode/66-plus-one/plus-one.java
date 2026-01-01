import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++)
        {
            s+=digits[i];
        }
         BigInteger num = new BigInteger(s);
        num=num.add(BigInteger.ONE);
        String s1=""+num;
        char[] arr=s1.toCharArray();
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=arr[i]-'0';
        }
        return res;
    }
}