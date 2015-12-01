package euler;

public class Problem10 {

	/** 1179908154
	 * @param args
	 */
	static int contador=1;
	
	public static void main(String[] args) {
		int sum=0;

		for(int i=1; i<2000000; i++){
			if(isPrime(i)){
				System.out.println("Es primo " + i);
				sum=sum+i;
			} 
		}
		System.out.println("Sumatorio: "+ sum);
	}


	   public static boolean isPrime(int numero){
	        int contador = 2;
	        boolean primo=true;
	        while ((primo) && (contador!=numero)){
	          if (numero % contador == 0)
	            primo = false;
	          contador++;
	        }
	        return primo;
	      }

}
