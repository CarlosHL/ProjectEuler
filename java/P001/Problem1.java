package euler;

public class Problem1 {
	public static void main(String[] args) {
		int x=1000;
		int z=0;
		for(int i=0; i<1000;i++){
			if(i%3==0) z=z+i;
			else if(i%5==0)z=z+i;
		}
		System.out.println(z);
	}
}
