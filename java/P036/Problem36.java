package euler;
import list.doublelink.*;

public class Problem36  extends DList<Long>{

	static DList<Character> numberList= new DList<Character>();

	public Problem36(long number){
		while(number>0){
			addLast(number%10);
			number=number/10;
		}
	}


	public boolean isPalyndrome(){
		DNode <Long> nodeIzq= getHeader().getNextNode();
		DNode <Long> nodeDrcha= getTrailer().getPreviousNode();
		int i=0;
		int size=getSize();

		while(nodeIzq!=nodeDrcha && i<=size/2){
			if(!nodeIzq.getElement().equals(nodeDrcha.getElement())){
				return false;
			}
			nodeIzq=nodeIzq.getNextNode();
			nodeDrcha=nodeDrcha.getPreviousNode();

			i++;
		}
		return true;
	}

	public static boolean isPalyndromeString(String sWord){
		DList<Character> numberList= new DList<Character>();
		if(sWord==null || sWord.length()==0){
			System.out.println("No has introducido ninguna palabra");
			return false;
		}
		char aCaracteres []=sWord.toCharArray();
		for(int i=0; i<aCaracteres.length;i++){
			numberList.addFirst(new Character(aCaracteres[i]));
		}
		DNode<Character> nodeIzq= numberList.getHeader().getNextNode();
		DNode <Character> nodeDrcha= numberList.getTrailer().getPreviousNode();
		int i=0;
		int size=numberList.getSize();

		while(nodeIzq!=nodeDrcha && i<=size/2){
			if(!nodeIzq.getElement().equals(nodeDrcha.getElement())){
				return false;
			}
			nodeIzq=nodeIzq.getNextNode();
			nodeDrcha=nodeDrcha.getPreviousNode();

			i++;
		}
		return true;
	}

	public static String toBinary(long n){
		String x=Long.toBinaryString(n);
		return x;
	}


	public static void main(String[] args) {



		try{
			long sumatorio=0L;
			for(long i=1L;i<1000000;i++){
				Problem36 oProb= new Problem36(i);
				if(oProb.isPalyndrome()==true){
					if(isPalyndromeString(toBinary(i))==true){
						sumatorio=sumatorio+i;
					}

				}
			}

			System.out.println(sumatorio);
		}catch(Exception e){
			System.out.println("Error" +e.getMessage());
		}
	}

}
