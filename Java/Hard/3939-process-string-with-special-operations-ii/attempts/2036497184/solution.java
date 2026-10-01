class Solution {
    public char processStr(String s, long k) {
    StringBuilder sb = new StringBuilder();

    for(char ch: s.toCharArray()){
        if(ch=='*'){
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length()-1);
        }
        }
        else if(ch == '#'){
            if (sb.length() > 0) {
                sb.append(sb);
            }
        }
        else if(ch == '%'){
            if (sb.length() > 0) sb.reverse();
        }
        else if(Character.isLetter(ch) && Character.isLowerCase(ch)){
            sb.append(ch);
        }
        else{
            continue;
        }


    }
    return (k>=0 && sb.length()>k) ? sb.charAt((int) k): '.';

 

    }

}