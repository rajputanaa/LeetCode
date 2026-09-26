class Solution {
    public int[] rearrangeArray(int[] nums) {

    int n = nums.length;
    int p1 =0;
    int p2 =0;

    int pos[] = new int[n/2];
    int neg[] = new int[n/2];

    for(int i=0; i<n; i++){
        if(nums[i]>=0){
            pos[p1] = nums[i];
            p1++;
        }
        else{
            neg[p2] = nums[i];
            p2++;
        }
    }

    for(int i=0; i<n/2; i++){
        nums[i*2] = pos[i];
        nums[i*2+1] = neg[i];
    }

   return nums;
    }
}