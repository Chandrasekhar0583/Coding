class Solution {
    public static int countSubs(String s) {
        // code here
        // HashSet<String> set = new HashSet<>();
        TrieNode head = new TrieNode();
        int count = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++)
        {
          TrieNode temp = head;
          for(int j = i ; j < n ;j++)
          {
              int index = s.charAt(j) - 'a';
              
              if(temp.child[index] == null )
              {
                  temp.child[index] = new TrieNode();
                  temp.end = true;
                  count++;
              }
              temp = temp.child[index];
          }
        }
        return count;
    }
}

class TrieNode{
    boolean end ;
    TrieNode child[];
    
    public TrieNode()
    {
        end = false;
        child = new TrieNode[26];
        for(int i = 0 ; i < 26 ; i++)
        {
            child[i] = null;
        }
    }
}