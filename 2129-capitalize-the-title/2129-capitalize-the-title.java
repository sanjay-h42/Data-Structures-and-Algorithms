class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        StringBuilder sb=new StringBuilder();
        String []words=title.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length()<3){
                sb.append(words[i]+" ");
            }
            else{
                char ch=words[i].charAt(0);
                ch=Character.toUpperCase(ch);
                String newWord=ch+(words[i].substring(1));
                sb.append(newWord+" ");
            }
        }
        String result=sb.toString().trim();
        return result;
    }
}