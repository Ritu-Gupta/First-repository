import java.util.Scanner;
class harshad
{
	public static void main(String K[])
	{
		int num,temp,add=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NO.\n");
		num = sc.nextInt();
		temp = num;
		while(num>0)
		{
			add = add+(num%10);
			num = num/10;
		}
		if(temp%add == 0)
		System.out.println("HARSHAD NO.!!!!!");
		else
		System.out.println("NO. IS NOT HARSHAD..........hahahahahha");
	}
}