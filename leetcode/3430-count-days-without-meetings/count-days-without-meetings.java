class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> sample=new ArrayList<>();
        int i=0;
        while(i<meetings.length)
        {
            int start=meetings[i][0];
            int end=meetings[i][1];
            int st=i+1;
            while(st<meetings.length)
            {
                if(end>=meetings[st][0])
                {
                   
                    end=Math.max(end,meetings[st][1]);

                }
                else
                {
                    break;
                }
                st++;
            }
            int[] each=new int[2];
            each[0]=start;
            each[1]=end;
            sample.add(each);
            i=st;
        }
    int count=0;
    i=0;
    int begin=1;
    int complete=days;
    for(i=0;i<sample.size();i++)
    {
        if(i==0)
        {
            count+=(sample.get(i)[0]-begin);
        }
        if(i==sample.size()-1)
        {
            count+=(complete-sample.get(i)[1]);
        }
        if(i<sample.size()-1)
        {
            int first=sample.get(i)[1];
            int second=sample.get(i+1)[0];

            count+=((second-1)-first);
        }
    }
        return count;
    }
}