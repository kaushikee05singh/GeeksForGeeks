// User function Template for Java

class Solution {
    ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int count=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) !=' '){
                count++;
            }
            else{
                res.add(count);
                count=0;
            }
        }
        res.add(count);
        return res;
    }
}
