class Solution {
    public int[] intersection(int[] nums1, int[] nums2){

        HashSet<Integer> set = new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int k=0;
        int[] arr = new int[result.size()];
        
            for(int num:result){
                arr[k] = num;
                k++;
            }
    return arr;
    }
}