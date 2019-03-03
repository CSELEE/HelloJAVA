package Inheritance;

class Gun {
	
	int bulletNum;
	
	public Gun(int bulletNum) {
		this.bulletNum = bulletNum;
	}
	
	public void shot() {
		System.out.println("Bang Bang Bang!");
		bulletNum--;
	}
}


class PoliceMan{
	
	int handCuffs;
	Gun pistol;
	
	public PoliceMan(int bnum, int bcuff) {
		handCuffs = bcuff;
		if(bnum != 0) pistol = new Gun(bnum);
		else pistol = null;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!");
		handCuffs--;
	}
	
	public void shot() {
		if (pistol == null) System.out.println("HUT BANG!");
		else pistol.shot();
	}
	

}



public class HasComposite {
	
	
	public static void main(String args[]) {
		
		PoliceMan police = new PoliceMan(3, 5);
		police.shot();
		police.putHandcuff();
		
		PoliceMan haveNoItem = new PoliceMan(0,3);
		haveNoItem.shot();
	}

}
