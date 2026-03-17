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
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    public void display(){
        if(size==0){
            System.out.println("Array is empty");
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void insertAtPos(int pos,int val){
        if(size==capacity){
            enlargeArray();
        }
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        size++;
    }

    public void deleteAtPos(int pos){
        for(int i=pos+1;i<size-1;i++){
            arr[i-1]=arr[i];
        }
        size--;

        if(capacity>intialcapacity && capacity > 3*size){
            ShrinkArray1();
        }
    }

    private void ShrinkArray1() {
       capacity/=2;
       arr=java.util.Arrays.copyOf(arr,capacity);
    }

    public void deleteFinal(){
        if(size==0){
            System.out.println("Array is empty");
        }
        size--;
        if(capacity>intialcapacity && capacity > 3*size){
            ShrinkArray1();
        }
    }

    public void deleteFirst(){
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
}

public class arrayimplementation {
    public static void main(String[] args) {
        int val,pos,index;
        dynamicArray list = new dynamicArray();
        Scanner sc=new Scanner(System.in);
        while (true) {
        System.out.println("\n -------- List Menu --------\n");
        System.out.println("1. Insert Data");
        System.out.println("2. Display Data");
        System.out.println("3. Insert at Specfic location");
        System.out.println("4. Delete at Specfic Location");
        System.out.println("5. Delete at end");
        System.out.println("6. Delete from beginning");
        System.out.println("7. insert at beginning");
        System.out.println("8. get the index");
        System.out.println("9. update the index");
        System.out.println("10. Search the index");
        System.out.println("11. Exit");
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
                   list.insertAtPos(pos,val);
                   break;
            case 4:System.out.println("Enter the Postion to be delete : ");
                   pos=sc.nextInt();
                   if(pos<0){
                    System.out.println("Invalid Postion");
                    break;
                   }
                   list.deleteAtPos(pos);
                   break;
            case 5:System.out.println("Delete the final element");
                   list.deleteFinal();
                   break;
            case 6:System.out.println("Delete from Beginning");
                   list.deleteFirst();
                   break;
            case 7:System.out.println("Insert at Beginning");
                   System.out.println("Enter the Value : ");
                   val=sc.nextInt();
                   //list.insertFirst();
                   break;
            case 8:System.out.println("Get the Index");
                   //list.getIndex();
                   break;
            case 9:System.out.println("Update at index");
                   index=sc.nextInt();
                   if(index<0){
                    System.out.println("Invalid Index");
                    break;
                   }
                   System.out.println("Enter the Data : ");
                   val=sc.nextInt();
                   //list.updateIndex(pos,val);
                   break;
            case 10:System.out.println("Search the Index");
                    System.out.println("Enter the Data : ");
                    val=sc.nextInt();
                    //list.search(val);
                    break;
            case 11:System.exit(0);    
            default:System.out.println("Invalid Choice");
                break;
            }
        }
    }
}
