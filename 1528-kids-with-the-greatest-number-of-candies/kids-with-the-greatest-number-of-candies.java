class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = 0;

        for(int i =0;i<candies.length; i++){
            maxVal = Math.max(maxVal, candies[i]);
        }

        List<Boolean> result = new ArrayList<>();

        for(int i =0;i< candies.length;i++){
            result.add(candies[i] + extraCandies >= maxVal);
        }

        return result;


        
    }
}