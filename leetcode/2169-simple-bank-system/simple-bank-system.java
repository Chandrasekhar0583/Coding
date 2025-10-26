class Bank {
    long arr[] ;
    int n ;
    public Bank(long[] balance) {
        arr = balance;
        n = balance.length;
    }
    
    public boolean transfer(int a1, int a2, long money) {
        // System.out.println(Arrays.toString(arr)+" " + n);
        if(a1 <= 0 || a1 > n) return false;
        if(a2 <= 0 || a2 > n) return false;
        a1 -= 1;
        a2 -= 1;
        if(arr[a1] < money) return false;
        arr[a1 ] -= money;
        arr[a2] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account <= 0 || account > n) return false;
        account -= 1;
        arr[account] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account <= 0 || account > n) return false;
        account -= 1;
        if(arr[account] < money) return false;
        arr[account] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */