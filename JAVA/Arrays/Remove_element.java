import java.util.Scanner;
class Remove_element{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5};
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Remove element : ");
		int re = s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==re)
			{
				a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
