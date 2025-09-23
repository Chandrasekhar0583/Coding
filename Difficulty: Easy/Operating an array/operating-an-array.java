/*Complete the function(s) below*/
class Solution {
    public boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        return arr.contains(x);
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
        // add code here.
        if(arr.size() >= yi )
        {
            arr.add(yi , y);
            // System.out.print("true ");
        }
        // else{
        //     System.out.print("false ");
        // }
    }

    public void deleteEle(List<Integer> arr, int z) {
        // add code here.
        if(arr.contains(z))
        {
          arr.remove(Integer.valueOf(z));   
            // System.out.print("true ");
        }
    }
}