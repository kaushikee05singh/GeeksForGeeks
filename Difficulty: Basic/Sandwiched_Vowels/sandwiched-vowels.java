// User function Template for Java

class Complete {

    public static String Sandwiched_Vowel(String s) {
        // Complete function
        if(s.length()<3){
            return s;
        }
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        for(int i =1; i<s.length()-1;i++){
             char l = s.charAt(i-1);
             char r = s.charAt(i+1);
             char c = s.charAt(i);
             
              if(l != 'a' && l != 'e' && l != 'i' && l != 'o' && l != 'u'){
                 if(r != 'a' && r != 'e' && r != 'i' && r != 'o' && r != 'u'){
                     if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                            continue;
                     }
                }
            }
            res.append(c);
        }
        res.append(s.charAt(s.length()-1));
        return res.toString();
    }
}
