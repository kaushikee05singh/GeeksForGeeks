// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        String res="";
        for(char c='a';c<='z';c++){
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)==c){
                    res+=c;
                }
            }
        }
        return res.toString();
    }
}