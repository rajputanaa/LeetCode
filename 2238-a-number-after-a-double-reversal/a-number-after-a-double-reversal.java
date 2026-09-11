class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num<0) return false ;

        int orig = num;
        int revOnce = 0;
        int revTwice = 0;

        while(num >0){
            int digit = num%10;
            revOnce = (revOnce*10) +digit;
            num = num/10;
        }

        while(revOnce >0){
            int digit = revOnce%10;
            revTwice = (revTwice*10) + digit;
            revOnce = revOnce/10;
        }

        return orig==revTwice;

    }
}