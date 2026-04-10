class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int n =arr.length;
        if(n<3){
            return -1;
        }
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;
        for(int i =0; i<n;i++){
            if(arr[i]>max1){
                max3= max2;
                max2= max1;
                max1= arr[i];
            }
            else if(arr[i]>max2 ){
                max3= max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 ){
                max3=arr[i];
            }
        }
        return max3;
    }
}