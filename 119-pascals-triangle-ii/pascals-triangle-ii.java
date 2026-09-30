class Solution {
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,1);

        long ans=1;
        int n = rowIndex+1;
        for(int i=1; i<n; i++){
            ans = ans*(n-i) / i ;
            arr.add((int)ans);
        }
        return arr;

    }
}