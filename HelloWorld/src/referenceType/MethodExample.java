package referenceType;

public class MethodExample {
	public static void main(String[] args) {
		int num1, num2;
		int result;
		
		num1 = 10;
		num2 = 20;
		result = (num1 + num2)*3;
		System.out.println("결과값은 : "+ result);
		multiAfterSum(num1,num2);
		int a1 = 3;
		int b1 = 4;
		multiAfterSum(a1,b1);
		double a2 = 2.2;
		double b2 = 2.2;
		multiAfterSum(a2,b2);
	}
	//메소드
	public static void multiAfterSum(int a, int b) {
		int n1, n2,rslt;
		n1 = a;
		n2 = b;
		rslt = (n1+n2)*3;
		System.out.println("결과값은 : "+rslt);
	}
	public static void multiAfterSum(double a, double b) {
		double n1, n2,rslt;
		n1 = a;
		n2 = b;
		rslt = (n1+n2)*3;
		System.out.println("결과값은 : "+rslt);
	}
}
