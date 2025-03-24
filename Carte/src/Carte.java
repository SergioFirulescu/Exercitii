
public class Carte {
	private int pagini;
	
	
	public Carte(int pagini) {
		this.pagini = pagini;
	}
	
	public String Comparare(Carte c) {
		String message;
		
		if (c.getPagini() > this.pagini) {
			int diferenta = c.getPagini() - this.pagini;
			message =  "Cartea Comparata este cu: " + diferenta + " pagini mai Mare";
		}
		else {
			if (c.getPagini() < this.pagini) {
				int diferenta = this.pagini - c.getPagini();
				message =  "Cartea Comparata este cu: " + diferenta + " pagini mai Mica";
			}
			else {
				message = "Numarul paginilor este egal";
			}
		}
		return message;
	}


	public int getPagini() {
		return pagini;
	}


	public void setPagini(int pagini) {
		this.pagini = pagini;
	}
	
	
}
