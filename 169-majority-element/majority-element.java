class Solution {
    public int majorityElement(int[] nums) {

    int el =  nums[0];
    int count=0;

    for(int i=0; i<nums.length;i++){

        if(count==0){
            count=1;
            el = nums[i];
        }
        else if(nums[i] == el){
            count++;
        }
        else{
            count--;
        }
    }
    int count1 = 0;
    for(int i=0;i<nums.length; i++){
        if(nums[i] == el ){
            count1++;
        }
        if(count1>nums.length/2){
            return el;
        }
    }

    
return -1;




    // HashMap<Integer,Integer> map = new HashMap<>();

    // for(int num : nums){
    //     map.put(num , map.getOrDefault(num,0) +1);
    // }

    // for(int num:nums){
    //     if(map.get(num)>nums.length/2){
    //         return num;
    //     }
    // }
    // return -1;           


     
    }
}