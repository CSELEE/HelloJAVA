package Controller;

import java.util.Scanner;

class FriendInfoHandler {
	
	private Friend[] myFriends;
	private int numberOfFriends;
	
	public FriendInfoHandler(int numbOfFriend) {
		myFriends = new Friend[numbOfFriend];
		this.numberOfFriends = 0;
	}
	
	public void addFriendInfo(Friend friend) {
		myFriends[numberOfFriends++] = friend;
	}
	
	public void addFriend(int choice) {
		
		String name, phone, address, work, major;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: "); name = sc.nextLine();
		System.out.println("전화번호 : "); phone = sc.nextLine();
		System.out.println("주소: "); address = sc.nextLine();
		
		//add HighSchool Friend
		if (choice == 1) {
			System.out.println("직업: "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name,phone,address,work));
			
		}
		
		//add University Friend
		else {
			System.out.println("전공: "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name,phone,address,major));
		}
		
		System.out.println(" ");
		System.out.println("친구의 정보를 저장하였습니다!");
		System.out.println(" ");
		
	}
	
	
	public void showDetailDatas() {
		for(int i=0; i<numberOfFriends; i++) 
		{
			myFriends[i].showDetailData();
			System.out.println("");
		}
	}
	
	public void showBasicDatas() {
		for(int i=0; i<numberOfFriends; i++) 
		{
			myFriends[i].showBasicData();
			System.out.println("");
		}
	}
	
	
	

	public static void main(String args[]) {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		
		while(true) {
			
			int choice;
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("<*****친구정보저장 시스템*****>");
			System.out.println("1. 고교 친구정보 등록하기");
			System.out.println("2. 대학 친구정보 등록하기");
			System.out.println("3. 세부정보 확인");
			System.out.println("4. 간단정보 확인");
			System.out.println("5. 종료");
			System.out.print("선택>> ");
			
			choice = sc.nextInt();
		
			switch (choice) {
				case 1: case 2:
					handler.addFriend(choice);
					break;
				case 3:
					handler.showDetailDatas();
					break;
				case 4:
					handler.showBasicDatas();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
			
		}
		
	
	}

}
