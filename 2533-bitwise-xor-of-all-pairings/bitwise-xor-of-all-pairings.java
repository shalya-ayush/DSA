class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int nums1_xor = 0;
        if (n%2 == 0) {
            nums1_xor = 0;
        }
        else{
            for(int i =0;i<m;i++){
                nums1_xor = nums1_xor ^ nums1[i];
            }
        }
        int nums2_xor = 0;
        if (m%2 == 0) {
            nums2_xor = 0;
        }
        else{
            for(int i =0;i<n;i++){
                nums2_xor = nums2_xor ^ nums2[i];
            }
        }
        return nums1_xor ^ nums2_xor;
    }
}