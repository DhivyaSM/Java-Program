package Institute;
import java.util.*;

public class Count_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int value=sc.nextInt();
		while(value>0) {
			int div=value%10;
			
			value=value/10;
			sum=sum+div;
		}
		System.out.println("sum of given number is "+sum);
	}

}
