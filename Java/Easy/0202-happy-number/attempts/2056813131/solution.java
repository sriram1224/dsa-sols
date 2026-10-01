class Solution {
    public boolean isHappy(int n) {
    int fast = n;
    int slow = n;

    do{
    slow = findSqure(slow);
    
    fast = findSqure(findSqure(fast));

    if(slow == 1) return true;
    }while(slow!=fast);

    return false;;

    }

    public int findSqure(int n){
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans += temp* temp;
            n = n/10;
        }

        return ans;
    }
}