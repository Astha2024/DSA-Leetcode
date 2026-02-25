class Solution {
    public int countSubstrings(String s) {
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count+=expand(s,i,i);
            count+=expand(s,i,i+1);

        }
        return count;
    }
    public int expand(String s, int start, int end)
    { int c=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
        {
            c++;
            start--;
            end++;
        }
        return c;
    }
}