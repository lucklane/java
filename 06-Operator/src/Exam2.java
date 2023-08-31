public class Exam2 {
	public static void main(String[] args) {
		//  정수의 나눗셈 : 정수
		System.out.println("<실행 결과>");
		int a = 7, b=3;
		int result1 = a/b;
		System.out.println(result1);
		System.out.println("----------");
		// 실수의 나눗셈 : 실수
		double c = 7.0, d = 3.0;
		double result2 = c/d;
		System.out.println(result2);
		System.out.println("----------");
		// 정수와 실수의 나눗셈 : 실수
		double result3 = c/b;
		System.out.println(result3);
		System.out.println("----------");
		
		// 0으로 나누기
		//System.out.println(5/0); // error 발생
		System.out.println(5/0);
		//System.out.println(5/0.0); // 무제한으로 계산
		System.out.println(5/0.0);
	}
}
