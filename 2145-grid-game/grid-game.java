class Solution {
    public long gridGame(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        if (col <2){
            return 0;
        }

        long topSum = 0;
        long bottomSum = 0;
        long minSum = Long.MAX_VALUE;

        for(int val: grid[0]){
            topSum += val;
        }

        for(int c =0;c<col;c++){
            topSum -= grid[0][c];
            minSum = Math.min(minSum, Math.max(topSum, bottomSum));
            bottomSum += grid[1][c];
        }


        return minSum;
    }
}