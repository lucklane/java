
public class Exam5 {
	public static void main(String[] args) {
		// 후위 연산
		int a1 = 100, x1 = 1;
		int y1 = a1 + x1++;
		System.out.println(x1);
		System.out.println(y1);
		System.out.println("-----------");
		
		// 전위 연산
		int a2 = 100, x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println(x2);
		System.out.println(y2);
		System.out.println("-----------");
		
	}
}
