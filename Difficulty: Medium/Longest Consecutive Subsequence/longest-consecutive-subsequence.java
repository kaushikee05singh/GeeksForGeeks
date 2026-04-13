class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length;i++){
            set.add(arr[i]);
        }
        int length=0;
        for(int num: set){
            if(!set.contains(num -1)){
                int count=0;
                while(set.contains(num+count)){
                count++;
                }
                length= Math.max(count,length);
            }
        }
        return length;
    }
}