package practiceTest;

public class Casting {

	public static void main(String[] args) {
		
		Casting cast = new Casting();
		cast.cut(12.7f);
		
	}
	
	int cut(float x) {
		
		System.out.println( (int)x );
		
		return ( (int)x );
		
	
		
	}
	
}
