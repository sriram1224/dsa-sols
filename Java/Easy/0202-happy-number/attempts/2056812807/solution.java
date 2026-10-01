class Solution {
    public boolean isHappy(int n) {
    int fast = n;
    int slow = n;

    do{
    slow = findSqure(slow);
    
    fast = findSqure(findSqure(fast));

    
    }while(slow!=fast);
if(slow == 1) return true;
    return false;

    }

    public int findSqure(int n){
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans += temp* temp;
            n /= 10;
        }

        return ans;
    }
}