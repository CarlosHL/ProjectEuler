package euler;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fib1=1;
		int fib2=1;
		int sum=0;
		int resultado=0;
		while(fib1<4000000 || fib2<4000000){
			sum=fib1 + fib2;
			if(sum%2==0) resultado=resultado+sum;
			fib2=fib1;
			fib1=sum;
		}
		System.out.println(resultado);

			

	}

}
