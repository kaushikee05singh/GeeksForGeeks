// User function Template for Java

class Solution {
    String firstAlphabet(String s) {
        // code here
        String res = "";
        res += s.charAt(0);
        for(int i =1;i<s.length();i++){
            if(s.charAt(i-1)==' '){
                res+= s.charAt(i);
            }
        }
        return res;
    }
};