//had to return a substring which contains maximum number of repetaed charcaters after the maximum replacemnts we can make.
class Solution {
    public int characterReplacement(String s, int k) {
        {
            int freq[]=new int[26];
            int maxwindow=0;
            int maxfreq=0;
            int l=0;
            for(int r=0;r<s.length();r++)
            {
                freq[s.charAt(r)-'A']++;
                maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
                int windowlength=r-l+1;
                if(maxwindow-maxfreq>k)
                { freq[s.charAt(r)-'A']--;
                l++;

                }
                windowlength=r-l+1;
                maxwindow=Math.max(windowlength,maxwindow);
            }
            return maxwindow;
        }
    }
}