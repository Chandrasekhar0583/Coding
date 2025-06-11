class Solution {
    public int maxArea(int[] height) {
        TreeSet<Integer> tree = new TreeSet<>();
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            int area=min*(j-i);
            tree.add(area);
            if(min==height[i])
            i++;
            else
            j--;
        }
        return tree.last();
    }
}