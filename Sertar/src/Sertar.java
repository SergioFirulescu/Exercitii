
public class Sertar {

	public double l = 0;
	public double L = 0;
	public double H = 0;
	
	public Sertar(double l, double L, double H) {
		this.l = l;
		this.L = L;
		this.H = H;
		
	}
		
	public String toString() {
		return "Sertar: " + this.l + " " + this.L + " " + this.H;
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
