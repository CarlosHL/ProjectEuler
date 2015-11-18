package euler;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=998001;i>10000;i--){
			if(i>99999){
				int pal[] = new int[6];
				int n=i;
				int contador=5;
				while(n>0){
					pal[contador--] = n % 10;
					n/=10;
				}
				if(pal[0]==pal[5]&&pal[1]==pal[4]&&pal[2]==pal[3]){
					for(int j=100;j<1000;j++){
						if(i%j==0 && (i/j)<999 && (i/j)>100){
							System.out.println("Solucion: "+ i);	
							System.exit(0);
						}
					}
				}
			}else{
				int pal[] = new int[5];
				int n=i;
				int contador=4;
				while(n>0){
					pal[contador--] = n % 10;
					n/=10;
				}
				if(pal[0]==pal[4]&&pal[1]==pal[3]){
					for(int j=100;j<1000;j++){
						if(i%j==0 && (i/j)<999 && (i/j)>100){
							System.out.println("Solucion: "+i);
							System.exit(0);
						}
					}
				}

			}

		}

	}

}
