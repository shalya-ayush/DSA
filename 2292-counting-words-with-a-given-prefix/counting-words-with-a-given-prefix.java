class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i =0;i<words.length;i++){
            // Case 1: Continue to the next if pref len is greater than the words[i] len

            if(pref.length() > words[i].length()){
                continue;
            }
            int j;
            for(j = 0;j<pref.length();j++){
                if(pref.charAt(j) != words[i].charAt(j)){
                    break;
                }
            }
            if(j == pref.length()){
                count++;
            }
        }
        return count;
        
    }
}