package Controller;

class UnivFriend extends Friend {

	private String major;
	
	public UnivFriend(String name, String phone, String address, String major) {
		super(name, phone, address);
		this.major = major;
	}
	
	public void showDetailDate() {
		super.showDetailData();
		System.out.print("����:" + major);
	}

	public void showBasicData() {
		System.out.print(" �̸�:" + name);
	    System.out.print(" ��ȭ��ȣ:" + phoneNumber);
		System.out.print(" ����:" + major);
	}
	
}

