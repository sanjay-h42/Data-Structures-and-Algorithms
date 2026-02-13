class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedWordSet=new HashSet<>();
        for(String bannedWord : bannedWords){
            bannedWordSet.add(bannedWord);
        }
        int count=0;
        for(int i=0;i<message.length;i++){
            if(bannedWordSet.contains(message[i])){
                count++;
            }
            if(count==2){
                return true;
            }
        }
        return false;
    }
}