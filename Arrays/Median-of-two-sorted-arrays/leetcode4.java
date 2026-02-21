import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];

        // Copy nums1
        for(int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i];
        }

        // Copy nums2
        for(int i = 0; i < nums2.length; i++){
            nums3[i + nums1.length] = nums2[i];
        }

        Arrays.sort(nums3);

        int d = nums3.length;
        int mid = d / 2;

        if(d % 2 != 0){
            return nums3[mid];
        } else {
            return (nums3[mid - 1] + nums3[mid]) / 2.0;
        }
    }
}
