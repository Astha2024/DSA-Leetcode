class minwindowsusbtring1
{
    public static String minwindow(String s, String t)
    {
        int n=s.length();
        int minlen=Integer.MAX_VALUE;
        int startindex=-1;
        for(int i=0;i<n;i++)
        {
            int[] freq=new int[256];
            for(int j=0;j<t.length();j++)
            {
                char c=t.charAt(0);
                freq[c]++;
            }
            int count=0;
            for(int j=i;j<n;j++)
            {
                char ch=s.charAt(j);
                if(freq[ch]>0)
                {
                    count++;
                }
                freq[ch]--;
                if(count==t.length())
                { int len=j-i+1;
                    if (minlen<len)
                    {
                        len=minlen;
                        startindex=i;
                    }
                    break;
                }
            }
        }
        if(startindex==-1)
        {
            return "";

        }
        return s.substring(startindex,startindex+minlen);
    }
}