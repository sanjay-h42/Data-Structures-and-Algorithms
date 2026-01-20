class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCaps(word) || allLower(word) || titleCase(word)){
            return true;
        }
        return false;
    }
    private boolean allCaps(String word){
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(word.length()==count){
            return true;
        }
        return false;
    }

    private boolean allLower(String word){
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        if(word.length()==count){
            return true;
        }
        return false;
    }
     
    private boolean titleCase(String word){
        char ch=word.charAt(0);
        String subString=word.substring(1);
        if(Character.isUpperCase(ch) && allLower(subString)){
            return true;
        }
        return false;
    }
}