class Solution {
    public int[] rearrangeArray(int[] nums) {

        /********* First approach ***********/

//     int n = nums.length;
//     int p1 =0;
//     int p2 =0;

//     int pos[] = new int[n/2];
//     int neg[] = new int[n/2];

//     for(int i=0; i<n; i++){
//         if(nums[i]>=0){
//             pos[p1] = nums[i];
//             p1++;
//         }
//         else{
//             neg[p2] = nums[i];
//             p2++;
//         }
//     }

//     for(int i=0; i<n/2; i++){
//         nums[i*2] = pos[i];
//         nums[i*2+1] = neg[i];
//     }

//    return nums;


/**************** second approach *****************/

    int pos =0;
    int neg =1;
    int ans[] = new int[nums.length];

    for(int i=0; i<nums.length; i++){
    if(nums[i]>=0){
        ans[pos] = nums[i];
        pos+=2;
    }
    else{
        ans[neg] = nums[i];
        neg+=2;
    }
    }
    return ans;




    }
}




