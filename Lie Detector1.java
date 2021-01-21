import java.util.*;
public class Source {

   public static void main(String[] args) {

      int X,Y;
      Scanner input= new Scanner(System.in);
      X=input.nextInt();
      Y=input.nextInt();
      boolean test;
      test=(X+Y)>30;
      System.out.println("The statement said by the person is "+test);
   }
}
