package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {

int input=198, sum=0;

while(input>0) {
	
	int r=input%10; // 1. 123%10=3 2. 12%10=2 3. 1%10
	
	sum=sum+r;  //1. 0+3=3 2. 3+2=5
	
	input=input/10; // 1. 123/10=12 2. 12/10=1
	
	
	
	
}
		System.out.println(sum);

	}

}
