import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int a= n%100;
    int b= a%10;
    int c= a/10;
    int d= n/100;
    int e= (b*100+c*10+d);
    System.out.println(e);
    
  }
}