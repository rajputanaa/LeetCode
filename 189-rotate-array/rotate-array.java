class Solution {
    public void rotate(int[] nums, int k) {

        k=k % nums.length;
        
        halfRotation(nums,0,nums.length-1);
        halfRotation(nums,0,k-1);
        halfRotation(nums,k,nums.length-1);

    
    }

 public void halfRotation(int[] nums, int start, int end){

    while(start<end){

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }
}
}