class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}