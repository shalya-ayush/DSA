class Solution {
    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[] row_server_count = new int[m];
        int[] col_server_count = new int[n];
        int total_server = 0;
        // store the sum of server in each row and column
        for(int i =0;i<m;i++){
            for(int j =0; j<n;j++){
                if(grid[i][j]==1){
                    row_server_count[i]++;
                    col_server_count[j]++;
                    total_server++;
                }

            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    if(row_server_count[i] < 2 && col_server_count[j]<2){
                        total_server--;
                    }
                }
            }
        }

        return total_server;
        
    }
}