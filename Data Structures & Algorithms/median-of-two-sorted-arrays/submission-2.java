class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length+nums2.length];
        int k=0;

        for(int i=0;i<nums1.length;i++){
            arr[k++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[k++]=nums2[j];
        }
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            return (arr[n/2]+arr[n/2-1])/2.0;
        }else{
            return arr[n/2];
        }
    }
}
