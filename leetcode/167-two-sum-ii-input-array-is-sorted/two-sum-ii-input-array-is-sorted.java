class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while(low<high)
        {
            if(numbers[low]+numbers[high]==target)
            {
                arr[0] = low+1;
                arr[1] = high+1;
                return arr;
            }
            else if(numbers[low]+numbers[high]<target)
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        arr[0] = -1;
        arr[1] =-1;
        return arr;
    }
}