// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {
        int count[]=new int[26];
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            count[s2.charAt(i)-'a']++;
            count[s1.charAt(i)-'a']--;

            
        }
        count[s2.charAt(n)-'a']++;
        for(int i=0;i<26;i++)
        {
            if(count[i]==1)
                return (char)(i+'a');
        }
        return '0';


    }
}
