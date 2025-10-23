class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(0, 0);
		int i, j;
		for (i = 1; i <= 8; i++) {
			for (j = 1; j <= 8; j++) {
				o.setfirstVal(i);
				o.setsecondVal(j);
				System.out.print(o.sumVal());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class MySecondClass {
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