//question 1 fibonacci series




public class Fibo {

		public static void main(String[] args) {
			int arr[],c;
			
			arr=new int[8];
			arr[0]=0;
			arr[1]=1;
			
			System.out.print(arr[0]+" "+arr[1]);
			for(int i=2;i<8;i++)
			{
				arr[i]=arr[i-1]+arr[i-2];
			   System.out.print(" "+ arr[i]);
						
			}

		}

	

	}

