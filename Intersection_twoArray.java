package Institute;

public class Intersection_twoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1= {1,3,10,5,7,9,13,67,98,900,2};
		int[] a2= {3,5,6,7,8,101,900,67,23};
		System.out.println("the intersection of two array is");
		for(int i=0;i<a1.length;i++) {
			int count=0;
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					count++;
				}
				
			}if(count>0) {
				System.out.print(a1[i]+" ");
			}
			
		}
	}

}
