class Solution {
    public boolean checkIfPangram(String s) {
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1){
                return false;
            }
        }
        return true;
    }
}