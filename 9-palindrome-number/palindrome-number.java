class Solution {
    public boolean isPalindrome(int n) {
 if(n<0) return false;
       
        
        int org = n;
        int revNum = 0;
        
        while(n>0){
            
            int digit = n%10;
            revNum = (revNum*10) + digit;
            n = n/10;
        }
        
        return org==revNum;
        
  
    }
}