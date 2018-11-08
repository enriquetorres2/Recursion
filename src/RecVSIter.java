
public class RecVSIter {
	
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(fiboR(30));
		t = System.currentTimeMillis() - t;
		System.out.println("Recursive: "+t);
		t = System.currentTimeMillis();
		System.out.println(fiboI(30));
		t = System.currentTimeMillis() - t;
		System.out.println("Iterative: "+t);
	}

	public static int factR(int n) {
		if (n==0||n==1)return 1;
		return n*factR(n-1);
	}
	public static int factI(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = i*result;
		}
		return result;
	}
	public static int fiboR(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		return fiboR(n-1)+fiboR(n-2);
	}
	public static int fiboI(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		int val1 = 1;
		int val2 = 0;
		int result = 0;
		for(int i = 2; i <=n; i++) {
			result = val1 + val2;
			val2 = val1;
			val1 = result;
			//result = temp;
		}
		return result;
	}
}
