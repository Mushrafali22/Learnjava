package Practice;
import java.util.*;
public class twopointer {
    /* Oppsite Two pointer  */
    public static void twoPointer(int[] arr,int traget){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==traget){
                System.out.println(arr[left] + "," + arr[right]);
                return;
            }
            else if(sum<traget){
                left--;
            }
            else{
                right--;
            }
        }
    }
    /*Same direction two pointer */
    public static int duplicatearr(int[] arr1){
        int i=0;
        for(int j=1;j<arr1.length;j++){
            if(arr1[i]!=arr1[j]){
                i++;
                arr1[i]=arr1[j];
            }
        }
        return i+1;
    } 
    /*Palindrone String */
    public static boolean isPalindrone(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    /*Move zero */
    public static int Movezero(int[] arr2){
        int i=0;
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]!=0){
                int temp=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=temp;
                i++;
            }
        }
        return i;
    }
    /*threeSum */
    public static List<List<Integer>> threeSum(int[] arr3){
        Arrays.sort(arr3);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr3.length-2;i++){
            if(i>0 && arr3[i]==arr3[i-1]) continue;
            int left=i+1;
            int right=arr3.length-1;
            while(left<right){
                int sum = arr3[i]+arr3[left]+arr3[right];
                if(sum==0){
                    result.add(Arrays.asList(arr3[i],arr3[left],arr3[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr={1,2,2,3,4,5,6};
        int[] arr1={1,1,2,2,3,3,4};
        int[] arr2={0,1,0,2,13};
        int[] arr3={-1,0,1,2,-1,-4};
        String s="like";
        twoPointer(arr,6);
        int result=duplicatearr(arr1);
        int result2=Movezero(arr2);
        for(int i=0;i<result;i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println(isPalindrone(s));
        for(int i=0;i<result;i++){
            System.out.println(arr2[i]+" ");
        }
        System.out.println(threeSum(arr3));
    }
}
