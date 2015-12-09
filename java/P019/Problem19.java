package euler;

public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int d=1;
		int num=0;
		for(int i= 1901; i<2000; i++){
		
			for(int e=1;e<32;e++){ //enero
				if(e==1 & d==7) num=num+1;
				d=d+1;
				if(d==8) d=1;
			}
			int f;
			if(i%4==0){
				if(i%100==0){
					if(i%400==0) {
						f=29; break;
					}else{
						f=28;
						break;
					}
				}
				f=29;	
			}else{ f=28;
			}
			for(int e=1;e<f+1;e++){//febrero
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//marzo
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<31;e++){//abril
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//mayo
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<31;e++){//junio
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//julio
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//agosto
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<31;e++){ //septiembre
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//octubre
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<31;e++){//noviembre
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}
			for(int e=1;e<32;e++){//diciembre
				if(e==1 & d==7) num++;
				d++;
				if(d==8) d=1;
			}

		}

		System.out.println("Resultado= " +num);
	}

}
