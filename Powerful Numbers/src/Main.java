
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 for(int i = 1; i < 1000;++i){
				 if(powerful(i)){
					 System.out.print(i + ", ");
				 }
			 }
	}

	
	
	public static boolean powerful(int m){
		
		double log2M = Math.log(m) / Math.log(2);
		int log2mint = (int)(Math.log(m) / Math.log(2));
		
		if((Math.sqrt(m) - (int)Math.sqrt(m)) < .0000001){
			// perfect square
			return true;
		}else if ((Math.cbrt(m) - (int)Math.cbrt(m)) < .0000001){
			// perfect cubed root
			return true;
		}else if(Math.abs(log2M - log2mint) < .0000001){
			// same number raised both times to 2 and 3
			return true;
		}else if(Math.abs(Math.pow(log2mint-2, 2)*Math.pow(2, 3) - m) < .00000001){
			return true;
		}else if(Math.abs(Math.pow(2, 2)*Math.pow(log2mint-2, 3) - m) < .00000001){
			return true;
		}else{
			return false;
		}
	}
}
