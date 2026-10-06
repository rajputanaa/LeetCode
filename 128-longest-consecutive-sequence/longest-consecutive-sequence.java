class Solution {
    public int longestConsecutive(int[] nums) {
    
    HashSet<Integer> set = new HashSet<>();
    if(nums.length == 0) return 0;

    for(int num:nums){
        set.add(num);
    }

    int longest = 1;
    for(int num:set){

        int current = num;
        int count = 1;
        if(!set.contains(current-1)){

            while(set.contains(current+1)){
                current++;
                count++;
            }

            longest = Math.max(longest,count);
        }
    }
    return longest;


    }
}