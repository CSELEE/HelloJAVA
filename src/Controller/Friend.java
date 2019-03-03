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
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("주소:" + address);
	}
	
	public void showBasicData() {}
	
	
}
