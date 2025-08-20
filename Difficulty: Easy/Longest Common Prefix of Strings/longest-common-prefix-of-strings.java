// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        if(arr.length==0)
            return "";
        String prefix=arr[0];
        for(String word:arr)
        {
            while(word.indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;


    }
}