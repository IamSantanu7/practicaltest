package classwork;

public class Example1 {

	public static void main(String[] args) {
		
		int sum = 0;   // initial value of sum is 0
		
		for(int i = 25; i<=51; i++){
			if(i%2 == 0){
				sum = sum + i;  // updated sum value
			}
		}
		System.out.println("Sum of even numbers between 25 to 51 is "+sum);
	}

}
