import java.util.*;
//optimised solution
class minimumwindow2 {

    public static String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();

        if(m > n) return "-1";

        int[] freq = new int[256];

        // Store frequency of t
        for(char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while(right < n) {

            // If current character is needed
            if(freq[s.charAt(right)] > 0) {
                count++;
            }

            // Decrease frequency
            freq[s.charAt(right)]--;

            // When all characters matched
            while(count == m) {

                // Update minimum length
                int windowLen = right - left + 1;
                if(windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = left;
                }

                // Try to shrink window
                freq[s.charAt(left)]++;

                // If after increment freq becomes > 0
                // it means we removed a required character
                if(freq[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        if(startIndex == -1) return "-1";

        return s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}