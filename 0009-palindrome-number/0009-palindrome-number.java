class Solution {
    public boolean isPalindrome(int x) {
        int a=x, rev=0;
        
        while(x>0){
            int b = x%10;
            rev = rev*10 + b;
            x = x/10;
        }
        
        if(rev==a){
            return true;
        }
        
        return false;
        
    }
}