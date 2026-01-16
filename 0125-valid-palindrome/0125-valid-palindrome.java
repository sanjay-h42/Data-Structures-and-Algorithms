class Solution {

    public boolean palindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left< right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;          
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                sb.append(ch);
            }
        }
            String result=sb.toString();result=result.toLowerCase();
            if(palindrome(result))
               { 
                return true;
               }
        
        return false;
    }
}