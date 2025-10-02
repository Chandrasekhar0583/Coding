import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        Arrays.sort(arr); // ensures lexicographic order
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        int vis[] = new int[arr.length];
        permute(arr, res , vis , r);
        return res;
    }

    private static void permute(int[] arr, ArrayList<ArrayList<Integer>> res , int vis[] , ArrayList<Integer> r) {
        if (r.size() == arr.length) {
            res.add(new ArrayList<>(r));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (vis[i] == 1) continue; // skip duplicates
            if(i > 0 && arr[i] == arr[i - 1] && vis[i - 1] == 0) continue;
            vis[i] = 1;
            // swap(arr, i, ind);
            r.add(arr[i]);
            permute(arr , res, vis,r);
            r.remove(r.size() - 1);
            vis[i] = 0;
            // permute(arr, ind + 1, res);
            // swap(arr, i, ind); // backtrack
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
