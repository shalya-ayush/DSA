class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0){
            return true;
        }
        if (flowerbed.length <=1){
            if (flowerbed[0] == 0 && n==1){
                return true;
            }
            return false;
        }

        if (flowerbed[0] == 0 && flowerbed[1]==0){
            System.out.println(flowerbed);
            flowerbed[0] = 1;
            n = n-1;
            System.out.println(n);
        }
        int i =1;
        for(i=1;i<flowerbed.length-1;i++){
            if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i] = 1;
                n = n-1;
            }
        }
        if(flowerbed[i]==0 && flowerbed[i-1]==0){
            n = n-1;
        }

        if (n<=0){
            return true;
        }
        return false;

        
    }
}