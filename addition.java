import java.util.Scanner;
public class addition {
  public static void main(String[] args) {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter Two Numbers :");
   int n1, n2, n3;
   n1 = readme.nextInt();
   n2 = readme.nextInt();
   n3 = n1 + n2;
   System.out.println("Total = " + n3);
  }
}
