
public class Birou {
	
	Sertar ser1 = new Sertar(0,0,0);
	Sertar ser2 = new Sertar(0,0,0);
	
	public double l = 0;
	public double L = 0;
	public double H = 0;
	
	public Birou(Sertar ser1, Sertar ser2, double l, double L, double H) {
		this.ser1 = ser1;
		this.ser2 = ser2;
		this.l = l;
		this.l = L;
		this.H = H;
	}
	
	public String toString() {
		return this.ser1.toString() + " " + this.ser2.toString() + " \nBirou\nl: " + this.l + "\nL: " + this.l + "\nH: " + this.H;
	}

	public Sertar getSer1() {
		return ser1;
	}

	public void setSer1(Sertar ser1) {
		this.ser1 = ser1;
	}

	public Sertar getSer2() {
		return ser2;
	}

	public void setSer2(Sertar ser2) {
		this.ser2 = ser2;
	}

	public double getl() {
		return l;
	}

	public void setl(double l) {
		this.l = l;
	}

	public double getL() {
		return L;
	}

	public void setL(double l) {
		L = l;
	}

	public double getH() {
		return H;
	}

	public void setH(double h) {
		H = h;
	}
	
	
	
	
}
