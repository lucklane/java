//  괸계 연산자
// 왼쪽값과 오른쪽값의 관계 따져서 식이 물으면 true, 물지 않으면 false
// < > <= >= == !=
// 5 < 3 : false
// 5 > 3 : true
//  관계 연산자는 단독으로는 사용되지 않고, 제어문과 결합해서 사용함
public class Exam6 {
	public static void main(String[] args) {
		System.out.println(5 < 3);
		System.out.println(5 > 3);
		System.out.println(5 <= 3);
		System.out.println(5 >= 3);
		System.out.println(5 == 3);	// 같은지 검사, 같으면 true 같지 않으면 false
		System.out.println(5 != 3); // 다른지 검사, 같으면 false 같지 않으면 true
	}

}
