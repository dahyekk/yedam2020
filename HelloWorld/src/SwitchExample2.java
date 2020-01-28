
public class SwitchExample2 {
	public static void main(String[] args) {
		int grade = 90;
		if (grade >=90) {
			System.out.println("A");
		}else if (grade >=80) {
			System.out.println("B");
		}else if (grade >=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		// switch 문으로 변경
		grade = grade/10;
		switch(grade) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		if (grade == 10) {
			System.out.println("A+");
		}else if (grade >=9) {
			System.out.println("A");
		}else if (grade >=8) {
			System.out.println("B");
		}else if (grade >=7) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}

	}
}
