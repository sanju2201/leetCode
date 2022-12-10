class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i=i+2){
            char ch=s.charAt(i);
            sb.append(ch);

            if(i+1<n){
            int x=s.charAt(i+1);
            sb.append((char)(s.charAt(i)+x-'0'));
            }
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/replace-all-digits-with-characters/description/
