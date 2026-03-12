package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class prefixsum {
    /*Prefix sum of range */
    public static void prefixsum(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int k=1;k<n;k++){
            prefix[k]=prefix[k-1]+arr[k];
        }
        int i=1;
        int j=3;
        int sum=prefix[j]-(i>0 ? prefix[i-1] : 0);
        System.out.println(sum);
    }
    /*Prefix sum */
    public static int[] presum(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    /*Prefix sum Range sums */
    public static int[] rangesum(int[] arr,int[][] querie){
        int n=arr.length;
        int[] prefix=new int[n];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int[] result=new int[querie.length];
        for(int k=0;k<querie.length;k++){
            int i=querie[k][0];
            int j=querie[k][1];
            result[k]=prefix[j]-(i>0 ? prefix[i-1] : 0);
        }
        return result;
    }
    /*Prefix sum - maximum sum of array */
    public static int maxsum(int[] arr,int k){
        int n=arr.length;
        int[] prefix= new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=prefix[i+k-1]-(i>0 ? prefix[i-1] : 0);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
    /*Prefix sum - number of sum of array with subarray K */
    public static int summax(int[] arr1, int k){
        int prefix=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num : arr1){
            prefix+=num;
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int[][] querie ={{0,2},{1,3},{2,4}};
        int[] arr1={1,1,1,2,2};
        prefixsum(arr);
        System.out.println(Arrays.toString(presum(arr)));
        System.out.println(Arrays.toString(rangesum(arr, querie)));
        System.out.println(maxsum(arr, 3));
        System.out.println(summax(arr, 2));
    }
}
