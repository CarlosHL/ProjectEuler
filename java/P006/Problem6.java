package euler;

public class Problem6 {

	/**
	 * @param args
	 * (a+b)^2=a^2+b^2+2ab
	 * (a+b+c)^2=a^2+b^2+c^2+2ab+2ac+2bc
	 * Quitamos la parte a restar, suma de cuadrados
	 *  1^2+2^2+...+100^2 de la suma de numeros al cuadrado
	 * Nos queda 2ab+2ac+2ad...->2(ab+ac+ad...)
	 * para ello hacemos el sumatorio de 1 multiplicado por 
	 * los otros 99 numeros= 1*2+1*3+...+1*100,
	 *  después con el 2 a partir de éste 2*3+2*4+...*2*100, y así hasta 100
	 *  hacemos el sumatorio de todos estos sumatorios, y lo multiplicamos por 2
	 */
	public static void main(String[] args) {
		int num[] = new int [100];
		for (int i=0; i<100;i++){
			num[i]=i+1; //array que guarda todos los numeros de 1-100	 
		}
		long sumatorio=0L;
		for(int n=0; n<100; n++){
			for(int j=n+1; j<100; j++){
				sumatorio=sumatorio+num[n]*num[j];
			}
		}
		sumatorio=sumatorio*2;
		System.out.println(sumatorio);
	}

}
