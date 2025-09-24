class Solution {
    public String fractionToDecimal(int num, int den) {
        HashMap<Long , Integer > map = new HashMap<>();
        long n = num;
        long d = den;
        StringBuilder res = new StringBuilder();
        if(n == 0) return "0";
        if(n > 0 && d < 0) {
            res.append("-");
            d *= -1;
        }
        else if(n < 0 && d > 0)
        {
            res.append("-");
            n *= -1;
        }
        else if(d < 0 && n < 0)
        {
            n *= -1;
            d *= -1;
        }
        if(n < d)
        {
            res.append("0.");
        }else{
            while(n >= d)
            {
                res.append("" + (n /d));
                n = n % d;
            }
        if(n == 0) return res.toString();
        res.append(".");
        }
        n *= 10;
        int s = map.size();
        while(n != 0 && !map.containsKey(n) )
        {
            long x = n / d;
            map.put(n , res.length());
            res.append(""+x);
            n %= d;
            if(n < d) n *= 10;
        }
        if(n != 0 && map.containsKey(n) )
        {
            int x = map.get(n);
            res.insert(x ,"(");
            res.append(")");
        }
        return res.toString();
    }
}