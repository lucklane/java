
public class Exam2 {
	public static void main(String[] args) {
		int r = 100;
		System.out.println(r);
		
		r = 200;
		System.out.println(r);
		
		final double pi = 3.14;
		System.out.println(pi);
		
		double result = 2 * pi * r;  // 원의 둘레 계산
		System.out.println(result);
		
		//pi = 30.14;  // error 발생
		System.out.println(pi);
		
		result = 2 * pi * r;  // 원의 둘레 계산
		System.out.println(result);
	}
}
