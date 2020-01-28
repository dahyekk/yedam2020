import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int d;
		System.out.println("점수를입력하시오!");
		d = scn.nextInt();
		if(d==100){
			System.out.println("A+");
		}else if(d >=90) {
			System.out.println("A");
		}else if (d >=80) {
			System.out.println("B");
		}else if (d >=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}
}
