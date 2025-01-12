class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        // Odd length string can not be balanced
        if(n % 2 != 0){
            return false;
        }

        int opening = 0, closing = 0, wild_card = 0;
        for(int i = 0;i<n;++i){
            if(locked.charAt(i)== '0'){
                wild_card++;
            }
            else if(s.charAt(i) == '('){
                opening++;
            }
            else{
                closing++;
            }
            if (wild_card < (closing - opening)){
                return false;
            }
        }

        opening = closing = wild_card = 0;

        for(int i = n-1;i>=0;--i){
            if(locked.charAt(i)== '0'){
                wild_card++;
            }
            else if(s.charAt(i) == '('){
                opening++;
            }
            else{
                closing++;
            }
            if (wild_card < (opening - closing)){
                return false;
            }
        }

        return true;

    }
}