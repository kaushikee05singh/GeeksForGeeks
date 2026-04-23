class Solution {
    String removeSpaces(String s) {
        // code here
        String res="";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                res+= s.charAt(i);
            }
        }
        return res;
    }
}