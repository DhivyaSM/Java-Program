package Interview;

import java.util.Scanner;

public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the number");
		int val=sc.nextInt();
		int squre=val*val;
		String value= String.valueOf(squre);
		int mid=value.length()/2;
		System.out.println("Squere value "+value);
		String f=value.substring(0,mid);
		String l=value.substring(mid, value.length());
		System.out.println("fist value "+f);
		System.out.println("last value "+l);
		int first=Integer.parseInt(f);
		int last=Integer.parseInt(l);
		int sum=first+last;
		System.out.println(sum);
		if(val==sum) {
			System.out.println("it is a kaprekar number");
		}else {
			System.out.println("it is not kaprekar number");
		}
		
		
		
	}

}
