package euler;
import java.math.BigInteger;

public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger num=new BigInteger("2");
		BigInteger potencia=new BigInteger("2");
		BigInteger cero=new BigInteger("0");
		BigInteger diez=new BigInteger("10");
		int comparable=2;



		for(int i=1; i<1000;i++){
			num=num.multiply(potencia);
		}
		System.out.println(num);
		BigInteger sumatorio=new BigInteger("0");

		BigInteger resto=new BigInteger("0");

		while(comparable!=0){
			resto= num.remainder(diez); //esto es %
			num=num.divide(diez); //esto es /
			sumatorio=sumatorio.add(resto);
			comparable=num.compareTo(cero);
		}
		System.out.println(sumatorio);




	}

}
