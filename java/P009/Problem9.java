package euler;

public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<500;a++){
			for(int b=500;b>0;b--){
				int sum=1000-a-b;
				if(a*a+b*b==sum*sum){
					int c=1000-a-b;
					System.out.println("Solution-> a= " + a +
							",b= "+ b + ", c= " +c );
					System.out.println("Mul= "+b*c*a);
					
					System.exit(0);
					}
				
			}
		}
	}

}
