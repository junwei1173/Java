public class Song {
	public static void main(String[] args) {
		cat();
		hen();
		duck();
		goose();
		sheep();
		// custom horse verse
		horse();
		
	}
	
	public static void cat() {
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		catsounds();
	}
	
	public static void catsounds() {
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
	}
	
	public static void hen() {
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		hensoundsNmore();
		catsounds();
	}
	
	public static void hensoundsNmore() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");	
	}
	
	public static void duck() {
		System.out.println("Bought me a duck and the duck pleased me.");
		System.out.println("I fed my duck under yonder tree.");
		ducksoundsNmore();
		hensoundsNmore();
		catsounds();
	}
	
	public static void ducksoundsNmore() {
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void goose() {
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		goosesoundsNmore();
		ducksoundsNmore();
		hensoundsNmore();
		catsounds();
	}
	
	public static void goosesoundsNmore() {
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void sheep() {
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
		sheepsoundsNmore();
		goosesoundsNmore();
		ducksoundsNmore();
		hensoundsNmore();
		catsounds();
	}
	
	public static void sheepsoundsNmore() {
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void horse() {
		System.out.println("Bought me a horse and the horse pleased me,");
		System.out.println("I fed my horse under yonder tree.");
		horsesoundsNmore();
		sheepsoundsNmore();
		goosesoundsNmore();
		ducksoundsNmore();
		hensoundsNmore();
		catsounds();
	}
	
	public static void horsesoundsNmore() {
		System.out.println("Horse goes neigh, neigh,");
	}

}
