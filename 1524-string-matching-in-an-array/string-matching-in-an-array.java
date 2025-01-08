class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> matching_strings = new HashSet<>();

        for(int i =0;i<words.length;i++){
            for(int j =0;j<words.length; j++){
                if(i != j){
                    if(isSubstring(words[i], words[j])){
                        matching_strings.add(words[j]);

                    }
                }
            }
        }

        return new ArrayList<>(matching_strings);
        
    }

    public boolean isSubstring(String txt, String pattern){
        int txt_len = txt.length();
        int pat_len = pattern.length();
        
        for(int i =0;i<=txt_len-pat_len;i++){
            int j;
            for(j=0;j<pat_len;j++){
                if(txt.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }

            if (j==pat_len){
                return true;
            
            }
        }
        return false;
    }
}