package shomeWork;

public class Variable {
	//class level
	static int a =10;
	
	public static void main(String[] args) {

		
		
		double[] a = new double[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		double sum = 0;
		for(int i=0; i<=4; i++) {
//		System.out.println(a[i]);
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
		//	//local
//		int b=20;
//		{
//			int c =30;
//			System.out.println(c);
//		}
//		
//		System.out.println(a);
//		System.out.println(b);
	}

}
