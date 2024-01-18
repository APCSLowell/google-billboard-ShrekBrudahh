

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		double ans = 0;
		for (int i = 0; i <= (e.length()-11); i++){
		       String digits;
		       double parseD = 0;
		       if (i < 1){
		         digits = e.substring(i,i+11);
		         digits = digits.substring(0,digits.indexOf(".")) + digits.substring(digits.indexOf(".")+1, (digits.length() - digits.indexOf(".") + 1));
		         parseD = Double.parseDouble(digits);
		       }else if (i >= 2){
		         digits = e.substring(i,i+10);
		         parseD = Double.parseDouble(digits);
		       }
		       if (isPrime(parseD)){
			  ans = parseD;     
		          break;
		       }
   		}
		System.out.println(ans);
	}
	
	public static boolean isPrime(double dNum) {   
	    if (dNum < 2){
	      return false;
	    }else{
	      for (int i = 2; i <= Math.sqrt(dNum); i++){
	        if (dNum%i == 0){
	          return false;
	        }
	      }
	    }
	    return true;  
	} 

}

