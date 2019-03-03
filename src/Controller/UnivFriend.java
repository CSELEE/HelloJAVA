package Controller;

class UnivFriend extends Friend {

	private String major;
	
	public UnivFriend(String name, String phone, String address, String major) {
		super(name, phone, address);
		this.major = major;
	}
	
	public void showDetailDate() {
		super.showDetailData();
		System.out.print("전공 :" + major);
	}

	public void showBasicData() {
		System.out.print(" 이름:" + name);
	    System.out.print(" 전화번호:" + phoneNumber);
		System.out.print(" 전공:" + major);
	}
	
}

