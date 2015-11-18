package euler;

import list.IList;
import list.singlelink.SList;


public class Problem3 {

	//600851475143 / 17= 35344204420.176470
	static IList<Long> list = new SList<Long>();
	
	public static void main(String[] args) {
		long n =600851475143L;
		long primo=1L;
		list.addFirst(2L);

		for(long i=2L; i*i<n+1;i++){
			//if(n%i==0){
				if(isPrime(i)==true && n%i==0 ){
					primo=i;
				}
			//}
		}
		System.out.println(primo);
	}
	
	public static boolean isPrime(long num){
		boolean prime=true;
		for(int j=0; list.getAt(j)*list.getAt(j)<=num; j++){
			if(num%list.getAt(j)==0){
				prime=false;
				break;
			}
		}
		if(prime==true){
			//System.out.println(num);

			list.addLast(num);
		}
		return prime;
	}
}
