import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("첫번째 값을 입력해 주세요:");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println(first);
		System.out.println("두번째 값을 입력해 주세요:");
		int second = scanner.nextInt();
		System.out.println(second);
		System.out.println("=>"+ first+" * "+second +" :" + (first*second));
		
	}
}
