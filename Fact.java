
import java.util.Scanner;
class Fact{
    public int fact(int no)
	{
      if (no==1)
			return 1;
	 else
			return no*fact(no-1);
	}
	Scanner sc=new Scanner(System.in);
	int no,n,flag=0;//no
	System.out.println("Enter number");
    no=sc.nextInt();
    for(n=1;n<=no;n++)
	{
	 if (no==fact(n))
		{
		System.out.println(n);
		flag=1;//yes
	    }
    }
	if(flag==0)
	System.out.println(n);
}
}