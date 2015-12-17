package euler;
import java.math.*;


public class Problem29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { //array: 99*99 = 9801;
		BigInteger[] array= new BigInteger[9801];
		int cont= 0;


		for(int i=2;i<101;i++){
			BigInteger dos= new BigInteger("2");
			BigInteger uno= new BigInteger("1");

			for(int j=2; j<101; j++){
				array[cont]=dos.pow(i);
				cont++;
				dos=dos.add(uno);
			}
		}

		for(int x=0; x<array.length;x++){
			for(int j=1;j+x<array.length;j++){
				int res=array[x].compareTo(array[x+j]);
				if(res==0){ 
					cont--;
					System.out.println("salto!");

					break;
				}
			}

		}
		System.out.println(cont);

	}

}
