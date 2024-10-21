package Interview;

import java.util.Scanner;

public class vowvles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word");
		String name= sc.nextLine();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				count++;
			}
		}System.out.println("total beautiful words is "+count);
	}

}
