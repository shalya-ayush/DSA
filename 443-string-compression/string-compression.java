class Solution {
    public int compress(char[] chars) {
        int ri = 0;
        int wi = 0;

        while(ri < chars.length){
            char currentChar = chars[ri];
            int count = 0;

            while(ri < chars.length && chars[ri]==currentChar){
                count++;
                ri++;
            }
            chars[wi++] = currentChar;

            if (count > 1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[wi++] = c;
                }
            }
        }
        return wi;
    }
}