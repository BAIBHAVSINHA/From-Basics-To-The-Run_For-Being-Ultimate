import java.util.Scanner;
class Source {
  public static void main(String[] args) {
    int myAge;
    int ageOfBrother;
    Scanner sc = new Scanner(System.in);
    myAge = sc.nextInt();
    ageOfBrother = sc.nextInt();
    if(myAge<25 && ageOfBrother<25)
    {
        System.out.print("true");
    }
    else
    {
        System.out.print("false");
    }
  }
}
