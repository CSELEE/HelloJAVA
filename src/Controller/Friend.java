package Controller;

class Friend {
	
	public String name;
	public String phoneNumber;
	public String address;
	
	public Friend(String name, String phone, String address) {
		this.name = name;
		this.phoneNumber = phone;
		this.address = address;
	}
	
	
	public void showDetailData(){
		System.out.println("�̸�:" + name);
		System.out.println("��ȭ��ȣ:" + phoneNumber);
		System.out.println("�ּ�:" + address);
	}
	
	public void showBasicData() {}
	
	
}
