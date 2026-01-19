class Solution {
    public String reverseWords(String s) {
        String []words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=words.length-2;i++){
            String rev=reverse(words[i]);
            sb.append(rev+ " ");
        }
        String lastWord=reverse(words[words.length-1]);
        sb.append(lastWord);
        return sb.toString();
    }

    private static String reverse(String word){
        String result="";
        for(int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        return result;
    }
}