import java.util.Scanner;

public class Calculator {
	
	public static int getfirstvalue(Scanner scanner) {
		System.out.println("첫번째 값을 입력해 주세요:");
		return scanner.nextInt();
	}

	public static String getsymbol(Scanner scanner) {
		System.out.println("연산자 입력해 주세요:");
		return scanner.next();
	}

	public static int getsecondvalue(Scanner scanner) {
		System.out.println("두번째 값을 입력해 주세요:");
		return scanner.nextInt();
	}
	
	public static int calculate(int first, String symbol, int second){
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
		}
		else if(symbol.equals("-")) {
			result = first - second;
		}
		else if(symbol.equals("*")) {
			result = first * second;
		}
		else if(symbol.equals("/")) {
			result = first / second;
		}
		else {
			System.out.println("연산자가 아닙니다");
			result = first;
		}
		
		return result;
		
	}
	
	public static void print(int result) {
		System.out.println("연산 결과는 :"+ result);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = getfirstvalue(scanner);
		
		int result = first;
		while(true) {
			
			String symbol = getsymbol(scanner);
			
			if(symbol.equals("quit")) {
				System.out.println("최종결과 값은: " + result);
				break;
			}
			
			int second = getsecondvalue(scanner);

			result = calculate(result, symbol, second);
			
			print(result);			
		}
	}
}
