class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        int max = -1;
        for(int i : b)
        {
            max = Math.max(max , i);
        }
        int arr[] = new int[max + 1];
        for(int i : b)
        {
            arr[i]++;
        }
        for(int i = 1 ; i <= max ; i++)
        {
            arr[i] = arr[i] + arr[i - 1];
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < a.length ;i++)
        {
            if(a[i] >= max)
            res.add(arr[max]);
            else
            res.add(arr[a[i]]);
        }
        return res;
    }
}