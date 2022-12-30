package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		{
		int[] a= {1,4,8,2,9,7};
		int[] b= {1,2,6,4,9,7};
		System.out.print("The intersected value is ");
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {

				System.out.print(" "+a[i]);
			}

		}
		}
	}


	}

}
