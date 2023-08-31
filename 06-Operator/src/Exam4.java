// 증감 연산자
// ++ --
// 변수값을 1 중가 또는 감소 시키는 명령어
// 우선순위가 2개이다
// 변수++ : 제일 꼴지 우선순위
public class Exam4 {
	public static void main(String[] args) {
		int a = 0;
		
		// 변수값 1 중가
		a =  a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		System.out.println("--------------");
		
		// 변수값 1 감소
		a =  a - 1;
		System.out.println(a);
		a -= 1;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		System.out.println("--------------");
	}
}
