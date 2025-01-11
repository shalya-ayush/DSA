class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        int[] freqList = new int[26];
        for(char c: s.toCharArray()){
            freqList[c-'a']++;
        }
        
        int odd_freq = 0;
        for(int i =0; i<26;i++){
            if(freqList[i]%2 == 1){
                odd_freq++;
            }
        }
        return odd_freq <= k;


        
    }
}