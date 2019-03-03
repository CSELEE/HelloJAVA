package Controller;

class HighFriend extends Friend{

	String work;
	
	public HighFriend(String name, String phone, String address, String work) {
		super(name, phone, address);
		this.work = work;
	}
	
	public void showDetailDate() {
		super.showDetailData();
		System.out.print("직업:" + work);
	}

	public void showBasicData() {
		System.out.print(" 이름:" + name);
		System.out.print(" 전화번호:" + phoneNumber);
	}
	
}
