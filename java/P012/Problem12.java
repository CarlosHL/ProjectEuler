package euler;

import java.math.*;
public class Problem12 {

	/**x=(n*(n+1))/2
	 * @param args
	 */
	public static void main(String[] args) {
		int triangleNum;
		for(int i=1; i<1000000; i++){
			triangleNum=(i*(i+1))/2;
			int numDivisores=divisor(triangleNum);
			if(numDivisores>500){
				System.out.println("Numero triangular: "+triangleNum+ " numero de divisores "+numDivisores);
				break;
			}
		}

	}


	public static int divisor(int num){//calcula el numero de divisores
		int n=1;
		int cont=0;
		do{
			if(num%n==0) cont++;
			n++;
		}while(n*n<num);

		if(num==1) return 1;
		if((n)*(n)%num==0) return cont++*2+1;
		return cont++*2;
	}
}
