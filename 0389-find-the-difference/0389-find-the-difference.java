class Solution {
    public char findTheDifference(String s, String t) {
        // int s_sum=0,t_sum=0;
        // for(int i=0;i<s.length();i++){
        //         s_sum+=s.charAt(i);
        // }

        // for(int i=0;i<t.length();i++){
        //         t_sum+=t.charAt(i);
        // }

        // int result=t_sum-s_sum;
        // return (char)result;

        List<Character> li = new LinkedList<>();

        for (char a : s.toCharArray()) {
            li.add(a);
        }

        for (char a : t.toCharArray()) {
            if (!li.remove((Character) a)) {
                return a;
            }
        }
        return ' ';
    }
}