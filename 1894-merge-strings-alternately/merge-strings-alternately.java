class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int w1_len = word1.length();
        int w2_len = word2.length();
        int p1 = 0;
        int p2 = 0;
        
        StringBuilder merged_word = new StringBuilder();

        while(p1 < w1_len && p2 < w2_len){
            merged_word.append(word1.charAt(p1++));
            merged_word.append(word2.charAt(p2++));
        }
        while(p1 < w1_len){
            merged_word.append(word1.charAt(p1++));
        }

        while(p2 < w2_len){
            merged_word.append(word2.charAt(p2++));
        }

        return merged_word.toString();
    }
}