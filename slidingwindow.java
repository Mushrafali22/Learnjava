package Practice;

import java.util.HashSet;

public class slidingwindow {
    /*Fixed Size sliding window - max sum subarray of size K */
    public static int maxSum(int[] arr,int k){
        int windowSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum+=arr[i];
            windowSum-=arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    /*Fixed Size sliding window - find avg of sudarray of size K */
    public static void findavg(int[] arr1,int n){
        int windowSum1=0;
        for(int i=0;i<n;i++){
            windowSum1+=arr1[i];
        }
        for(int i=n;i<=arr1.length;i++){
            System.out.println((double)windowSum1/n);
            if(i==arr1.length) break;
            windowSum1+=arr1[i]-arr1[i-n];
        }
    } 
    /*Variable Size sliding window - smallest subarray with sum<=target */
    public static int smallestarray(int[] arr2,int target){
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        for(int right=0;right<arr2.length;right++){
            sum+=arr2[right];
            while(sum>=target){
                minlength=Math.min(minlength,right-left+1);
                sum-=arr2[left];
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE ? 0 : minlength;
    }
    /*Variable Size sliding window - long substring without repeat char */
    public static int longrepeatcahr(String s){
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength=Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }    
    public static void main(String []args){
        int[] arr={2,1,5,1,3,2};
        int[] arr1={1,3,2,6,-1,4,1,8,2};
        int[] arr2={2,3,1,2,4,3};
        int target=7;
        int k=3;
        int n=5;
        System.out.println(maxSum(arr, k));
        findavg(arr1, n);
        System.out.println(smallestarray(arr2, target));
        System.out.println(longrepeatcahr("abcabcbc"));
    }
}
