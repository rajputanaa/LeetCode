class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }

        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        return arr;
    }
}