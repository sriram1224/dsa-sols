class Solution {
    public boolean isLongPressedName(String name, String typed) {
       int p1 = 0, p2 = 0;
       int n = name.length();
       int m = typed.length();

       while(p1<n && p2<m){
           char ch = name.charAt(p1);
           int count1 = 0, count2 =0;
           while(p1<n && name.charAt(p1)== ch){
               p1++;
               count1++;

           }
           while(p2<m && typed.charAt(p2)==ch){
               p2++;
               count2++;
           }
           if(count1 > count2)
           return false;
       }
       if(p1<name.length() && p2<typed.length()){
           return false;
       }
           
        return true;
    }
}
