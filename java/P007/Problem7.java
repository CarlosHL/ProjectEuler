package euler;

import list.IList;
import list.singlelink.SList;

public class Problem7 {

	/**
	 * Old solution: 104743 Time: 35 min
	 * @param args
	 */
	//static int cont=1;
	static IList<Integer> list = new SList<Integer>();


	public static void main(String[] args) {
		long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecuci—n
		TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenam

		int num=3;
		list.addFirst(2);

		for(int i=2;i<10002;){

			if(isPrime(num)==true){
				list.addLast(num);
				//System.out.println("A–adido "+ list.getLast() +" en posicion " + i);
				i++;
			}


			num=num+2;
		}
		System.out.println("El numero buscado es: " + list.getLast());
		TFin = System.currentTimeMillis(); //Tomamos la hora en que finaliz— el algoritmo y la almacenamos en la variable T
		tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		System.out.println("Tiempo de ejecuci—n en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecuci—n en milisegundos

	}

	public static boolean isPrime(int num){
		boolean prime=true;
		for(int j=0; list.getAt(j)*list.getAt(j)<=num; j++){
			if(num%list.getAt(j)==0){
				prime=false;
				break;
			}
		}
		return prime;
	}

}
