import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      int res=gcd_of_no(n1,n2);
      System.out.print(gcd_of_no(res,n3));
    }
  public static int gcd_of_no(int num1,int num2)
  {
    int min_no,gcd=0;
    if(num1<num2)
    {
    min_no=num1;
    }
    else
    {
      min_no=num2;
    }
    while(min_no>=1)
    {
      if((num1%min_no==0)&&(num2%min_no==0))
      {
        gcd=min_no;
        break;
      }
    min_no--;
    }
    return gcd;
  }
}
         