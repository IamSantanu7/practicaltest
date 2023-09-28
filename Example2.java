package classwork;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator (+ or - or * or /): ");
		
		// taking a character input from user
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter two integer numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		switch(operator){
        case '+':
            System.out.println("addition result: "+ (num1+num2));
            break;
        case '-':
        	System.out.println("subtraction result: "+ (num1-num2));
            break;
        case '*':
        	System.out.println("multiplication result: "+ (num1*num2));
            break;
        case '/':
        	System.out.println("division result: "+ (num1/num2));
            break;
        default:
        	System.out.println("please enter correct operator!");
    }
	}

}
