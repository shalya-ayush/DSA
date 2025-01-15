class Solution {
    public int minimizeXor(int num1, int num2) {
        // To minimize XoR b/w X and num1 
        // 1. Place set bits accroding to num1's set bits
        // 2. Leftover set bits must be placed to least weight index

        int setBits = getSetBits(num2);
        int res = 0;

        // Clear the set bits from highest to lowest
        for(int i =31; i>=0 && setBits > 0;i--){
            if((num1 & (1 << i)) !=0){
                setBits--;
                res += (1<<i) ;
            }

        }

        for(int i =0;i<32 && setBits >0;i++){
            if((num1 & (1<<i)) == 0){
                setBits--;
                res += (1<<i);
            }
        }
        return res;

    }

    private int getSetBits(int num2){
        int setbits = 0;
        while(num2 != 0){
            num2 = num2 & (num2 -1);
            setbits++;
        }
        return setbits;
    }
}