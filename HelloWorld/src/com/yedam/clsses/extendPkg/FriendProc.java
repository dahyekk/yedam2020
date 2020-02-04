package com.yedam.clsses.extendPkg;
import java.util.Scanner;

public class FriendProc {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	public Friend getFriend(String findName) {
		Friend friend = null;
		for (Friend f : friends) {
			if( f!=null && f.getName().equals(findName)) {
				friend = f;
			}
		}
		return friend;
	}
	
	public void addFriend() { //입력메소드
		//1) 대학친구 2)회사친구 3)그외친구들
		System.out.println(" 1.대학친구 2.회사친구 3.그외");
		int subMenu = scn.nextInt();scn.nextLine();
		System.out.println("이름 입력 :");
		String name = scn.nextLine();
		System.out.println("번호 입력 :");
		String phone = scn.nextLine();
		Friend friend = null;
		if(subMenu == 1) {
			System.out.println("학교 입력 :");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ);
		}else if (subMenu == 2) {
			System.out.println("회사 입력 :");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);
		}else {//그외
			friend = new Friend(name, phone);			
		}
		for(int i = 0; i <friends.length; i++) {
			if(friends[i] ==null) {
				friends[i] = friend;
				break;
			}
		}
	}
	public void listFriend() {	//리스트
		//friends배열의 크기만큼 돈다.
		for (Friend friend : friends) { 
			if(friend != null) {
				friend.shoInfo();
			}
		}
	}
	public void updateFriend() {	//수정
		System.out.println("찾을 이름 입력 : ");
		String name = scn.nextLine();
		Friend f = getFriend (name);
		if(f==null) {
			System.out.println("조회결과없음.");
//			return;	 메소드 끝내겠다. 밑에꺼 무시
		}else {
			System.out.println("수정할 번호를 입력해주세요");
			String phone = scn.nextLine();
			f.setPhone(phone);
			System.out.println("수정완료");
		}
	}
	public void removeFriend(String name) {
		boolean isExit = false;
		for(int i = 0; i <friends.length; i++) {
			if(friends[i]!= null && friends[i].getName().equals(name)) {
				friends[i]=null;
				isExit = true;
			}			
		}
		if(isExit) {
			System.out.println("삭제완료");
		}else {
			System.out.println("해당조건의 값이 없습니다.");
		}
		
	}
	public void delFriend() {	//삭제
		System.out.println("찾을 이름 입력 : ");
		String name = scn.nextLine();
		removeFriend(name);
	}
	public void exec() {
		boolean run = true;
		while(run) {
			System.out.println("===================================");
			System.out.println("1.입력 2.리스트 3.수정 4.삭제 9.종료");
			System.out.println("===================================");
			System.out.println("메뉴선택 >");
			int menu = scn.nextInt(); scn.nextLine();
			switch(menu) {
			case 1:			//입력
				addFriend();
				break;
			case 2:			//리스트
				listFriend();
				break;
			case 3:			//수정
				updateFriend();
				break;
			case 4:			//삭제
				delFriend();
				break;
			case 9:
				run = false;
				break;			
			}
		}
		System.out.println("프로그램 종료");
	}
}
