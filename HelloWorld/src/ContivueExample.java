
public class ContivueExample {
	public static void main(String[] args) {
		for (int i = 0; i <10; i++) {
			if (i%3 ==0) //continue 는 조건에 만족하면 밑에 생략.
				continue;
			System.out.println(("i => "+ i));
		}
	}

}
