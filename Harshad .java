import java.util.Scanner;
public class Harshad {

	public static void main(String[] args) {
		int n;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number");
	     n=sc.nextInt();
	     int temp=n;
	     int sum=0;

	     while(temp>0)
	     {
	    	 sum+=temp%10;
	    	 temp=temp/10;
	     }
	  
	     System.out.println(sum);
	   
		if(n%2==0)
		{
			System.out.println(" completely divisible ");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

}