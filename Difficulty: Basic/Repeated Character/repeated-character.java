// User function Template for Java
class Solution {
    char firstRep(String s) {
        // your code here
        int n =s.length();
        for(int i =0; i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return '#';
    }
}