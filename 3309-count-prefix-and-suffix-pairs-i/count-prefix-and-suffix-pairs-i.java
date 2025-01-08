class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0;i<words.length-1;i++){
            for(int j = i+1;j<words.length;j++){
                if (isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }

            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2){
        int str1_len = str1.length();
        int str2_len = str2.length();

        if (str1_len > str2_len){
            return false;
        }

        for(int i =0;i<str1_len;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        for(int j = str1_len-1;j>=0;j--){
            if(str1.charAt(j) != str2.charAt(str2_len-1)){
                return false;
            }
            str2_len--;
        }

        return true;
    }


}