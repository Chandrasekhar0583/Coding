class Solution {
     static final int MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> list = new HashMap<>();
        int max = 0;
        for(int a[] : points)
            {
               
                list.put(a[1] , list.getOrDefault(a[1] , 0)+ 1);
                max = Math.max(list.get(a[1]) , max);
            }
        if(max == 1 || max == 0)
        {
            return 0;
        }
        long fact[] = new long[max + 1];
        fact = generate(max + 1);
        int sum = 0;
        long prod = 0;
        for(Integer count : list.values())
            {
                if(count > 1)
                {
                long numerator = fact[count];
                long denominator = (fact[2] * fact[count - 2]) % MOD;
                long inverse = modInverse(denominator, MOD);
                long x = (numerator * inverse) % MOD;

                    prod = (prod + (x * sum) % 1000000007) % 1000000007;
                    sum += x;
                }
            }
        return (int)prod;
    }
    public long[]  generate(int n)
    {
        long arr[] = new long[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2 ; i < n ; i++)
            {
                arr[i] =( i * arr[i - 1])% MOD;
            }
        return arr;
    }
     public long modInverse(long a, int mod) {
        return pow(a, mod - 2, mod);
    }

    public long pow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}