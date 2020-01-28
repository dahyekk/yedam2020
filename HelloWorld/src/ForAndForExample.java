
public class ForAndForExample {
	public static void main(String[] args) {
		for (int i = 1; i <=9 ; i++) {
			for (int j = 2; j<=9; j++) {
				//out.print -> 줄바꾸기 없음
				System.out.print(j+" * "+i+" = "+i*j+"    ");
			}
			System.out.println();
		}
	}
}
