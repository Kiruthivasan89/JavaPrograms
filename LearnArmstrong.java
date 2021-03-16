package week1.day2;

public class LearnArmstrong {

	public static void main(String[] args) {
		
		
		int a=154; 
		int calculated=0;
				int r;
				int original=a;
		
		while(a>0) {
			
			r=a%10;
			a= a/10;
			calculated= calculated+(r*r*r);
		}
		
		if(calculated==original) {
			
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
			
		}
			
	}
	
	
}
