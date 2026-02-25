import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;
        HashSet<Character> hash=new HashSet<>();
            for(int right=0;right<s.length();right++)
            {
                while(hash.contains(s.charAt(right)))
                {
                    hash.remove(s.charAt(left));
                    left++;
                }
              
                hash.add(s.charAt(right));

                max=Math.max(max,right-left+1);
               
            }
        

        
        return max;
    }
}