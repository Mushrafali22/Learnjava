package Practice;

public class twopointer {
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
    public static void main(String args[]){
        int[] arr={1,2,2,3,4,5,6};
        twoPointer(arr,6);
    }
}
