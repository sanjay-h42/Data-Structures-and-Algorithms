class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int minimum=Math.min(len1,len2);
        String longestString="";
        if(len1==minimum){
             longestString=word2;
        }
        if(len2==minimum){
             longestString=word1;
        }
        
        char[]ch1=word1.toCharArray();
        char[]ch2=word2.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<minimum;i++){
            sb.append(ch1[i]);
            sb.append(ch2[i]);
        }
       sb.append(longestString.substring(minimum));
        return sb.toString();
    }
}