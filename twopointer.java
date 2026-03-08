package Practice;

public class twopointer {
    public int twoPointer(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int[] arr={1,2,2,3,4,5,6};

        twopointer obj=new twopointer();
        int result=obj.twoPointer(arr);

        System.out.println(result);
    }
}
