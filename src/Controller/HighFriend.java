package Controller;

class HighFriend extends Friend{

	String work;
	
	public HighFriend(String name, String phone, String address, String work) {
		super(name, phone, address);
		this.work = work;
	}
	
	public void showDetailDate() {
		super.showDetailData();
		System.out.print("����:" + work);
	}

	public void showBasicData() {
		System.out.print(" �̸�:" + name);
		System.out.print(" ��ȭ��ȣ:" + phoneNumber);
	}
	
}
