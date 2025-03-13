
public class Main {

	public static void main(String[] args) {
		Sertar sertar1 = new Sertar(20, 50, 60);
		Sertar sertar2 = new Sertar(50, 70, 80);
		
		Birou birou = new Birou(sertar1, sertar2, 50, 80, 100);
		
		System.out.println(birou);

	}

}
