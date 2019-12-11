
public class EX1Class {

	public static void main(String[] args) {
		// Sum Digits
		int num = MyConsole.readInt("Write your number: ");
		int sum = 0;
		int tmp2 = 0;

		while(num > 0) {
			tmp2 = num;
			while (tmp2 > 0) {
				sum += tmp2 % 10;
				tmp2 /= 10;
			}
			if(sum > 9) {
				num = sum;
				sum = 0;
			}else {
				tmp2 = 0;
				num = 0;
			}
		}
		System.out.println("SumDigits is "+sum);
		// SquareSum Digits code
		boolean ans = false;
		int numTwo = (int)MyConsole.readDouble("Write your second number: ");
		int sumsquare = 0;
		int x = 0 ;
		while (x != 1 && x != 4) {
			while (numTwo > 0) {
				sumsquare += (Math.pow(numTwo%10, 2));
				numTwo /= 10;
				x = sumsquare;
			}
			numTwo = sumsquare ;
			sumsquare = 0;

		}
		if (x == 1) 
			ans = true;

		System.out.println("SquareSumDigits is " +ans);

		// Check palindrom number
		int a = MyConsole.readInt("Check if it Palindrom: ");
		int oppo=0 ,tmp1 = 0; 
		int origin = a;
		while (a > 0) {
			tmp1 = a%10;
			oppo = (oppo*10)+tmp1 ;
			a /= 10;
		}
		if (origin == oppo) 
			System.out.println("The number is palindrom");
		else 
			System.out.println("False");

		// Jusephus problem Code
		int p,q;
		p=0;
		q = MyConsole.readInt("Write your josephus number: "); 
		for (int i = 1   ;     ((Math.pow(2,i)<=q))   ; i++ ) {
			p=  (int) Math.pow(2,i); 	
		}
		System.out.println("The winning number is: "+((q-p)*2+1));
	}

}







