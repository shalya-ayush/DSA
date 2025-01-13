class Solution {
    public int minimumLength(String s) {
        int[] freqList = new int[26];

        for(char c: s.toCharArray()){
            freqList[c-'a']++;
        }
        int length = 0;
        for(int i =0;i<26;i++){
            while(freqList[i] > 2){
                freqList[i] = freqList[i]-2;
            }
            length += freqList[i];
        }

        return length;
        
    }
}