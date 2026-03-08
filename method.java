package Practice;

public class method {
    static int studentCount=0;
    String name;

    public void Method(String name){
        this.name=name;
        studentCount++;
    }

    public void studentName(String name){
        System.out.println("Studnet name:"+name);
    }

    public void studentCountInfo(){
        System.out.println("Student count:"+studentCount);
    }

    public static void main(String[] args) {
       method sc1 = new method();
       method sc2 = new method();

       sc1.studentName("Hello");
       sc2.studentName("World");
       method method = new Practice.method();
       method.studentCountInfo();
    }
}
