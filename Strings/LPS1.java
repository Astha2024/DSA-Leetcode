//MAYBE A WRONG CODE BUT YES IT HAS THE CORRECT LOGIC THAT WE ARE ITERATING EVERY LENGTH AND THEN CHECKING IF CHARACTER FROM PREFIX TILL THAT LENGTH MATCHES THE SUFFIX AT THAT LENGTH
 class LPS1 {
    int getLPSLength(String s) {
        // code here
        int c=0;
        int n=s.length();
        for(int len=1;len<n;len++)
        {
            int j=n-len;
            boolean flag=true;
            for(int k=0;k<len;k++)
            {
                if(s.charAt(k)!=s.charAt(j-k))
                {flag=false;
                break;}
                
            if(flag)
            c=len;
        }
        
    }
    return c;
}
}