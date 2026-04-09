// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        // your code here
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<S.length();i++){
            char c= S.charAt(i);
            if(i<S.length()-1 && c==S.charAt(i+1)){
                continue;
            }
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int num:map.values()){
            if(num==N){
                count++;
            }
        }
        return count;
    }
}