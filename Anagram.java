package Institute;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		Anagram an=new Anagram();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
		String name=sc.next();
		char[] fir_val=an.Anagram(name);
		System.out.println("enter the second name");
		String name1=sc.next();
		char[] sec_val=an.Anagram(name1);
		int len=fir_val.length>sec_val.length?fir_val.length:sec_val.length;
		
		for(int i=0;i<len;i++) {
			if(fir_val[i]!=sec_val[i]) {
				System.out.println("it is not a anagram");
				break;
			}else {
				count++;
			}
		}if(count==len) {
			System.out.println("it is a Anagram value");
		}
		
		
	}

	private char[] Anagram(String name1) {
		// TODO Auto-generated method stub
		String name=name1;
		char temp;
		char[] dup=name.toCharArray();
		for(int j=0;j<=dup.length;j++) {
      	for(int i=0;i<dup.length-1;i++) {
			if((dup[i]>dup[i+1])) {
				temp=dup[i];
				dup[i]=dup[i+1];
				dup[i+1]=temp;
				
			}}
	}
		
			return dup;
	}

}
