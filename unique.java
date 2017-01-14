import java.util.Scanner;
class unique
{
	public static void main(String K[])
	{
		int num,temp,count=0,i,j,temp1,flag=0,temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NO.\n");
		num = sc.nextInt();
		if(num%10 == 0)
		System.out.println("NO. IS NOT UNIQUE........ hahahhahha");
		else
		{
			temp2 = num;
			while(temp2>0)
			{
				count = count+1;
				temp2 = temp2/10;
			}
			for(i=count; i>=1; i--)
			{
				temp1 = num;
				temp = num%10;
				for(j=(i-1); j>=1; j--)
				{
					temp1 = temp1/10;
					if(temp != (temp1%10))
					continue;
					else
					{
						flag = 1;
						break;
					}
				}
				num = num/10;
			}
			if(flag == 0)
			System.out.println("UNIQUE NO.");
			else
			System.out.println("NO. IS NOT UNIQUE..... hahahhaha");
		}
	}
}