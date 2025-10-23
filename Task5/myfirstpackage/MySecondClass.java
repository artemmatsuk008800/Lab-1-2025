package myfirstpackage;

public class MySecondClass {
	private int firstVal;
	private int secondVal;

	public MySecondClass(int firstVal, int secondVal) {
		this.firstVal = firstVal;
		this.secondVal = secondVal;
	}
	
	public int getfirstVal() {
		return firstVal;
	}

	public int getsecondVal() {
		return secondVal;
	}

	public void setfirstVal(int firstVal) {
		this.firstVal = firstVal;
	}

	public void setsecondVal(int secondVal) {
		this.secondVal = secondVal;
	}

	public int sumVal() {
		return firstVal + secondVal;
	}
}