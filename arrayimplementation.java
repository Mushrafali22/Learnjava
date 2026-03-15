package Practice;

import java.util.Scanner;
class dynamicArray{
    private static final int intialcapacity=16;
    private int[] arr;
    private int capacity;
    int size;

    dynamicArray(){
        size=0;
        arr=new int[intialcapacity];
        capacity = intialcapacity;
    }

    public void add(int val){
        if(capacity==size){
            enlargeArray();
        }
        arr[size++]=val;
    }
    private void enlargeArray(){
        capacity*=2;
        java.util.Arrays.copyOf(arr, capacity);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class arrayimplementation {
    public static void main(String[] args) {
        int val,pos;
        dynamicArray list = new dynamicArray();
        Scanner sc=new Scanner(System.in);
        while (true) {
        System.out.println("\n -------- List Menu --------\n");
        System.out.println("1. Insert Data");
        System.out.println("2. Display Data");
        System.out.println("3. Insert at Specfic location");
        System.out.println("4. Delete at Specfic Location");
        System.out.println("5. Exit");
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Enter the choice : \n");
        int chioce = sc.nextInt();
        switch (chioce) {
            case 1:System.out.println("Enter the Data : ");
                val=sc.nextInt();
                list.add(val);
                break;
            case 2:list.display();
                break;
            case 3:System.out.println("Enter the Postion to be insert : ");
                   pos=sc.nextInt();
                   if(pos<0){
                    System.out.println("Invalid Postion");
                    break;
                   }
                   System.out.println("Enter the Data : ");
                   val=sc.nextInt();
                  // list.insertAtPos(pos,val);
                   break;
            case 4:System.out.println("Enter the Postion to be insert : ");
                   pos=sc.nextInt();
                   if(pos<0){
                    System.out.println("Invalid Postion");
                    break;
                   }
                 //1  list.deleteAtPos(pos);
                   break;
            case 5:System.exit(0);    
            default:System.out.println("Invalid Choice");
                break;
            }
        }
    }
}
