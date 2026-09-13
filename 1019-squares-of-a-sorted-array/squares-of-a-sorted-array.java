class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];

        int start=0;
        int end = nums.length-1;
        int k=end;
        
        while(start<=end){
            int startSq = nums[start]*nums[start];
            int endSq = nums[end]*nums[end];

            if(startSq>endSq){
                arr[k--] = startSq;
                start++;
            }
            else{
                arr[k--] = endSq;
                end--;
            }
        }
        
        // arr[0] = nums[start]*nums[start];
        return arr;
    }
}