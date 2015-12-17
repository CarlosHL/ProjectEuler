package euler;
import java.math.BigInteger;;

public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger f1=new BigInteger("1");
		BigInteger f2=new BigInteger("1");
		BigInteger comodin=new BigInteger("1");

		BigInteger ten=new BigInteger("10");


		BigInteger potencia=new BigInteger("10");

		for(int i=2;i<1000;i++){
			potencia=potencia.multiply(ten);
		}
		int cont=2;
		int sol=-1;
		while(sol<0){
			comodin=f1;
			f1=f1.add(f2);
			f2=comodin;
			sol = f1.compareTo(potencia);
			cont++;
		}
		System.out.println(" contador: "+ cont);
	}

}
