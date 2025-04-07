class Solution {
    public String convertDateToBinary(String date) {
        int year =Integer.parseInt(date.substring(0,4));
        int month =Integer.parseInt(date.substring(5,7));
        int date1 =Integer.parseInt(date.substring(8,10));
        String res = Integer.toBinaryString(year);
        res+="-";
         res += Integer.toBinaryString(month);
        res+="-";
         res += Integer.toBinaryString(date1);
        return res;
    }
}