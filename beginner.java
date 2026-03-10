package Practice;

public class beginner {
      /*10 Basic of java */
    public static void printHelloWorld(){
        String result = "Hello World";
        System.out.println("1.print hello world : " + result);
    }
    public void sumOfNo(int a,int b){
        int res=a+b;
        System.out.println("2. Sum of number : " + res);
    }
    public int oddOrEven(int a1,int a2){
        if(a1%2==0){
            return a1;
        }
        else{
            return a2;
        }
    }
    public int threeLargeNo(){
        int b1=10;
        int b2=20;
        int b3=30;
        if(b1<b2 && b3<b2){
            return b2;
        }
        else if(b1<b3 && b2<b3){
            return b3;
        }
        else{
            return b1;
        }
    }
    public int factorical(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public void reverseNum(){
        int n=12345;
        int reverse=0;
        while(n!=0){
            int lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        System.out.println("6. Reversenumber : " + reverse);
    }
    public boolean palindrone(int n){
        int original=n;
        int reverse=0;
        while(n!=0){
            int lastDigit=n%10;
            reverse=reverse*10+lastDigit;
            n=n/10;
        }
        if(reverse==original){
            return true;
        }
        return false;
    }
    public void multipleTable(){
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println("8. Multiple table : " + n + "*" + i + "=" + n*i );
        }
    }
    public void sumArray(){
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("9. SumofArray : " + sum);
    }
    public void maxArray(){
        int[] arr={14,7,21,01,82};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("10.maxArray : " + max);
    }
    /**
     * @param args
     */
    public static void main (String []args){
        beginner obj=new beginner();
        printHelloWorld();
        obj.sumOfNo(10, 20);
        System.out.println("3.Odd or even : " + obj.oddOrEven(20, 10));
        System.out.println("4. Bignumber : " + obj.threeLargeNo());
        System.out.println("5. Factorial : " + obj.factorical(5));
        obj.reverseNum();
        System.out.println("7. Palindrone : " + obj.palindrone(121));
        obj.multipleTable();
        obj.sumArray();
        obj.maxArray();
    }
}
