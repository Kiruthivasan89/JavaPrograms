package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

   String name ="kiuthivasan";

char[] c=name.toCharArray();
		
for(int i=0;i<c.length;i++) {
	
	if(i%2!=0) {
		
		System.out.println(Character.toUpperCase(c[i]));
	}
	
	else {
	System.out.println(c[i]);
}
	

}

	}

}
