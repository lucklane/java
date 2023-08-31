// 대입 연산자
//  = : 변수에 데이터를 저장하는 명려어
// 		산술연산자와 결합해서 사용할 수 있음
// 		+= -= *= /= %=
public class Exam3 {
	public static void main(String[] args) {
		int ss= 100;
		
		ss += 100; //ss = ss + 100;
		System.out.println(ss);
		System.out.println("------------");
		
		ss -= 100; //ss = ss - 100;
		System.out.println(ss);
		System.out.println("------------");
		
		ss *= 100; //ss = ss * 100;
		System.out.println(ss);
		System.out.println("------------");
		
		ss /= 100; //ss = ss / 100;
		System.out.println(ss);
		System.out.println("------------");
		
		ss %= 100; //ss = ss % 100;
		System.out.println(ss);
		System.out.println("------------");
	}
}
