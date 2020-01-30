
public class whileAndWhileExample {
	public static void main(String[] args) {
		//while문으로 구구단 작성
		boolean run = true;
		int i = 2, j=1;
		while(run) {
			System.out.println(" * "+i+" 단 *");
			while(run) {
				System.out.println(i+" * "+j+" = "+ i*j);
				if(j >=9) {
					break;
				}
				j++;
			}
			j=1;
			if( i >= 9) {
				break;
			}
			i ++;
		}
	}
}
