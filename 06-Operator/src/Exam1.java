import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 변수만들기
		int num1, num2;
		
		// 2. 입력
	    System.out.println("<실행 결과>");
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		// 3. 연산
		// 4. 출력
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		// printf에서 % 문자를 출력하고 싶을 때는 %%
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);
	}
}
