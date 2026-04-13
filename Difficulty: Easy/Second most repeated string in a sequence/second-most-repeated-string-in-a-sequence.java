// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
         HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0, secondMax = 0;

        for (int freq : map.values()) {
            if (freq > max) {
                secondMax = max;
                max = freq;
            } else if (freq > secondMax && freq < max) {
                secondMax = freq;
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) == secondMax) {
                return key;
            }
        }

        return "";
    }
}