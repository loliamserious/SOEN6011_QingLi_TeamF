package TangentFunction;

/**
 * F2_tan(x)
 * @author Qing Li  SID:40082701
 *
 */


public class TangentFunction {
	
	public TangentFunction() {
		
	}
	
	public static double pwr(double x, int n)
	{
		int i = 0;
		double powers = 1;
		
		if(n == 0){
			return 1;
		}
		
		for(i = 1; i <= n; i++){
			powers = powers * x;
		}
		
		return powers;
	}
	
	
	public static double fac(int n)
	{
		int i = 0;
		double pdt = 1;
		
		if(n == 0 || n == 1){
			return 1; 
		}
		
		for(i = 2; i <= n; i++){
			pdt = pdt * i;
		}
		
		return pdt;
	}
	
	
	public String tangent(String line) 
	{
		int k = 0, i = 0, j = 0, cons = 1;
		double x = 0;
		double s = 0, c = 0, sin = 0, cos = 0, tan = 0, y=0;
		double pi = 3.1415926;
		String msg;
		
		//error handling
		if(line.isEmpty()) {
			msg= "Error Input: Empty input!";
			return msg;
		}
				
		for(int n=0;n<line.length();n++) {
			if((int)line.charAt(n)<48||(int)line.charAt(n)>57) {
				msg="Error Input: This is not a real number, you should input a real number!";
				return msg;
			}
		}
				
		y=Double.valueOf(line);
		
		//error handling
		if(y%90==0) {
			msg="Error: The value for tan(x) where x=¦Ð/2+k¦Ð(for all integer k) is not existing!";
			return msg;
		}
		
		x = y*pi/180;
		
		for(k = 1; k <= 24; k++){
			i = 2 * k - 1;
			j = 2 * k - 2;
			s = cons*pwr(x,i)/fac(i);
			c = cons*pwr(x,j)/fac(j);
			cons = -1*cons;
			sin = sin + s;
			cos = cos + c;
	    }
		
	    tan = sin/cos;
	    msg="tan("+(float)y+")= "+String.format("%.6f", tan);
	    return msg;
	} 
}
