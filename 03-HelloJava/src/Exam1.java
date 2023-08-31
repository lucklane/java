// 한줄 주석 : 한 줄 메모하는 것

/* 여러줄 주석 : 여러 줄 메모하는 것
   1. 주석의 용도
     1) 메모
     2) 명령어를 삭제하지 않고 실행되지 않도록 함
 */

/** 여러줄 주석 : 여러 줄 메모하는 것
 
 */

public class Exam1 {
	// 메인 함수
	public static void main(String[] args) {
		// 1. println : 데이터를 모니터에 출력하고 1줄 넘김을 함
		System.out.println(5);  // 정수
		System.out.println(5.5);  // 실수
		System.out.println('A');  // 문자
		System.out.println("Hello world");  // 문자열
		System.out.println(true);  // boolean 값
		System.out.println("-----------");  // 보기 좋으라고 밑줄 출력

		// 2. print : 데이터를 모니터에 출력하고 1줄 넘김이 없음
		System.out.print(5);  // 정수
		System.out.print(5.5);  // 실수
		System.out.print('A');  // 문자
		System.out.print("Hello world");  // 문자열
		System.out.print(true);  // boolean 값
		System.out.println("-----------");  // 보기 좋으라고 밑줄 출력
		
		// 3. printf : 서식문자를 사용해서 문자열을 만든 후 출력
		// %d(정수)  %f(실수)  %c(문자)  %s(문자열)  %b(boolean값)
		// %자리수.소수점자리수f
		System.out.printf("%d %f %c %s %b", 5, 5.5, 'A', "Hello", true);
		System.out.println("-----------");  // 보기 좋으라고 밑줄 출력
		System.out.printf("%d %.1f %c %s %b", 5, 5.5, 'A', "Hello", true);
		System.out.println("-----------");  // 보기 좋으라고 밑줄 출력
		System.out.printf("%10d %10.1f %10c %10s %10b", 5, 5.5, 'A', "Hello", true);
		System.out.println("-----------");  // 보기 좋으라고 밑줄 출력
	}
}



