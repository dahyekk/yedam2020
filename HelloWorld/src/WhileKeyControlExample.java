import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0, keyCode = 0;
		
		while (run) {
			if (keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------------");
				System.out.println(" ↑.증속  |  ↓.감속  | esc.중지");
				System.out.println("------------------------------------");
				System.out.println("선택");
			}
			//키보드의 키코드 읽어옴
			
			keyCode=(int)(System.in.read());
			
			System.out.println(keyCode);
			if(keyCode == 49) { //1눌렀을 때
				speed= speed+10;
				System.out.println("현재속도 : "+speed);
			}else if (keyCode == 50) { //2
				speed--;
				System.out.println("현재속도 : "+speed);
			}else if (keyCode == 51) {//3
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
