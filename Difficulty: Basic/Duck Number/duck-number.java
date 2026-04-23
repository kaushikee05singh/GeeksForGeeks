// User function Template for Java

class Solution {
    static boolean check_duck(String num) {
        // code here
        if(num.charAt(0)=='0'){
            return false;
        }
        for(int i =1; i<num.length();i++){
            if(num.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
}