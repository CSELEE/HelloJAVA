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
		System.out.println("�̸� : "); name = sc.nextLine();
		System.out.println("��ȭ��ȣ : "); phone = sc.nextLine();
		System.out.println("�ּ�: "); address = sc.nextLine();
		
		//add HighSchool Friend
		if (choice == 1) {
			System.out.println("����: "); work = sc.nextLine();
			addFriendInfo(new HighFriend(name,phone,address,work));
			
		}
		
		//add University Friend
		else {
			System.out.println("����: "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name,phone,address,major));
		}
		System.out.println("���� �Է� �Ϸ�!");
		System.out.println("");
		
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
			
			System.out.println("<*****ģ����� ���α׷�*****>");
			System.out.println("1. �� ģ�� ����ϱ�");
			System.out.println("2. ���� ģ�� ����ϱ�");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ���� ���� ����");
			System.out.println("5. ����");
			System.out.print("����>> ");
			
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
					System.out.println("�ý����� �����մϴ�");
					return;
			}
			
		}
		
	
	}

}
