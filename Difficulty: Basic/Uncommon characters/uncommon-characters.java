// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        TreeSet<Character> result = new TreeSet<>(); 
        for(char ch : s1.toCharArray()){
            set1.add(ch);
        }
        for(char ch : s2.toCharArray()){
            set2.add(ch);
        }
        for(char ch : set1){
            if(!set2.contains(ch)){
                result.add(ch);
            }
        }

        for(char ch : set2){
            if(!set1.contains(ch)){
                result.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : result){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}