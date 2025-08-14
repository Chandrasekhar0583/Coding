class Solution {
    public String largestGoodInteger(String num) {
        PriorityQueue<Integer> sample=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<num.length()-1;i++)
        {
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1))
            {
                String str=num.substring(i-1,i+2);
                int x=Integer.parseInt(str);
                sample.add(x);
            }
        }
        if(sample.size()==0)
        return "";
        else 
        {
           String ans=Integer.toString(sample.poll());
           if(ans.charAt(0)=='0')
           ans="000";
           return ans; 
        }
    }
}