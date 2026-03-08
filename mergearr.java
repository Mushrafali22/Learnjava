package Practice;

import java.util.Arrays;

public class mergearr {
    /**
     * @param num1
     * @param m
     * @param num2
     * @param n
     */
    public void merge(int[] num1,int m,int[] num2,int n){
        int i=m;
        for(int j=0;j<n;j++){
            num1[i]=num2[j];
            i++;
        }
        Arrays.sort(num1);
    }
    public static void main(String[] args) {
        mergearr obj=new mergearr();
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        obj.merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }
}
