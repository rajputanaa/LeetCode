class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start=0;
        

        for(int end=1; end<nums.length;end++){
            if(nums[start]!=nums[end]){

                nums[start+1] = nums[end];
                start++;
            }
        }
        return start+1;
    }
}