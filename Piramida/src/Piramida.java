
public class Piramida {
	private int n;
	
	public Piramida(int n) {
		this.n = n;
	}
	
	public void creare() {
		for (int i = 1; i<=n; i++) {
			for (int x = i; x<=n; x++) {
				System.out.print(i);
			}
			if (i == n) {
				System.out.print(" --> n");
			}
			else {
				System.out.print("\n");
			}
			
		}
		
	}
}
