// User function Template for Java

class Sol {
    Boolean check(String s) {
        // your code here
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int i =1; i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}