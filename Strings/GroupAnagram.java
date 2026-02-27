import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            String s=str[i];
            int freq[]=new int[26];
            for(int j=0;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int k=0;k<26;k++)
            {
                sb.append("#");
                sb.append(freq[k]);
            }
            String key=sb.toString();
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());

            }
            map.get(key).add(s);

        }
        return new ArrayList<List<String>>(map.values());

    }
} 
    

