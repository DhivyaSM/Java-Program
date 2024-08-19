package Institute;

public class Array_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_question aq=new Array_question();
		
		aq.sorting();
		aq.palindrome();
}

	private void palindrome() {
		// TODO Auto-generated method stub
		String given_String="dhivya";
		String reverse="";
		boolean check=false;
		for(int i=given_String.length()-1;i>=0;i--) {
			reverse =reverse+given_String.charAt(i);
		}
			if(given_String.equals(reverse)) {
				check=true;
			}
			System.out.println(given_String);
		if(check==true) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is  not palindrome");
		}
	}
	
	public void sorting() {
		int list[]= {2,4,7,5,6,8,9,7,89,170};
		System.out.println("before sotring ");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		int temp=0;
		for(int i=0;i<list.length-1;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}System.out.println();
		System.out.println("after sorting");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}

	}

