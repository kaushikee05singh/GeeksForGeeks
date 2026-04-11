// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String small = arr[0];
        for(String s:arr){
            if(s.length()<small.length()){
                small = s;
            }
        }
        StringBuilder str = new StringBuilder(small);
        while(str.length()>0){
            boolean found=true;
            for(int i =0; i<arr.length;i++){
                if(!arr[i].startsWith(str.toString())){
                    found=false;
                    break;
                }
            }
            if(found){
                return str.toString();
            }
            str.deleteCharAt(str.length()-1);
        }
        return "";
    }
}