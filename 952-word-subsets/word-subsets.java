class Solution {
    // We need to determine whether each word in words1 contains all characters required 
    // by words2, respecting the multiplicity of characters
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // Pre compute the maximum frequency of each character accross all words in words2
        int[] req =  new int[26];
        for (String word: words2){
            int[] curr_word_freq = new int[26];

            for (char c: word.toCharArray()){
                curr_word_freq[c-'a']++;
                req[c-'a'] = Math.max(req[c-'a'], curr_word_freq[c-'a']);


            }
        }

        // For each word in words1, compute its character frequency and check if it 
        // meets the requirement. 
        List<String> ans = new ArrayList<>();

        for(String word: words1){

            int [] curr = new int[26];
            for (char c: word.toCharArray()){
                curr[c- 'a']++;
            }
            boolean isValid = true;
            for(int i =0;i<26;i++){
                if(curr[i] < req[i]){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                ans.add(word);
            }
        }

        return ans;
        
    }

    
}