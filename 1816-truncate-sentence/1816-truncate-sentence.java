class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String[]words=s.split(" ");
        int index=0;
        while(k!=0){
                sb.append(words[index]+" ");
                index++;
                k--;
        }
        return sb.toString().trim();
    }
}