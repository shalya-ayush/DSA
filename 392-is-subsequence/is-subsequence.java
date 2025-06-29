class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while(sp < s.length() && tp< t.length()){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
                tp++;
            }
            else{
                tp++;
            }
        }
        // System.out.println(sp);

        if(sp == s.length()){

            return true;
        }

        return false;
        
    }
}