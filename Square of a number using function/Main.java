import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sod=square_of_no(n);
      System.out.print(sod);
    }
  public static int square_of_no(int num)
  {
    int res=num*num;
    return res;
  } 
}