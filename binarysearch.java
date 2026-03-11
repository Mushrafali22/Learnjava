package Practice;

public class binarysearch {
    /*binarysearch */
    public static int binarysearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    /*Recursion binarysearch */
    public static int binarysearch1(int[] arr1,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(arr1[mid]==target){
            return mid;
        }
        if(arr1[mid]<target){
            return binarysearch1(arr1,mid+1,right, target);
        }
        return binarysearch1(arr1, left, mid-1, target);
    }
    /*firts occurence of element */
    public static int fooe(int[] arr2,int tar){
        int left=0;
        int right=arr2.length-1;
        int result=-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr2[mid]==tar){
                result=mid;
                right=mid-1;
            }
            else if(arr2[mid]<tar){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
    /*Square root of binary search */
    public static int square(int x){
        int left=1;
        int right=x;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={1,2,2,2,3,4,1,2,3};
        int target=8;
        int result=binarysearch(arr, target);
        System.out.println(result);
        System.out.println(binarysearch1(arr1,0, arr1.length-1, 8));
        System.out.println(fooe(arr2, 2));
        System.out.println(square(25));
    }
}
