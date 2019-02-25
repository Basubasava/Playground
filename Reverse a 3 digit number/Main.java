import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,f,s,l,res;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
    f=(n/100);
    s=((n/10)%10);
    l=(n%10);
    res=((l*100)+(s*10)+f);
      System.out.println(res);
	
  }
}