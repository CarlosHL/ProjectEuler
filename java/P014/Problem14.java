package euler;

import apoyo.ParejaNum14;

public class Problem14 {


	public static void main(String[] args) {
		ParejaNum14 Pareja = new ParejaNum14(1, 1);

		for(long i=999167L; i>500000;i--){
			int rep=0;
			long n=i;
			while(n!=1){
				if(n%2==0){
					n=n/2;
				}else{
					n=3*n+1;
				}
				rep++;
			}
			if(rep>Pareja.getRepeticione()){
				Pareja.setNumero(i);
				Pareja.setRepeticiones(rep);
			}

		}
		System.out.println("Numero "+Pareja.getNumero() + ", "
				+ "repeticiones "+Pareja.getRepeticione());
	}

}


