public class evenodd {

	public static void main(String[] args) {
		int arr[]= {10,23,56,65,78,9};
		int Count1=0;
		int Count2=0;
		
		for(int i=0;i<6;i++)
		{
			if(arr[i]%2==0)
			{
				Count1++;
			}
			else {
				Count2++;
			}
		}
		System.out.println("Even Numbers : "+Count1);
		System.out.println("Odd Numbers : "+Count2);
	}

}