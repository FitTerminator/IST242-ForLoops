import java.util.Scanner;
public class LabProgram {
  private static Scanner sc;
  public static void main(String[] args) 
  {
    int n, i;
    System.out.println("Enter an integer: ");
    sc = new Scanner(System.in);
    System.out.print("Sequence: ");
    n = sc.nextInt();
    for(i = n; i >= 1; i--)
    {
   if(i%2==0)
System.out.print(i +" "); 
}
   if (i <= 0)
   n = 0;
    System.out.print(n);
  }
}
