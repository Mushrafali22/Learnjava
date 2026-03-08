package Practice;

public class condition {
    public static void main(String[] args) {
      double Total_Marks=426;
      String Grade;
      double Prev=(Total_Marks/500)*100;
      if((Prev>=80)){
          Grade="A";
      }
      else if((Prev>=70) && (Prev<=80)){
        Grade="B";
      }
      else if((Prev>=60) && (Prev<=70)){
        Grade="C";
      }
      else{
        Grade="D";
      }

      System.out.println("Precentage Mark :"+Prev);
      System.out.println("Grade"+Grade);
    }
}
