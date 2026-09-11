class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<small){
                small = nums[i];
            }
            if(nums[i]>larg){
                larg = nums[i];
            }
        }

        while (larg != 0) {
            int temp = larg;
            larg = small % larg;
            small = temp;
        }

        return small;
    }
}