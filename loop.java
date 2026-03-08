package Practice;

public class loop {
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<=10;i++){
                System.out.println(i);
        }                
        while(i<=10){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(i);
            i++;
        }
        while(i%2==0);        
    }   
}
