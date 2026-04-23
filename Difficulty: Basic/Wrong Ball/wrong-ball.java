// User function Template for Java

class Solution {
    public int countWrongPlacedBalls(String s) {
        // code here.
        int count=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='R' && (i+1)%2==0 || s.charAt(i)=='B' && (i+1)%2!=0 ){
                count++;
            }
        }
        return count;
    }
}