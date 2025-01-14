class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();

        int[] prefixArray = new int[A.length];
        for(int i =0;i<A.length;i++){
            set.add(B[i]);
            prefixArray[i] = prefixMatch(A, set, i);
        }
        return prefixArray;

        
            
        
    }
    private int prefixMatch(int[] A, Set<Integer> setB, int size){
        int count = 0;
        for(int i =0;i<=size;i++){
            if(setB.contains(A[i])){
                count++;
            }
        }
        return count;
    }
}