import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("첫번째 값을 입력해 주세요:");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println(first);
		
		int result = first;
		while(true) {
			
			System.out.println("연산 입력해 주세요:");
			String symbol = scanner.next();
			System.out.println(symbol);
			
			if(symbol.equals("quit")) {
				System.out.println("최종결과 값은: " + result);
				break;
			}
			
			System.out.println("두번째 값을 입력해 주세요:");
			int second = scanner.nextInt();

			if(symbol.equals("+")) {
				result = result + second;
				System.out.println("연산결과:"+ result);
			}
			else if(symbol.equals("-")) {
				result = result - second;
				System.out.println("연산결과:"+ result);
			}
			else if(symbol.equals("*")) {
				result = result * second;
				System.out.println("연산결과:"+ result);
			}
			else if(symbol.equals("/")) {
				result = result /second;
				System.out.println("연산결과:"+ result);
			}
			else {
				System.out.println("연산자가 아닙니다");
			}
			
		}
	}
}
