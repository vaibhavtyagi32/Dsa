package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newArr[]=new int[n+m];
        int left=0;
        int right=0;
        int i=0;
        while(left<m&&right<n){
            if(nums1[left]<=nums2[right]){
                newArr[i]=nums1[left];
                left++;
                i++;
            }
            else{
                newArr[i]=nums2[right];
                right++;
                i++;
            }
        }
        while(left<m){
            newArr[i++]=nums1[left++];
        }
        while(right<n){
            newArr[i++]=nums2[right++];
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=newArr[j];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        int m=a.length;
        int n=b.length;
        merge(a,m,b,n);
    }
}
