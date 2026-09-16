class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> result = new  HashSet<>();

        for(int num:nums){
            result.add(num);
        }

        if(nums.length == result.size()){
            return false;
        }
        return true; 
    }
}